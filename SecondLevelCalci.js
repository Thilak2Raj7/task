/**
 * 
 */
var a = '';
var b = '';
var c='';
var operator = '';
var number = 0;
var oper;
var storeResult = '';
var storeInput = '';
var count = 0;
var inputStore='';
var stringInput='';
function display(number) {
	
	document.getElementById('display2').value += number;
	inputStore=document.getElementById('display2').value;
	
	if ((a != 0 || a == 0) && operator != '') {

		b += number;
        document.getElementById('displayBox').value = comma(b);
        
        storeInput = document.getElementById('display2').value;
	}

	else {
		 if (storeResult!="")
{
	
	document.getElementById('displayBox').value =comma(inputStore);
	
	a=	inputStore;
	
}
else{
		
			a += number;
			document.getElementById('displayBox').value = comma(a);
			//a = document.getElementById('displayBox').value;

		}
}
		
}

	



function doOperation(oper) {
	
if(storeResult!=0  && count!=0)
{
document.getElementById('display2').value=storeResult;
}
	if (b != '-') {
		
		if (operator == '') {
			
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

			document.getElementById(operator).style.background = '';

			document.getElementById(oper).style.background = 'green';
    
			if (a != '' && b != "" ) {//doubt

				c = arithmetic(a, b, operator);
				b = '';
				a = c;
				if (count == 0) {
					operator = oper;

					storeInput += operator;
				}
				else {
					operator = oper;
					storeInput = c + operator;
					

				}
				document.getElementById('display2').value = storeInput;
				count--;
			}

			else if (operator == '-' && oper == '-') {
				b += oper;

				document.getElementById('display2').value += oper;

			}


			else {
				operator = oper;
				storeInput += operator;
				document.getElementById('display2').value = storeInput;


			}
		}

	}
}

function equalSign() {

	//a = Number(a);
	//b = Number(b);
	document.getElementById(operator).style.background = '';
	if (operator != '') {
	count++;
	a=arithmetic(a, b, operator);
	//document.getElementById('display2').value =storeResult;
	if(operator!='/')
	{
	
	document.getElementById('displayBox').value=comma(a);
     }     
   b='';
		operator='';
	}
}

function arithmetic(a, b, operator) {
	a = Number(a);
	b = Number(b);
	var inputResult=0;
	var result=0;
	if (operator == '+') {

		result = a + b;
		document.getElementById('displayBox').value = result;
		storeResult=result;
        storeResult.toString();
        alert(storeResult);
		document.getElementById('display2').value = storeInput;
		return result.toString();
	}
	else if (operator == '-') {

		result = a - b;
		document.getElementById('displayBox').value = result;
		inputResult = document.getElementById('displayBox').value;
		storeResult=result;
        storeResult.toString();
        document.getElementById('display2').value = storeInput;
		return result.toString();
	}
	
	else if (operator == '*') {
		result = a * b;
		document.getElementById('displayBox').value = result;
		storeResult=result;
        storeResult.toString();
		inputResult = document.getElementById('displayBox').value;
		document.getElementById('display2').value = storeInput;
		
			return result.toString();
	}
	else (operator == '/')
	{
		result = a / b;
		document.getElementById('displayBox').value = result;
		storeResult=result;
        storeResult.toString();
		document.getElementById('display2').value = storeInput;
		return result.toString();
	}

}
function  comma(stringInput)
{
	let countLength=0;
	let length=stringInput.length;
	var character=stringInput.split('');
	 var lastValue=character[length-1];
      var outputString='';
      for(var i=length-2;i>=0;i-- ) 
       {
	     
	     outputString=character[i]+outputString;
           
          if(countLength==1 && i!=0)
         {
	      outputString=","+outputString;
           countLength--;
           }
          else
         {
	      countLength++;
        }
       }
     

    outputString=outputString+lastValue;

return outputString;   
}


function empty() {
	//document.getElementById(operator).style.background = '';
//	document.getElementById("displayBox").value = inputResult;
//	document.getElementById("display2").value = '';
	a = '';
	operator = '';
    b = '';
	
	
}