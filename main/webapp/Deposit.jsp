<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> 
<title>Deposit</title>
</head>
<style>
body{
background-image:url("")'
background-repeat:no repeat;

}
div.input
{

width:200px;
height:300px;
margin-left:500px;
}
h1
{
margin-left:-600px;

}

{
fieldset
{
border:none;
}

div.input:
{
margin-left:0px;
}
</style>
<body>


<jsp:include page="Sidebar.jsp"/>
<%
if(session.getAttribute("Admin")==null)
{
	RequestDispatcher rdDispatcher=request.getRequestDispatcher("login.jsp");
	rdDispatcher.forward(request, response);	
}

%>

<h1><center>CashDeposit</center></h1>


<div  class="input">
<form action="CashDeposit" method="post">

<fieldSet>
To:<br>
Account Id:<br>
<input type="number"  name="ReceiverAccountId"><br><br>
amount:<br>
<input type="number"  name="amount" style="margin-left:0px"><br><br>
<input type="submit" value="Submit">
</fieldSet>
</div>

</form>




</body>
</html>