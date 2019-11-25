<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="style.css" type="text/css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Log In Page</title>
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
<h1>Log In To Tony's Pizza!</h1>

  <form name="logIn" action="LoginServlet" method="post">
<ul>
    <li>
        <label for="email">Email Address: </label>
        <input type="text" name ="email" id="email" value="" /> 
    </li>    
    <li>
    	<label for="pass">Password: </label>
		<input type="text" name ="pass" id="pass" value="" /> 
    </li>
    <li>
    	<input type="submit" value="Log In">
    </li>
</ul>
</form>

<h3>New User?</h3>
<a href="register.jsp">Sign Up Here!"</a>
</body>
</html>
