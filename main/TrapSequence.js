/**
 * 
 */
function loop(a)
 {
    let add=0;
	while (a > 0) 
	{
		let c = a % 10;
		add += c;
		a = Math.floor(a / 10);
	}
	
return  add;
}





function trap() {

	let map = new Map();
	let a 
	let b = 26;
	let n1;
	let n2 = 90;
    let sum=0;
	count = 0;
	
for(n1=49;n1<=n2;n1++)
{  
	a=n1;
	while(true)
	{
	if(a % b==0|| b % a==0 )
	{
	    map.set(n1,b);
		b=b+2;
		count=count+1;
		break;
	}
	else
	{
     if(a>9)
      {     
	   a=loop(a);
	  }
   else
    {
	if(b>3)
	{
    b=b-1;
    break;
}
}
}
}
}
	for (let value of map) {
		document.getElementById("map").innerHTML += value + "<br>"

	}
	document.getElementById("count").innerHTML = "count:" + count;


}

