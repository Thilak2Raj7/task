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
</style>
<body>
<form  action="AddingNewCustomer"  method="post">
<fieldset>
<div>

customer name:<input type="text" name="Name"><br>
Age:<input type="number" name="Age"><br>
Address:<input type="text"  name="Address"><br>
Mobile number:<input type="number" name="MobileNumber"><br>
Status:<input type="text" name="Status"><br>

<input type="submit" value="submit" >
</div>
</fieldset>
 </form>
</body>
</html>