<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AddAccount</title>
<style>
body{
background-image:url("")'
background-repeat:no repeat;
background-size:cover;
}
div{
border:3px solid black;
}

</style>
</head>
<body>

<h1>Create Account</h1>
<form  action="AddingNewAccount"  method="post">
<fieldset>
<div>
Customer Id:<input type="text" name="Customer"><br>

Branch:<input type="text" name="Branch"><br>
AccountStatus:<input type="text" name="AccountStatus"><br>
<input type="submit" value="submit" >
</div>
</fieldset>
 </form>
</body>
</html>