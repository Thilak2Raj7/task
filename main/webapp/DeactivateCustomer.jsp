<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.Map"%>
 <%@ page import= "pack.CustomerDetails" %>
<%@page import="pack.AccountDetails"%>
<%@page import="logic.Banking"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Deactivate</title>
</head>
<style>
h1
{
text-align:center;
color:purple;
}


 div.sidebar
 {
 	margin-left:0px;
 }

table,th,td
{
border:2px solid black;
margin-left:500px;
}
 
 div.main
 {
 margin-left:1500px;

 }
h1
{
margin-left:-200px;
} 

<body>
</style>

<div class="sidebar">
<jsp:include page="Sidebar.jsp"/>

<%
if(session.getAttribute("Admin")==null)
{
	RequestDispatcher rdDispatcher=request.getRequestDispatcher("login.jsp");
	rdDispatcher.forward(request, response);	
}

%>
</div>
<h1>CustomerDetails</h1>
<body>
<table>
<tr>
<th> Customer Id</th>
<th> Customer Name</th>
<th> Age</th>
<th>Address</th>
<th>MobileNumber</th>

<th>ChangeStatus</th>
</tr>

<%
Banking logic=new Banking();
Map<Integer,CustomerDetails> customerMap=logic.showCustomerDetails();
for(Integer key:customerMap.keySet())
{
CustomerDetails customer=customerMap.get(key);
if(customer.isCustomerStatus()==false)
{
%>
<tr>

<td> <% out.print(customer.getCustomerId());%> </td>
<td> <%out.print(customer.getCustomerName());%></td>
<td> <%out.print(customer.getAge());%></td>
<td> <% out.print(customer.getAddress());%></td>
<td> <%out.print(customer.getMobileNumber());%> </td>

<td><form action="ActivateCustomer?customerId=<%=customer.getCustomerId()%>"method="post"><button>   Activate</button></form></td>
</tr>
<%
}
}
%>
</table>


</body>
</html>