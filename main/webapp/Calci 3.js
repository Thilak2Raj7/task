/**
 * 
 */

var a = '';
var b = '';
var c = '';
var operator = '';
var number = 0;
var oper;
var performOper='';
var storeResult = '';
var storeInput = '';
var count = 0;
var inputStore = '';
var dotCount = 0;
var stringInput = '';
function display(number) {
	inputStore = document.getElementById('display2').value;
	document.getElementById('display2').value += number;


	if ((a != 0 || a == 0) && operator != '') {
		if (b.includes(".") && number == '.') {
			number = "";
			b += number;

			document.getElementById('display2').value = inputStore + number;

		}
		else {
			b += number;
			storeInput = document.getElementById('display2').value;
		}
	}


	else {


		if (a.includes(".") && number == '.') {
			number = "";
			a += number
			document.getElementById('display2').value = a;
		}
		else {
			a += number;
		}

	}
	

}









function doOperation(oper) {


	if (b != '-') {

		if (operator == '') {

			if (a != '') {


				operator = oper;
				document.getElementById(oper).style.background = 'green'
				document.getElementById('display2').value += operator;



			}
			else if (a == 0 && a == '') {


				a = 0;
				operator = oper;

				document.getElementById(oper).style.background = 'green'
				document.getElementById('display2').value = 0 + oper;
			}

		}

		else {


			document.getElementById(operator).style.background = '';
			document.getElementById(oper).style.background = 'green';
             


			if (operator == '-' && oper == '-') {
				b = oper;
				document.getElementById('display2').value += oper;

			}

			else {


				//storeInput+=storeResult+operator;
				if (oper == '-') {
					
					operator=oper;
					performOper=document.getElementById('display2').value
					document.getElementById('display2').value = inputStore+operator;


				}*/
				else {
					operator = oper;
					document.getElementById('display2').value += operator;
					b = '';

				}
			}
		}

	}
}

function preference() {

	var bodmasArray = [];
	var operatorStore = [];
	var operandsStore = [];
	var powerValue = '';
	var operatorCount = 0;
	var stringPreference = document.getElementById('display2').value;
	var storeArray = []
	storeArray = stringPreference.split('');
	for (var j = 0; j < storeArray.length; j++) {
		if (storeArray[j] == "-") {
			if (storeArray[j - 1] == "+" || storeArray[j - 1] == "-" || storeArray[j - 1] == "*" || storeArray[j - 1] == "/") {
				bodmasArray.push("-" + storeArray[++j]);
			}
			else {
				bodmasArray.push(storeArray[j]);
			}
		}
		else {
			bodmasArray.push(storeArray[j]);
		}
	}

	for (let i = 0; i < bodmasArray.length; i++) {



		if (!isNaN(bodmasArray[i]) || bodmasArray[i] == '.') {
			let stringStore = "";



			while (i < bodmasArray.length &&
				(!isNaN(bodmasArray[i]) || bodmasArray[i] == '.')) {
				stringStore = stringStore + bodmasArray[i];
				i++;
			}

			operandsStore.push(parseFloat(stringStore));


			i--;

		}
		else if (bodmasArray[i] == "√") {
			operandsStore.push(squareRootOfNumber(bodmasArray[i + 1]));
			i++;
		}

		else if (bodmasArray[i] == '(') {
			operatorStore.push(bodmasArray[i]);
		}


		else if (bodmasArray[i] == ')') {
			while (operatorStore[operatorStore.length - 1] != '(') {
				operandsStore.push(applyOperation(operatorStore.pop(),
					operandsStore.pop(),
					operandsStore.pop()));
			}
			operatorStore.pop();
		}

		else if (bodmasArray[i] == '+' ||
			bodmasArray[i] == '-' ||
			bodmasArray[i] == '*' ||
			bodmasArray[i] == '/' ||
			bodmasArray[i] == '^') {

			while (operatorStore.length > 0 &&
				hasPrecedence(bodmasArray[i],
					operatorStore[operatorStore.length - 1])) {

				operandsStore.push(applyOperation(operatorStore.pop(),
					operandsStore.pop(),
					operandsStore.pop()));
			}

			operatorStore.push(bodmasArray[i]);
		}
	}

	while (operatorStore.length > 0) {
		operandsStore.push(applyOperation(operatorStore.pop(),
			operandsStore.pop(),
			operandsStore.pop()));
	}

	if (bodmasArray[0] == "(" && bodmasArray[1] == ")") {
		operandsStore.push("operands not found!");
	}

	return operandsStore.pop();
}







function hasPrecedence(op1, op2) {
	if (op2 == '(' || op2 == ')') {
		return false;
	}
	if ((op1 == '*' || op1 == '/') &&
		(op2 == '+' || op2 == '-')) {
		return false;
	}
	if (op1 == '^') {
		return false;
	}
	else {
		return true;
	}
}



function squareRootOfNumber(powerValue) {
	powerValue = Math.sqrt(powerValue);
	return powerValue;
}

function applyOperation(op, b, a) {
	switch (op) {
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			return a / b;
		case '^':
			if (b == 3) {
				return a * a * a;
			}
			else if (b == 2) {
				return a * a;
			}
	}
	return 0;
}


function equalSign() {
	if (a == '' && b == '') {
		document.getElementById('displayBox').value = "operands not found";
	}
	else {
		document.getElementById(operator).style.background = '';
		var output = preference();
		console.log("output " + output);
		document.getElementById('displayBox').value = output;

	}
}





function empty() {



	a = '';
	operator = '';
	b = '';
	document.getElementById("display2").value = '';
	var displayEmpty = document.getElementById("display2").value = '';
	document.getElementById("displayBox").value = displayEmpty;
	if (operator != "") {
		document.getElementById(operator).style.background = '';
	}
	if (oper != '') {
		document.getElementById(oper).style.background = '';
	}
}