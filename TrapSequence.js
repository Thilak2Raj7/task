/**
 * 
 */


function trap()
{


let a=3;
let b=5;
let n2=13;
let d=0;
count=0;
while(a<=n2 )
{
	d=0;
while(a<10)
{	
if(a==b)
	{
	a=a+1;
	b=b+2;
	count+=1
		console.log(a,b);
	}
	else if (a%b==0 || b%a==0)
{
	a=a+1;
	b=b+2;
	count+=1;
	console.log(a,b);
}	
else
{
a=a+1;
b=b-1;
if(b==2)
{
b=b+1	
}	
}
}
 if(a>9) 
{
while(a>0)
{
c=a%10;
d+=c
a=Math.floor(a/10);
}	
a=d;
 if(a==b)
	{
	a=a+10;
	b=b+2;
	count+=1
	console.log(a,b);
		
	}
	else if (a%b==0 || b%a==0)
{
	a=a+10;
	b=b+2;
	count+=1
	console.log(a,b);	
}
else{
	a=a+10;
	b=b-1;
	if(b==2)
{
b=b+1	
}
}
}

}
document.getElementById("trap").innerHTML=count;

console.log(count);

	

}	
