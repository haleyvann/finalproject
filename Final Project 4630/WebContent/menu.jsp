<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="model.Order" %>
<%@ page import="model.Customer" %>  
<%@ page import="model.Menu" %>   
<%@ page import="java.util.ArrayList" %> 
  
<%   

// takes the Menu contained in the cart for the current session and adds it to the list
ArrayList<Menu> cartItems = (ArrayList<Menu>) session.getAttribute("cartItems");
Order order = (Order) session.getAttribute("order");
Menu cart = (Menu) request.getAttribute("cart");
cartItems.add(cart);

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
<br>
<h4>Pepperoni Price: $10.99</h4>
<br>
<img src="pep.jpg"/>
<form name="addCart1" action="MenuServlet" method="post">
<input type="text" name="addQuantity" value='Quantity' >
<br>
<input type="submit" name="addPep" value="Add to Cart" >
</form>
<h4>Cheese Price: $9.99</h4>
<br>
<img src="cheese.jpg" />
<form name="addCart2" action="MenuServlet" method="post">
<input type="text" name="addQuantity" value='Quantity' >
<br>
<input type="submit" name="addCheese" value="Add to Cart" >
</form>
<h4>Vegan Price: $11.99</h4>
<br>
<img src="veganPizza.jpg" />
<form name="addCart3" action="MenuServlet" method="post">
<input type="text" name="addQuantity" value='Quantity' >
<br>
<input type="submit" name="addVegan" value="Add to Cart" >
</form>
<h4>Meat Lovers Price: $12.99</h4>
<br>
<img src="meatPizza.jpg" />
<form name="addCart4" action="MenuServlet" method="post">
<input type="text" name="addQuantity" value='Quantity' >
<br>
<input type="submit" name="addML" value="Add to Cart" >
</form>
<h4>Buffalo Chicken Price: $13.99</h4>
<br>
<img src="bcPizza.jpg" />
<form name="addCart5" action="MenuServlet" method="post">
<input type="text" name="addQuantity" value='Quantity' >
<br>
<input type="submit" name="addBC" value="Add to Cart" >
</form>
<form name="goToCart" action="cart.jsp">
<input type="image" name="submit" src="images/cart.png" >
</form>

</body>
</html>
