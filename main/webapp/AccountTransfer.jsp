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



To:<br>

SenderAccountId:<input type="number"  name="SenderAccountId"><br>
Account Id:<input type="number"  name="ReceiverAccountId"><br>
amount:<input type="number"  name="amount"><br>
<input type="submit" value="Submit">
</div>
</fieldSet>
</form>




</body>
</html>