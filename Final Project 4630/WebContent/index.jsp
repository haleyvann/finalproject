<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.ArrayList" %> 
<%@ page import="model.Menu" %>  
<%@ page import="model.Order" %> 
<%@ page import="java.util.Date" %>
<%@ page import="java.text.DateFormat" %>  
<%@ page import="java.text.SimpleDateFormat" %> 

<%
ArrayList<Menu> cartItems = new ArrayList<Menu>();
session.setAttribute("cartItems", cartItems);
DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
Date date = new Date();
Order order = new Order(1, dateFormat.format(date));
session.setAttribute("order", order);
%>
<!DOCTYPE html>
<html>
<head>
<link href="style.css" type="text/css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Tony's Pizza Home Page!</title>
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
<h1> Welcome to Tony's Pizza!</h1>
<div class="container">
 <div class="jumbotron">
	<a href="menu.jsp">Order Now!</a>
</div>
</div>


</body>
</html>
