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



h1
{
text-align:center;

}
div.input
{
margin-left:500px;
height:200Px;
width:300Px;
}

div.sidebar
{
margin-left:200px;
}

</style>
</head>
<div class="sidebar">
<jsp:include page="Sidebar.jsp"/>

<h1>Update AccountDetails</h1>

<body>
<div class="input">
<form action="UpdateAccount" method="post">
<fieldset>


<%
AccountDetails accObj=(AccountDetails)request.getAttribute("account");
%>

AccountId:<br>
<input type="number" name="AccountId" readOnly  value="<%out.print(accObj.getAccountId());%>"><br>
Branch:<br>
<input type="text" name="Branch"  value="<%out.print(accObj.getBranch()); %>"><br>
CustomerId:<br>
<input type="number" name="CustomerId" readOnly  value="<%out.print( accObj.getCustomerId()); %>"><br>
<button>submit</button>



</fieldset>
</form>
</div>
</body>

</html>


