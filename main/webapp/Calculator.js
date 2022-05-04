/**
 * 
 */
var a = '';
var b = '';
var operator = '';
var result='';
var c='';
function display(number) {
document.getElementById("displayBox").value += number;

}

function doOperation(oper) {
         if(a=='' && operator=='' )
         {
	    a = document.getElementById("displayBox").value;

		if (a == '' && oper == '-') {

			document.getElementById("displayBox").value = oper;
		}
		else if (a == '' && oper != '-') {

			document.getElementById("displayBox").value = '';
		}


		else {

			if (operator == '') {
			document.getElementById(oper).style.background = 'green';
            operator = oper;
			document.getElementById("displayBox").value = '';
			}
			else if (operator!='' && a!=''){
			document.getElementById(oper).style.background = 'green';
			operator = oper;
			document.getElementById("displayBox").value = '';
			}
            else{
             document.getElementById("displayBox").value = oper;
			}
			
		}
	}
	else{
		
		c+=document.getElementById("displayBox").value 
		alert(a);
		document.getElementById(oper).style.background = 'green';
         operator = oper;
		  operation(a,c,operator);
		
	}
	document.getElementById("displayBox").value = '';
}	
function equalSign() {
   if(b=='')
   {
	b = document.getElementById("displayBox").value;
	document.getElementById(operator).style.background = '';
    operation(a, b, operator);
}


}
function operation(a, b, operator) {

	a = Number(a);
	b = Number(b);
     alert(a);
     alert(b);
      alert(result);
	if (operator == '+') {
		if(result=='')
		{
		result=a+b;
		document.getElementById("displayBox").value = result;
		
	}
	else
	{
		result=a+b;
		a=result;
	}
	}
	else if (operator == '-') {
		alert(a);
		alert(b);
		result=a-b;
        document.getElementById("displayBox").value = result;

	}
	else if (operator == '*') {
        result=a*b;
		document.getElementById("displayBox").value = result;
	}
	else if (operator == '/') {
        result=a/b;
		document.getElementById("displayBox").value = result;
	}
}


function empty() {
	document.getElementById("displayBox").value = '';
	a = '';
	document.getElementById(operator).style.background = '';
	operator = '';
	b = '';
}


