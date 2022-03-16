/**
 * 
 */
function loop(a, d) {

	while (a > 0) {
		let c = a % 10;
		d += c;
		a = Math.floor(a / 10);
	}
	
return d;
}
function sum()
	{
	if (d >= 10) {

		let sum = 0, rem = 0;
		while (d > 0) {
			rem = d % 10;
			sum += rem;
			d = Math.floor(d / 10);
		}
		d = sum;
	
	return d;
	
}



function trap() {

	let map = new Map();
	let a = 200;
	let b = 7;
	let n2 = 300;

	count = 0;
	while (a <= n2) {
		d = 0;
  c=loop(a,d);

		if (a == b || a % b == 0 || b % a == 0 ||c % b==0 || b % c==0 ) {
			console.log(a, b);
			map.set(a, b);
			a = a + 1;
			b = b + 2;
			count += 1;

		}
	
		
		else {
			a = a + 1;
			b = b - 1;
			if (b == 2) {
				b = b + 1
			}
		}

	}

	for (let value of map) {
		document.getElementById("map").innerHTML += value + "<br>"

	}
	document.getElementById("count").innerHTML = "count:" + count;
}

}

