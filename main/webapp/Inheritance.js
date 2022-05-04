/**
 *
import $ from "jquery";
var script = document.createElement('script');
script.src = 'https://code.jquery.com/jquery-3.4.1.min.js';
script.type = 'text/javascript';
document.getElementsByTagName('head')[0].appendChild(script); 
 */


function relation() {
	var number = document.getElementById("value").value;

	for (let i = 0; i < number; i++) {


		var lblName = document.createElement("label");
		lblName.textContent = "FatherName: ";

		var sonName = document.createElement("label");
		sonName.textContent = "SonName: ";

		var box = document.createElement("input");
		box.setAttribute("type", "text");
		box.setAttribute("id", "F" + i);
		box.setAttribute("name", "parent");
		var secondBox = document.createElement("input");
		secondBox.setAttribute("type", "text");
		secondBox.setAttribute("id", "S" + i);
		secondBox.setAttribute("name", "child");
		var linebreak = document.createElement("br");

		document.body.appendChild(lblName);
		document.body.appendChild(box);
		document.body.appendChild(sonName);
		document.body.appendChild(secondBox);
		document.body.appendChild(linebreak);

	}




	var button = document.createElement("button");
	button.setAttribute("onclick", "search()");

	button.innerText = "submit";
	document.body.appendChild(button);
}

function search() {
	var grand = document.createElement("label");
	grand.textContent = "GrandParentName: ";
	var thirdBox = document.createElement("input");
	thirdBox.setAttribute("type", "text");
	thirdBox.setAttribute("id", "GrandParent");
	document.body.appendChild(grand);
	document.body.appendChild(thirdBox);
	var submitButton = document.createElement("button");
	submitButton.setAttribute("onclick", "grandChild()");
	submitButton.innerText = "secondSubmit";
	document.body.appendChild(submitButton);
}

function grandChild() {
	var map = new Map();
	var num = document.getElementById("value").value;
	for (let i = 0; i < num; i++)
	 {
		var father = document.getElementById("F" + i).value;
		var son = document.getElementById("S" + i).value;


		var array = map.get(father);
		if (array == null) {
			array = new Array();
			map.set(father, array);
		}
		array.push(son);

	}


	var grandParent = document.getElementById("GrandParent").value;
	var arr = map.get(grandParent);

	let length = arr.length;

	let value = [];
	var children = [];
	for (let j = 0; j < length; j++)
	 {
		value.push(map.get(arr[j]));
      if( value[j] != undefined)
       {
	      
			var elements=value[j].length;
			for (var k = 0; k < elements; k++) {
				children.push(value[j][k]);

			}
          }
		}

		var n = children.length;
        if (n == 0) {
			document.body.append("There are no grand children");
		}
		
		else if (n == 1) {
			document.body.append("The grandchild is "+ children[0]);
		}
     
		else {
				document.body.append("The grandchildren are ");
			for (t = 0; t < n - 1; t++) {


				if (t < n - 2) {
					document.body.append(children[t] + ",");
				}
				else {
					document.body.append(children[n - 2] + " " + "and" + " " + children[n - 1]);
				}
			}
		}
      }
	

