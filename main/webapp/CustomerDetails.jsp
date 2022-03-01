<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<h2><a href="AddCustomer.jsp">AddCustomer</a></h2>
<table>
<tr>
<th> Customer Id</th>
<th> Customer Name</th>
<th> Age</th>
<th>Address</th>

</tr>
<td> 1</td>
<td>Thilak</td>
<td>23</td>
<td> Madurai</td>

</table>


</body>
</html>