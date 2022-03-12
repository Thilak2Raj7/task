<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> 
<title>AmountWithdrawal</title>
</head>
<style>
body{
background-image:url("")'
background-repeat:no repeat;
background-size:cover;
}
div.input
{

margin-left:500px;
width:200px;
height:300px;
}

div.sidebar
{
margin-left:0px;
}

h1
{
margin-right:600px;
}

</style>
<body>



<div class="sidebar"></div>
<jsp:include page="Sidebar.jsp"/>
<h1><center>CashWithdrawal</center> </h1>
<div class="input">
<form action="CashWithdrawal" method="post">
<fieldSet>
Account Id:<br>
<input type="number"  name="ReceiverAccountId"><br>
amount:<br>
<input type="number"  name="amount"><br><br>
<input type="submit" value="Submit">
</fieldSet>
</div>

</form>




</body>
</html>