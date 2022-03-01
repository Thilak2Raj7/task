<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AdminPage</title>

</head>
<style>
body
{
background-image:url("https://media.istockphoto.com/photos/blue-double-exposure-of-money-coins-stacking-with-bar-graph-for-and-picture-id1250581414?k=20&m=1250581414&s=612x612&w=0&h=HAL05aplFF-JL93ltg64siWfTwrrVyf4ldofZJSY-qo=");
background-repeat:no repeat;
background-size:cover;
}

</style>
</head>
<body>
<jsp:include page="Sidebar.jsp"/>

<h1><center>Admin</center> </h1>


<table>
<tr>
<th> customerId</th>
<th> accountId</th>
<th> balance</th>
<th>branch</th>
</tr>
<tr>
<td> <a href="CustomerDetails.jsp">1</a></td>
<td>101</td>
<td>1000 </td>
<td> Madurai</td>
</tr>
</table>

</body>
</html>