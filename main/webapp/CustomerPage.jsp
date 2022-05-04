<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
           <%@page import="java.util.*"%>
 <%@ page import= "pack.CustomerDetails" %>
<%@page import="pack.AccountDetails"%>
<%@page import="logic.Banking"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer</title>
<style>
body{
background-image:url("https://media.istockphoto.com/photos/blue-double-exposure-of-money-coins-stacking-with-bar-graph-for-and-picture-id1250581414?k=20&m=1250581414&s=612x612&w=0&h=HAL05aplFF-JL93ltg64siWfTwrrVyf4ldofZJSY-qo=");
background-repeat:no repeat;
background-size:cover;
}
table,th,td
{
border:2px solid black;
margin-left:200px;
border-collapse:collapse;
}
</style>
</head>
<body>
<form  action="AmountTransfer" method ="post">
<table>
<tr>
<th> customer Id</th>
<th> Customer Name</th>
<th> accountId</th>
<th>AccountBalance</th>
<th>Branch</th>
<th>Status</th>
<th>AccountTransfer</th>
</tr>

<%
Map<Integer,CustomerDetails> customerMap=(Map <Integer,CustomerDetails>) request.getAttribute("customer");

Object temp=(Object)request.getAttribute("name");
int key=Integer.parseInt(temp.toString());
CustomerDetails customer=customerMap.get(key);
if(customer.isCustomerStatus()==true)
{
%>
<%
}
Map<Integer,Map<Integer,AccountDetails>> accountMap=(Map<Integer,Map<Integer,AccountDetails>>)request.getAttribute("accountMap");
Map<Integer,AccountDetails> account=(Map<Integer,AccountDetails>)accountMap.get(key);
for(Integer accountId:account.keySet())
{
	AccountDetails accObj=account.get(accountId);
	%>
	<tr>
	<td><% out.print(customer.getCustomerId());%> </td>
    <td> <%out.print(customer.getCustomerName());%></td>
	<td><% out.print(accObj.getAccountId());%></td>
	<td><% out.print(accObj.getAccountBalance());%></td>
	<td><% out.print(accObj.getBranch());%></td>
	<td><% out.print(accObj.isAccountStatus());%></td>	
   <td> <button type="submit" formaction="AmountTransfer?accountId=<%=accObj.getAccountId()%>" formmethod="post">AccountTransfer</button></td>
    </tr>
	 
   
		
	
<%} 
%>

<button type="submit" formaction="login.jsp" style="margin-left:800Px">LogOut</button>
</table>
</form>
</body>
</html>