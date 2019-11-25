<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="model.Customer" %>  
<%@ page import="model.Menu" %>  
<%@ page import="java.util.ArrayList" %> 

<%
// take cart information from the session object
ArrayList<Menu> cartItems = (ArrayList<Menu>) session.getAttribute("cartItems");
Menu cart = (Menu) request.getAttribute("cart");
// loop thru the arraylist to export as a String
String finalCart = "";
for(int i = 0; i < cartItems.size(); ++i) {
	finalCart += cartItems.get(i);
}
finalCart += "<br>" + "<input type='submit' name='Checkout' value='Checkout' >" + "</form>";
//need to figure out when customerID is initialized and how to keep track of it
%>

<!DOCTYPE html>
<html>
<head>
<link href="style.css" type="text/css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Tony's Pizza Cart</title>
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
<h1> Tony's Pizza Cart</h1><br>

<p><%= finalCart %></p>

<form name="cart" action="CartServlet" method="post">
<input type="submit" name="Checkout" />
</form>

<form name="continue" action="menu.jsp">
<input type="submit" name="continue" value="Continue Shopping" >
</form>

</body>
</html>
