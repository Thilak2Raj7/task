<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> 
<title>Account Transfer</title>
</head>
<style>
body{
background-image:url("")'
background-repeat:no repeat;
background-size:cover;
}
div
{
background-color:silver;
}
h1
{
color:;
}

</style>
<body>


<h1>Amount Transfer</h1>
<form action="TransferServlet" method="post">
<fieldSet>
<div>
From:<br>

Account Id:
<select name="fromAct">
  <option value="1">1</option>
    <option value="2">2</option>
</select><br>
amount:<input type="text"  name="amount"><br>
To:<br>

Account Id:
<select name="toAct">
 <option  value="101">101</option>
    <option value="102">102</option>
    </select><br>
<input type="submit" value="Submit">
</div>
</fieldSet>
</form>




</body>
</html>