<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="model.Customer" %>  
<%@ page import="model.Menu" %>  
<%@ page import="java.util.ArrayList" %> 

<%
// take cart information from the session object
ArrayList<String> cartItems = (ArrayList<String>) session.getAttribute("cartItems");

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
<meta charset="ISO-8859-1">
<title>Tony's Pizza Cart</title>
</head>
<body>
<h1> Tony's Pizza Cart</h1>

<p><%= finalCart %></p>

<a href="menu.jsp">Continue Shopping</a>
</body>
</html>
