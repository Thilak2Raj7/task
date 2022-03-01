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
<form  action="CreateAccountServelet"  method="post">
<fieldset>
<div>
Customer Id:<input type="text" name="Customer"><br>
Account Id:
<select name="Account">
<option>101</option>
<option>102</option>
</select><br>
Account Balance:<input type="text" name="Account Balance"><br>
Branch:<input type="text" name="Branch"><br>
<input type="submit" value="submit" >
</div>
</fieldset>
 </form>
</body>
</html>