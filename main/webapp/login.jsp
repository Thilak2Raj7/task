<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.Map"%>
<%@ page import="pack.CustomerDetails"%>
<%@page import="pack.AccountDetails"%>
<%@page import="logic.Banking"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<style>
body {
	background-image:
		url("https://media.istockphoto.com/photos/blue-double-exposure-of-money-coins-stacking-with-bar-graph-for-and-picture-id1250581414?k=20&m=1250581414&s=612x612&w=0&h=HAL05aplFF-JL93ltg64siWfTwrrVyf4ldofZJSY-qo=");
	background-repeat: norepeat;
	background-size: cover
}

h1 {
	color: black;
	font-style: bold;
	font-size: 40px;
	border: 10px;
	background-size: 10;
	vertical-align: normal;
	text-align: center;
	width: 200px;
}

div {
	color: black;
	height: 200px;
	width: 300px;
	margin-right: 600px;
	margin-left: 700px;
	margin-top: 300px;
}
</style>
</head>

<body>

	<div>


		<form action="ServeletLogin" method="post">
			<fieldset>
				<h1>
					<p>
					<center>Login</center>
				</h1>
				UserName:<input type="number" name="userId"><br>
				<br> Password:&nbsp&nbsp<input type="text" name="password"><br>
				<br> <input type="reset" value="Reset" id="resetInput">
				<input type="submit" value="Login" id="submitInput">
				<%
				if (request.getAttribute("Exception") != null) {
				%>
				<h2>
					<%
					out.print(request.getAttribute("Exception"));
					%>
				</h2>
				<%
}
%>
			</fieldset>

		</form>
	</div>


</body>
</html>