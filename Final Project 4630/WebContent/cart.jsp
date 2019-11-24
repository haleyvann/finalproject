<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="model.Customer" %>  
<%@ page import="model.Menu" %>  
<%@ page import="java.util.ArrayList" %> 

<%
String finalCart = (String) request.getAttribute("finalCart");

//need to figure out when customerID is initialized and how to keep track of it

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tony's Pizza Cart</title>
</head>
<body>
<h1> Tony's Pizza Cart</h1>

<p><%= finalCart %></p>

<form name="cart" action="CartServlet" method="post">
<input type="submit" name="Checkout" />
</form>

<a href="menu.jsp">Continue Shopping Order</a>
</body>
</html>
