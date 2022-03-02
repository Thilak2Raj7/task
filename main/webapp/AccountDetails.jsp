<%@page import="java.util.Map"%>
<%@page import="pack.AccountDetails"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

<th> accountId</th>
<th> balance</th>
<th>branch</th>
<th>customerId </th>
<th> status</th>
<th>CreateAccount</th>
</tr>


<c:forEach items="${accountMap}" var="current">
    <c:forEach items="${current.value}" var="current1"> 
    <tr>
       <td><input type="checkbox" name="name1" /> </td>
      <td><c:out value="${current.key}"></c:out></td>
      <td><c:out value="${current1.key}"></c:out></td>
       <td><c:out value="${current1.value.getAccountBalance()}" ></c:out></td>
       <td><c:out value="${current1.value.getBranch()}" ></c:out></td>
       <td><c:out value="${current1.value.getCustomerId()}" ></c:out></td>
       <td><c:out value="${current1.value.isAccountStatus()}" ></c:out></td>
      
    </tr>
  </c:forEach>
 </c:forEach>

</table>
<a href=AddAccount.jsp>AddAccount</a>



</body>
</html>