<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.Map"%>
 <%@ page import= "pack.CustomerDetails" %>
<%@page import="pack.AccountDetails"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
table,th,td
{
border:2px solid black;
margin-left:300px;
}

</style>
</head>
<body>
<jsp:include page="Sidebar.jsp"/>
<table>
<th> accountId</th>
<th> balance</th>
<th>branch</th>
<th>customerId </th>

</tr>


<%
Map<Integer,Map<Integer,AccountDetails>> map=(Map)request.getAttribute("accountMap");
 for(Integer customerKey:map.keySet())
 {
	Map<Integer,AccountDetails> accountMap=(Map<Integer,AccountDetails>)map.get(customerKey);
	for(Integer accountKey:accountMap.keySet())
	{
	AccountDetails account=accountMap.get(accountKey);

%>
<tr>

<td><% out.print(account.getAccountId());%></td>
<td><% out.print(account.getAccountBalance());%></td>
<td><% out.print(account.getBranch());%></td>
<td><% out.print(account.getCustomerId());%></td>

</tr>
<%
	}
 }
%>
</table>

</body>
</html>