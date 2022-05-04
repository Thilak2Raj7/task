<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Account Transfer</title>
</head>
<style>
body{
background-image:url("https://media.istockphoto.com/photos/blue-double-exposure-of-money-coins-stacking-with-bar-graph-for-and-picture-id1250581414?k=20&m=1250581414&s=612x612&w=0&h=HAL05aplFF-JL93ltg64siWfTwrrVyf4ldofZJSY-qo=");
background-repeat:no repeat;
background-size:cover;
}


</style>
<div class="input">
<body>
<form action="TransferAmount" method="post">


<fieldSet>
From:<br>
AccountId:<br>
<input type="number"  name="SenderAccountId" value="<%=request.getParameter("accountId")%>" readonly="readonly"><br>
To :<br>
ReceiverAccount Id:<br>
<input type="number"  name="ReceiverAccountId"><br><br>
amount:<br>
<input type="number"  name="amount"><br><br>
<input type="submit" value="submit">

</fieldSet>
</div>
</form>




</body>
</html>
</body>
</html>