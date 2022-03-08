<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Map" %>
<%@ page import="logic.Banking" %>
<%@ page import="pack.AccountDetails" %>
<%@ page import="pack.CustomerDetails" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body
{
margin-left: 600Px;
margin-right:400px;
margin-top:400px;

}
table,th,td
{
border:2px solid black;
margin-left:300px;
}
h1
{
text-align:center;

}
div
{
height:200Px;
width:300Px;
}
</style>
</head>
<h1>Update AccountDetails</h1>

<body>
<form action="UpdateAccount" method="post">
<fieldset>
<div>

<%
AccountDetails accObj=(AccountDetails)request.getAttribute("account");
%>
AccountId:<input type="number" name="AccountId" value="<%out.print(accObj.getAccountId()); %>">
Branch:<input type="text" name="Branch"  value="<%out.print(accObj.getBranch()); %>">
CustomerId:<input type="number" name="CustomerId" value="<%out.print( accObj.getCustomerId()); %>">
<button>submit</button>


</div>
</fieldset>
</form>
</body>

</html>


