<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New User Sign Up</title>
<script src="NewUser.js" type="text/javascript"></script><link href="style.css" type="text/css" rel="stylesheet">
</head>
<header>
<nav>
<a href="index.jsp">Home</a>
<a href="menu.jsp">Menu</a>
<a href="login.jsp">Log In</a>
<a href="cart.jsp">Cart</a>
</nav>
</header>
<body>

<h1>New User Sign Up</h1>

<form class="new_user_form" name="newUser" action="index.jsp" method="post" onsubmit="return validateNewUser();">
<ul>
    <li>
        <label for="fName">First Name: </label>
        <input type="text" id="fName" value="" /> 
    </li>    
	<li>
		<label for="lName">Last Name: </label>
		<input type="text" id="lName" value="" />  
    </li>
    <li>
    	<label for="number">Phone Number: </label>
		<input type="text" id="number" placeholder="555-555-5555" />  
    </li>
    <li>
    	<label for="email">Email: </label>
		<input type="text" id="email" placeholder="john_doe@example.com" />  
    </li>
    <li>
    	<label for="password">Password: </label>
		<input type="password" id="password" value="" /> 
    </li>
    <li>
    	<input type="submit" value="Create Account">
    </li>
</ul>
</form>

</body>
</html>
