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
background-size:cover;
}
}
h1
{
text-align:center;
color:purple;

}
h2
{
margin-left:700px;
vertical-align: 50px;
}


table,th,td
{
border:2px solid black;
margin-left:200px;
}

</style>
</head>
<h1>CustomerDetails</h1>
<body>
<jsp:include page="Sidebar.jsp"/>
<h2><a href="AddCustomer.jsp"> AddCustomer</a></h2>
<table>
<tr>
<th> Customer Id</th>
<th> Customer Name</th>
<th> Age</th>
<th>Address</th>
<th>MobileNumber</th>
<th>status</th>
</tr>

<%
Map<Integer,CustomerDetails> customerMap=(Map <Integer,CustomerDetails>) request.getAttribute("customer");
for(Integer key:customerMap.keySet())
{
CustomerDetails customer=customerMap.get(key);
%>
<tr>
<td> <% out.print(customer.getCustomerId());%> </td>
<td> <%out.print(customer.getCustomerName());%></td>
<td> <%out.print(customer.getAge());%></td>
<td> <% out.print(customer.getAddress());%></td>
<td> <%out.print(customer.getMobileNumber());%> </td>
<td>  <%out.print(customer.isCustomerStatus()) ;%></td>
</tr>
<%
}
%>
</table>


</body>
</html>