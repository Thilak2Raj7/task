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
div.main{
height:400px;
width:300px;
margin-left:500px;
}
div.sidebar
{
margin-left:100px;
}
h1
{
margin-left:500px;
}


</style>
</head>
<body>
<div class="sidebar">
<jsp:include page="Sidebar.jsp"/>
</div>
<h1>Create Account</h1>
<form  action="AddingNewAccount"  method="post">
<div class="main">
<fieldset>

Customer Id:<br>
<input type="text" name="Customer"><br>
Branch:<br>
<input type="text" name="Branch"><br>
AccountStatus:<br>
<input type="text" name="AccountStatus"><br><br>
<input type="submit" value="submit" >

</fieldset>
</div>
 </form>
</body>
</html>