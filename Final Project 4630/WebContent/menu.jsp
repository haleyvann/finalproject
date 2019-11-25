<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="model.Order" %>
<%@ page import="model.Customer" %>  
<%@ page import="model.Menu" %>   
<%@ page import="java.util.ArrayList" %> 
  
<%   

// takes the Menu contained in the cart for the current session and adds it to the list
ArrayList<Menu> cartItems = (ArrayList<Menu>) session.getAttribute("cartItems");
Menu cart = (Menu) request.getAttribute("cart");
cartItems.add(cart);
System.out.print(cartItems);

%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="style.css" type="text/css" rel="stylesheet">
<title>Tony's Pizza Menu</title>
</head>
<body>
<h1>Tony's Pizza Menu</h1>
<img src="images/pep.jpg"/>
<form name="addCart1" action="MenuServlet" method="post">
<input type="submit" name="addPep" value="Add to Cart" >
</form>
<form name="addCart2" action="MenuServlet" method="post">
<input type="submit" name="addCheese" value="Add to Cart" >
</form>
<form name="addCart3" action="MenuServlet" method="post">
<input type="submit" name="addVegan" value="Add to Cart" >
</form>
<form name="addCart4" action="MenuServlet" method="post">
<input type="submit" name="addML" value="Add to Cart" >
</form>
<form name="addCart5" action="MenuServlet" method="post">
<input type="submit" name="addBC" value="Add to Cart" >
</form>
<form name="goToCart" action="MenuServlet" method="post">
<input type="submit" name="cart" value="Cart Icon" >
</form>

</body>
</html>
