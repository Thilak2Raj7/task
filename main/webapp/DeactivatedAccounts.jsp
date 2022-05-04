<%@page import="java.util.Map"%>
 <%@ page import= "pack.CustomerDetails" %>
<%@page import="pack.AccountDetails"%>
<%@page import="logic.Banking"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Deactivated Accounts</title>
<style>

h1
{
margin-left:400px;
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
<div class="sidebar">
<jsp:include page="Sidebar.jsp"/>
</div>
<body>
<%
if(session.getAttribute("Admin")==null)
{
	RequestDispatcher rdDispatcher=request.getRequestDispatcher("login.jsp");
	rdDispatcher.forward(request, response);	
}

%>
<h1> Account Details</h1>
<table>

<div class="head">
<tr>
<th> accountId</th>
<th> balance</th>
<th>branch</th>
<th>customerId </th>
<th>Change status</th>
</tr>
<div>

<%
Banking logic=new Banking();
Map<Integer,Map<Integer,AccountDetails>> map=logic.showAccountDetails();
 for(Integer customerId:map.keySet())
 {
	Map<Integer,AccountDetails> accountMap=(Map<Integer,AccountDetails>)map.get(customerId);
	for(Integer accountId:accountMap.keySet())
	{
	AccountDetails account=accountMap.get(accountId);
    if(account.isAccountStatus()==false)
    {
%>
<tr>

<td><% out.print(account.getAccountId());%></td>
<td><% out.print(account.getAccountBalance());%></td>
<td><% out.print(account.getBranch());%></td>
<td><% out.print(account.getCustomerId());%></td>

<td><form action="ActivateAccount?customerId=<%=account.getCustomerId()%>&accountId=<%=account.getAccountId()%>"method="post"><button>Activate</button></form></td>


</tr>
<%
    }
	}
 }
%>
</div>
</table>