 <%@ page import= "pack.CustomerDetails" %>
 <%@ page import="java.util.Map" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
  
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CustomerInformation</title>
<style>
body{
background-image:url("")'
background-repeat:no repeat;
}

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


</style>
</head>


<div class="sidebar">
<jsp:include page="Sidebar.jsp"/>


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
<th>Update</th>
<th>ChangeStatus</th>
</tr>

<%
Map<Integer,CustomerDetails> customerMap=(Map <Integer,CustomerDetails>) request.getAttribute("customer");
for(Integer key:customerMap.keySet())
{
CustomerDetails customer=customerMap.get(key);
if(customer.isCustomerStatus()==true)
{
%>
<tr>

<td> <% out.print(customer.getCustomerId());%> </td>
<td> <%out.print(customer.getCustomerName());%></td>
<td> <%out.print(customer.getAge());%></td>
<td> <% out.print(customer.getAddress());%></td>
<td> <%out.print(customer.getMobileNumber());%> </td>
<td><form action="UpdateCustomer?customerId=<%=customer.getCustomerId()%>"method="post"><button>Edit</button></form></td>
<td><form action="DeactivateCustomer?customerId=<%=customer.getCustomerId()%>"method="post"><button >   Deactivate</button></form></td>
</tr>
<%
}
}
%>
</table>


</body>
</html>