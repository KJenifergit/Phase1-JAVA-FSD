<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
	.Header{
  border: 1px outset black;
  background-color: navy blue;
  text-align: center;
}
.One{
	border-radius: 5px;
 	background-color: #f2f2f2;
  	padding: 20px;
}
 .Second{
 background-color: navy blue;
 padding: 5px;
 }
</style>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body >
 	<div class="Header">
		<h1>FlyAway Welcomes you to the World....!</h1>
		<h2 >This is the Best Airlines for all!!!! </h2><br>
	</div>
	
	<div class="One">
	<h2>User Registration</h2>
	<form action="UserRegistrationflyaway" method="post">
		Enter your Name : <input type="text" name="name"  placeholder="username"><br><br>
        Enter your Email : <input type="text" name="email"  placeholder="userEmailId"><br><br>
        Enter your Password : <input type="password" name="pass"  placeholder="userPassword"><br><br>
        <button class="Second" type="submit" value="Submit"><b>Sign Up</b></button>
	</form>
	</div>

</body>
</html>