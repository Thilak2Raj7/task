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

background-image:url("https://media.istockphoto.com/photos/blue-double-exposure-of-money-coins-stacking-with-bar-graph-for-and-picture-id1250581414?k=20&m=1250581414&s=612x612&w=0&h=HAL05aplFF-JL93ltg64siWfTwrrVyf4ldofZJSY-qo=");
background-repeat: norepaeat;
background-size: cover
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
color:black;
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
<input type="reset"  value="Reset" margin-left=900px;>
<input type="submit" value="Login" margin left=1000px;>

</fieldset>

</form>
</div>


</body>
</html>