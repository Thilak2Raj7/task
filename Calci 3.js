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
       
      if(number!='(' && number!=')'){
		b += number;
        document.getElementById('displayBox').value =b;
         var seperateCommaB=comma(b);
        document.getElementById('displayBox').value=seperateCommaB;
        storeInput = document.getElementById('display2').value;
	}
}
	else {
		
		 if (storeResult!="")
    {
	if(number!='(' && number!=')'){
	a=	inputStore;
	document.getElementById('displayBox').value =inputStore;
    var seperateCommaA=comma(inputStore);
	document.getElementById('displayBox').value= seperateCommaA;
	}
}
else{
		if(number!='(' && number!=')'){
			a += number;
			
			document.getElementById('displayBox').value =a;
			var seperateCommas=comma(document.getElementById('displayBox').value);
			document.getElementById('displayBox').value= seperateCommas;
			output=	document.getElementById('displayBox').value;
		     console.log(output);
			//a = document.getElementById('displayBox').value;

		}
		}
}
		
}

	



function doOperation(oper) {
	

	if (b != '-') {
		
		if (operator == '' && count==0) {
			
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

			

			document.getElementById(oper).style.background = 'green';
             
			if (a !="" && b != "" ) {//doubt

				c = arithmetic(a, b, operator);
				b = '';
				a = c;
				
					operator = oper;
					storeInput += operator;
				
				document.getElementById('display2').value = storeInput;
				
			}

			else if (operator == '-' && oper == '-') {
				b += oper;
                storeInput+=oper;
				document.getElementById('display2').value +=storeInput;

			}


			else {
				operator = oper;
				storeInput =storeResult+ operator;
				document.getElementById('display2').value = storeInput;


			}
		}

	}
}

function preference()
{
	var stringPreference=document.getElementById('display2').value
	  if(stringPreference.includes("("))
    {
	var stringIndex=stringPreference.indexOf("(");
	var bracketIndex=stringPreference.indexOf(")");
	var bracketInput=stringPreference.substring(stringIndex+1,bracketIndex);
	
    }
	
}
function equalSign() {

	//a = Number(a);
	//b = Number(b);
	//document.getElementById(operator).style.background = '';
	if (operator != '') {
	count++;
	a=arithmetic(a, b, operator);
	//document.getElementById('display2').value =storeResult;
	if(operator!='/')
	{
	
	document.getElementById('displayBox').value=a;
	var seperateNumber=comma(document.getElementById('displayBox').value);
		document.getElementById('displayBox').value =seperateNumber;
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
if(stringInput.includes('-'))
{
	secondArray=stringInput.split('-');
    console.log(secondArray);
	beforeDot=secondArray[1];
	stringInput=beforeDot;
	}
if(stringInput.includes('.'))
{
    var dotIndex=stringInput.indexOf(".");
    var dotString=stringInput.substring(dotIndex,length);
    var beforeDot=stringInput.substring(0,dotIndex);
    stringInput=beforeDot;
 }

	var character=stringInput.split("");
	var arrayLength=character.length;
	var lastValue=character[arrayLength-1];
    var outputString='';
    for(var i=arrayLength-2;i>=0;i--) 
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
     

 
   if(stringInput.includes("."))
{
    if(stringInput.includes("-"))
{
	 outputString="-"+outputString;
}
  outputString=outputString+lastValue+dotString;
}
else
{
	outputString=outputString+lastValue;
}
    console.log(outputString);

return outputString;   
}
 

function empty() {
	//document.getElementById(operator).style.background = '';
//	document.getElementById("displayBox").value = inputResult;
//	document.getElementById("display2").value = '';
	//a = '';
	//operator = '';
    //b = '';
	comma("-1000.980");
	
}