/**
 * 
 */
var a = '';
var b = '';
var c = '';
var operator = '';
var number = 0;
var oper;
var storeResult = '';
var storeInput = '';
var count = 0;
var inputStore = '';
var stringInput = '';
var count1 = 0;
var count2 = 0;
function display(number) {
        inputStore=document.getElementById('display2').value;


	if ((a != 0 || a == 0) && operator != '') {

		if (number == '.' && b.includes(".")) {
			number = ''
			document.getElementById('display2').value += number;
		}
		else {
			document.getElementById('display2').value += number;
		}
		b += number;
		document.getElementById('displayBox').value = b;
		if (b.length > 3) {
			var seperateCommaB = comma(b);
			if (seperateCommaB == "undefined") {
				seperateCommaB = 0 + ".";

			}
			document.getElementById('displayBox').value = seperateCommaB;
		}
		storeInput = document.getElementById('display2').value;

	}

	else {
		if (storeResult != "") {
           
			a += number;
			 document.getElementById('display2').value=storeResult+number;
			//document.getElementById('displayBox').value = inputStore;
			if (a.length > 3) {
				var seperateCommas = comma(document.getElementById('displayBox').value);
				document.getElementById('displayBox').value = seperateCommas;
			}
             document.getElementById('displayBox').value=a;

		}
		else {
			if (number == "." && a.includes('.')) {
				number = '';
			}

			document.getElementById('display2').value += number;
			a += number;



			document.getElementById('displayBox').value = a;
			if (a.length > 3) {
				var seperateCommas = comma(document.getElementById('displayBox').value);
				document.getElementById('displayBox').value = seperateCommas;
			}
			output = document.getElementById('displayBox').value;
			console.log(output);

			//a = document.getElementById('displayBox').value;
		}


	}
	storeInput = document.getElementById('display2').value;

}






function doOperation(oper) {


	if (b != '-') {

		if (operator == '' && count == 0) {

			if (a != '') {

				operator = oper;
				document.getElementById(oper).style.background = 'green'
				document.getElementById('display2').value += operator;

			}
			else if (a == 0 && a == '') {
				//first sign minus

				a = 0;
				operator = oper;

				document.getElementById(oper).style.background = 'green'
				document.getElementById('display2').value = 0 + oper;
			}

		}

		else {
			if (operator != '') {
				document.getElementById(operator).style.background = '';
			}
			document.getElementById(oper).style.background = 'green';

			if (a != "" && b != "") {//doubt

				c = arithmetic(a, b, operator);
				b = '';
				a = c;

				operator = oper;
				storeInput += operator;

				document.getElementById('display2').value = storeInput;

			}

			else if (operator == '-' && oper == '-') {
				b += oper;
				storeInput += oper;
				document.getElementById('displayBox').value = b;
				document.getElementById('display2').value = storeInput;

			}
			else if (oper == "-") {
				b += oper;
				storeInput += oper;
				document.getElementById('displayBox').value = b;
				document.getElementById('display2').value = storeInput;
			}


			else {
				operator = oper;
				storeInput += operator;
				document.getElementById('display2').value += operator;


			}
		}

	}
}

function equalSign() {


	document.getElementById(operator).style.background = '';
	if (operator != '') {
		count++;
		a = arithmetic(a, b, operator);

		//document.getElementById('display2').value =storeResult;
		storeInput = document.getElementById('displayBox').value;
		if (operator != '/') {
			document.getElementById('displayBox').value = a;
			var seperateNumber = comma(document.getElementById('displayBox').value);
			document.getElementById('displayBox').value = seperateNumber;
		}
		b = '';
		operator = '';
	}
}

