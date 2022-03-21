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
function equalSign()
{
	
	a=Number(a);
	b=Number(b);
	document.getElementById(operator).style.background='';
	if(operator!='')
	{
		arithmetic(a,b,operator);
	}
}
function arithmetic(a,b,operator)
{
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
	document.getElementById('oper').style.background = '';
    document.getElementById('operator').style.background = '';
}