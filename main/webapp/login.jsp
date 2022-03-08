<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<style>
body
{
background-image:url("data:image/jpeg;base64,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");
background-repeat:no repeat;
background-size:cover;
}

h1.heading
{
color:white;
font-style:bold;
font-size:40px;
font-family:cursive;

border:10px;
background-size:10;
vertical-align:normal;
text-align:center;
width:200px;
}

div{
color:white;
	height:200px;
	width:300px;
	margin-right:600px;
	margin-left:700px;
	
	margin-top:300px;
}

fieldSet
{
border=none;
}

</style>
</head>

<body >

<div>


<form action="ServeletLogin" method="post" >
<fieldset>
<h1><p><center>Login</center></h1>
UserName:<input type="text" name="name">
<br><br>
Password:<input type="password" name="password"><br>
<input type="reset"  value="Reset" margin-left=700px;>
<input type="submit" value="Login" margin left=1000px;>

</fieldset>

</form>
</div>


</body>
</html>