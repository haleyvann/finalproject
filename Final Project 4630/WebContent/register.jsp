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

<form class="new_user_form" name="newUser" action="RegisterServlet" method="post">
<ul>
    <li>
        <label>First Name: </label>
        <input type="text" name="fName" value="" /> 
    </li>    
	<li>
		<label>Last Name: </label>
		<input type="text" name="lName" value="" />  
    </li>
    <li>
    	<label>Phone Number: </label>
		<input type="text" name="phone" placeholder="555-555-5555" />  
    </li>
    <li>
    	<label>Email: </label>
		<input type="text" name="email" placeholder="john_doe@example.com" />  
    </li>
    <li>
    	<label>Password: </label>
		<input type="password" name ="pass" value="" /> 
    </li>
    <li>
    	<label>Confirm Password: </label>
		<input type="password" name="confPass" value="" /> 
    </li>    
    <li>
    	<input type="submit" name="submit" value="Create Account">
    </li>
</ul>
</form>

</body>
</html>
