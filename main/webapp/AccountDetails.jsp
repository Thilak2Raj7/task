<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Account Information</title>
<style>

h1.heading
{
color:black;
font-style:Bold;
font-size:40px;
font-family:cursive;

/* border:10px; */
background-size:10px;
vertical-align:normal;
text-align:center;
width:200px;
}
table,th,td
{
border:2px solid black;
margin-left:300px;
}
body
{
background-image:url("https://media.istockphoto.com/photos/blue-double-exposure-of-money-coins-stacking-with-bar-graph-for-and-picture-id1250581414?k=20&m=1250581414&s=612x612&w=0&h=HAL05aplFF-JL93ltg64siWfTwrrVyf4ldofZJSY-qo=");

background-repeat:no repeat;
background-size:cover;
}




</style>
</head>
<h1> Account Details</h1>
<body>

<jsp:include page="Sidebar.jsp"/>
<table>
<tr>
<th> customerId</th>
<th> accountId</th>
<th> balance</th>
<th>branch</th>
<th>CreateAccount</th>
</tr>
<td> 1</td>
<td>101</td>
<td>1000 </td>
<td> Madurai</td>
<td><a href=AddAccount.jsp>AddAccount</a>

</table>
<a href=AddCustomer.jsp>AddCustomer</a>

</body>
</html>