function arithmetic(a, b, operator) {
	a = Number(a);
	b = Number(b);
	var inputResult = 0;
	var result = 0;
	if (operator == '+') {

		result = a + b;
		result.toString();

		document.getElementById('displayBox').value = result;
		var seperateResult = comma(document.getElementById('displayBox').value);
		document.getElementById('displayBox').value = seperateResult;
		storeResult = result;
		storeResult.toString();

		document.getElementById('display2').value = storeInput;
		return result;
	}
	else if (operator == '-') {

		result = a - b;
		result.toString();

		document.getElementById('displayBox').value = result;
		var seperateResult = comma(document.getElementById('displayBox').value);
		document.getElementById('displayBox').value = seperateResult;
		storeResult = result;
		storeResult.toString();
		document.getElementById('display2').value = storeInput;
		return result;
	}

	else if (operator == '*') {
		result = a * b;
		result.toString();

		document.getElementById('displayBox').value = result;
		var seperateResult = comma(document.getElementById('displayBox').value);
		document.getElementById('displayBox').value = seperateResult;
		storeResult = result;
		storeResult.toString();
		inputResult = document.getElementById('displayBox').value;
		document.getElementById('display2').value = storeInput;

		return result;
	}
	else (operator == '/')
	{
		result = a / b;
		result.toString();

		document.getElementById('displayBox').value = result;
		var seperateResult = comma(document.getElementById('displayBox').value);
		document.getElementById('displayBox').value = seperateResult;
		storeResult = result;
		storeResult.toString();
		document.getElementById('display2').value = storeInput;
		return result;
	}

}
function comma(stringInput) {
	var firstIndex = stringInput.indexOf(".");
	if (firstIndex != 0) {


		let countLength = 0;


		let length = stringInput.length;
		var secondArray;
		var secondString;
		beforeDot = stringInput;
		if (stringInput.includes('-')) {
			var inputIndex = stringInput.indexOf('-');
			var firstString = stringInput.substring(0, inputIndex + 1);
			secondString = stringInput.substring(inputIndex + 1, length)
			beforeDot = secondString;
		}
		else {
			secondString = stringInput;
			beforeDot = stringInput;
		}
		if (stringInput.includes('.')) {

			var dotIndex = secondString.indexOf(".");
			var dotString = secondString.substring(dotIndex, length);
			var beforeDot = secondString.substring(0, dotIndex);

		}
		else {
			if (beforeDot == secondString) {
				beforeDot = secondString;

			}
			else {
				beforeDot = stringInput;
			}
		}

		var character = beforeDot.split("");
		var arrayLength = character.length;
		var lastValue = character[arrayLength - 1];
		var outputString = '';
		for (var i = arrayLength - 2; i >= 0; i--) {
			outputString = character[i] + outputString;
			if (countLength == 1 && i != 0) {
				outputString = "," + outputString;
				countLength--;
			}
			else {
				countLength++;
			}
		}



		if (stringInput.includes(".")) {
			if (stringInput.includes("-")) {

				outputString = "-" + outputString;
				outputString = outputString + lastValue + dotString;
			}
			else {
				outputString = outputString + lastValue + dotString;
			}
		}

		else {
			if (stringInput.includes("-")) {

				outputString = "-" + outputString + lastValue;
			}
			else {
				outputString = outputString + lastValue;
			}
		}
		console.log(outputString);
		/*if(outputString=="undefined")
		{
			outputString=0+".";
		}*/
		return outputString;
	}
	else {
		if (a == ".") {
			a = 0 + ".";
			document.getElementById('display2').value = a;
			count1++;
			return a;
		}
		else {
			if (b == '.') {
				b = ".";
				var storeDot = document.getElementById('display2').value;
				var dotLength = storeDot.length;
				storeDot = storeDot.substring(0, dotLength - 1) + 0 + ".";
				document.getElementById('display2').value = storeDot;
				count2++;
				return b;
			}
			else {
				b = 0 + stringInput;
				return b;
			}
		}
	}
}



function empty() {
	
    //document.getElementById("displayBox").value = inputResult;
	
	a = '';
	operator = '';
	b = '';
	document.getElementById("display2").value = '';
	var displayEmpty = document.getElementById("display2").value = '';
	document.getElementById("displayBox").value =displayEmpty;
	  if(operator!=""  )
       {
	  document.getElementById(operator).style.background = '';
  }
if(oper!='')
{
document.getElementById(oper).style.background = '';
}
}