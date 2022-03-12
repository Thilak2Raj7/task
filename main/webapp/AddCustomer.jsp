<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Customer</title>
</head>
<style>
body{
background-image:url("")'
background-repeat:no repeat;
background-size:cover;
}
fieldset
{
border:none;
}
div
{
height:200px
width:300px;
margin-left:500px;
}
h1
{
margin-left:500px;
}


</style>



<body>
<jsp:include page="Sidebar.jsp"/>
<h1>Create account</h1>
<div>
<form  action="AddingNewCustomer"  method="post">




<fieldset>
customer name:<br>
<input type="text" name="Name"><br>
Age:<br>
<input type="number" name="Age"><br>
Address:<br>
<input type="text"  name="Address"><br>
Mobile number:<br>
<input type="number" name="MobileNumber"><br>
Status:<br>
<input type="text" name="Status"><br>
<button>submit</button>

</fieldset>

 </form>
 </div>
</body>
</html>