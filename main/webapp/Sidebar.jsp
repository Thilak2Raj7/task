<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Side bar</title>
<style>
div.options
{
text-align:left;
margin-left:400px;
}
body
{
background-image:url("https://media.istockphoto.com/photos/blue-double-exposure-of-money-coins-stacking-with-bar-graph-for-and-picture-id1250581414?k=20&m=1250581414&s=612x612&w=0&h=HAL05aplFF-JL93ltg64siWfTwrrVyf4ldofZJSY-qo=");
background-repeat:no repeat;
background-size:cover;
}

 button
 {
padding:15px; 
 }

</style>
</head>

<body>
<div  class="options">
<form action="action" method="post">
<button type="submit" formaction="AccountServelet">Account </button> 
<button type="submit" formaction="CreateCustomer">Customer </button> 
<button type="submit" formaction="AccountTransfer.jsp">AccountTransfer </button>
<button type="submit" formaction="Deposit.jsp">DepositAmount</button>
<button type="submit" formaction="Withdrawal.jsp">WithDrawAmount</button>
<button  type="submit" formaction="AddAccount.jsp"  >AddAccount</button>
<button  type="submit"   formaction="AddCustomer.jsp"> AddCustomer</button>
<button type="submit"     formaction="DeactivatedAccounts.jsp">DeactivatedAccounts</button>
<button type="submit"     formaction="DeactivateCustomer.jsp">DeactivatedCustomer</button>
<button type="submit"     formaction="login.jsp">LogOut</button>
</form>
</div>
</body>
</html>