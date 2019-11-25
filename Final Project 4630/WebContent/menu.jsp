<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="model.Order" %>
<%@ page import="model.Customer" %>  
<%@ page import="model.Menu" %>   
<%@ page import="java.util.ArrayList" %> 
  
<%   
// takes the String contained in the cart for the current session
String cart = (String) session.getAttribute("cart");
String [] itemsInCart = new String[10];
System.out.print(itemsInCart);
String finalCart = "";
for (int i = 0; i < itemsInCart.length; i++) { 		      
     finalCart += "item " + i + itemsInCart[i];
}
session.setAttribute("finalCart", finalCart);
//need to figure out when customerID is initialized and how to keep track of it
Customer customer = new Customer();
%> 
<!DOCTYPE html>
<html>
<head>
<link href="style.css" type="text/css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Tony's Pizza Menu</title>
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
<h1>Tony's Pizza Menu</h1>
<div class="row">
<img src="images/cheese.jpg"/>
</div>
<h2>Cheese Pizza</h2>
<h3>$11.99</h3>
<form name="addCart1" action="MenuServlet" method="post">
<input type="submit" name="addCheese" value="Add to Cart" >
</form>
<div class="row">
<img src="images/pep.jpg"/>
</div>
<h2>Pepperoni Pizza</h2>
<h3>$12.99</h3>
<form name="addCart2" action="MenuServlet" method="post">
<input type="submit" name="addPep" value="Add to Cart" >
</form>
<div class="row">
<img src="images/sausage.jpg"/>
</div>
<h2>Sausage Pizza</h2>
<h3>$12.99</h3>
<form name="addCart3" action="MenuServlet" method="post">
<input type="submit" name="addVegan" value="Add to Cart" >
</form>
<div class="row">
<img src="images/meatPizza.jpg"/>
</div>
<h2>Meat Lovers Pizza</h2>
<h3>$16.99</h3>
<form name="addCart4" action="MenuServlet" method="post">
<input type="submit" name="addML" value="Add to Cart" >
</form>
<div class="row">
<img src="images/theWorks.jpg"/>
</div>
<h2>The Works</h2>
<h3>$16.99</h3>
<form name="addCart5" action="MenuServlet" method="post">
<input type="submit" name="addBC" value="Add to Cart" >
</form>
<form name="goToCart" action="MenuServlet" method="post">
<input type="image" name="submit" src="images/cart.png" >
</form>
</body>
</html>
