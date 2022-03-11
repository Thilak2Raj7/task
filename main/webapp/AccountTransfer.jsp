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

}
div.input
{
height:200px;
width:300px;
margin-left:500px;
}

div.sidebar
{
margin-left:0px;
margin-top:100px;
}

h1
{
margin-left:500px;
}

fieldset:
{
border:none;
}

</style>
<div class="sideBar"></div>
<jsp:include page="Sidebar.jsp"/>
<h1>Amount Transfer</h1>
<div class="input">
<body>
<form action="TransferServlet" method="post">


<fieldSet>
From:<br>
AccountId:<br>
<input type="number"  name="SenderAccountId"><br>
To :<br>
Account Id:<br>
<input type="number"  name="ReceiverAccountId"><br><br>
amount:<br>
<input type="number"  name="amount"  ><br><br>
<input type="submit" value="submit">
</fieldSet>
</div>
</form>




</body>
</html>