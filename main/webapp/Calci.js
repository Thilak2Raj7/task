/**
 * 
 */
var a='';
var b=''
var operator='';
var number='';
var oper;
var value;
function display(number)
{
document.getElementById('displayBox').value+=number;
value+=document.getElementById('displayBox').value;

if((a!=''|| a==0) && operator!='')
{
b+= number;	
}
else
{
a+=number;	
}


}
function doOperation(oper)
{
	if(b!='-' && a!='-')//doubt
	{
	document.getElementById('displayBox').value='';
if(operator=='')
{
	 if( oper=='-' && a=='')
{
	 operator=oper
      a+=-a;
  document.getElementById('displayBox').value=operator;
}
 else if(oper!='-' && a=='')

	{
	 operator=oper
  document.getElementById('displayBox').value='';
}

else{
	operator=oper;
	document.getElementById(oper).style.background='green';

}
}

else{
  
    document.getElementById(operator).style.background='';	
  
     document.getElementById(oper).style.background='green';
    if((a!='' || a==0) && b!='')
   {
     c=arithmetic(a,b,operator);
     b='';
	a=c;
    operator=oper;
	
	document.getElementById('displayBox').value='';
}
else if(a!='')
{
	if( oper=='-')
	{
		document.getElementById(oper).style.background='';
		document.getElementById('displayBox').value=oper;
		
		b+='-';
		
	}
   
	else
	{
	operator=oper;
	
	
}
}
	
}
}
}
function equalSign()
{
	
	
	document.getElementById(operator).style.background='';
	if(operator!='')
	{
		arithmetic(a,b,operator);
	}
}
function arithmetic(a,b,operator)
{
	a=Number(a);
	b=Number(b);
	 if(operator=='+')
	{
	result=a+b;
	document.getElementById('displayBox').value=result;
	return result;	
	}
	 else if(operator=='-')
	{
	result=a-b;
	document.getElementById('displayBox').value=result;	
	return result;
	}
	else if(operator=='*')
	{
	result=a*b;
	document.getElementById('displayBox').value=result;
	return result;	
	}
	else(operator=='/')
	{
	result=a/b;
	document.getElementById('displayBox').value=result;	
	return result;
	}
	
}

function empty() {
	document.getElementById("displayBox").value = '';
	a = '';
	operator = '';
	b = '';

    document.getElementById(operator).style.background = '';
}

/*
function display(number) {

  
	if (operator != '' && a!=0 ) {//Displaybox secondNumber
		if(secondNumber=='')
		{
		document.getElementById('displayBox').value=''
		secondNumber += number;
		document.getElementById('displayBox').value = secondNumber;

	}
	else if( b!='' ){
	secondNumber=number;
	
	document.getElementById('displayBox').value += secondNumber;	
	if(result!='' && count!=0)
	{
	secondNumber=result.toString();//to add number after result
	secondNumber+=number;
	document.getElementById('display2').value='';
	
	}
	}
	else
	{
		secondNumber=number;
	document.getElementById('displayBox').value=secondNumber;//series of operation
		
	}
	}
	if ( a==0 || operator=='') {//operator -''
  if(number==0)
   {
   document.getElementById('displayBox').value=number;
	 
    document.getElementById("display2").value=number;	
    }		   
else
{
document.getElementById('displayBox').value+=number;
	 
    document.getElementById("display2").value+=number;		
}
		
	}
       if ( a==0  && operator != '') {//Infinity problem
		b += secondNumber;
		
	}
	else {
		a += number;

	}
document.getElementById("display2").value+=secondNumber;
storeInput=document.getElementById("display2").value
	/*if (operator == '') {
		num1 = number;
		document.getElementById('display2').value += num1;

	}
	if (b == '') {
		document.getElementById('display2').value = num1 + operator + secondNumber;
	}
}*/
