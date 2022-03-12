<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="pack.CustomerDetails" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Customer</title>
<style>


h1
{

margin-left:500px;
}


div.main
{
height:200Px;
width:300Px;
margin-left:500px;
}

</style>
</head>
<jsp:include page="Sidebar.jsp"/>
<h1>UpdateDetails</h1>
<body>

<div class="main">
<form action="UpdatedCustomer" method="post">
<fieldset>

<%
CustomerDetails cusObj=(CustomerDetails)request.getAttribute("CustomerObject");
%>
CustomerId:<br>
<input   type="number" name="customerId" readOnly value="<% out.print(cusObj.getCustomerId());%>"><br>
CustomerName:<br>
<input   type="text" name="CustomerName" value="<% out.print(cusObj.getCustomerName());%>"><br>
Age:<br>
<input   type="number" name="Age" value="<% out.print(cusObj.getAge());%>"><br>
Address:<br>
<input   type="text" name="Address" value="<% out.print(cusObj.getAddress());%>"><br>
MobileNumber:<br>
<input   type="number" name="MobileNumber" value="<% out.print(cusObj.getMobileNumber());%>"><br>
<br>
<button>submit</button>
</fieldset>
</form>
</div>
</body>
</html>