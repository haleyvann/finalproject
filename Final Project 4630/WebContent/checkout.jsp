<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="model.Order" %>
<%@ page import="model.Customer" %>  
<%@ page import="model.Menu" %>  
<%@ page import="java.util.Date" %>
<%@ page import="java.text.DateFormat" %>  
<%@ page import="java.text.SimpleDateFormat" %> 
<%@ page import="java.util.ArrayList" %> 
    
<%

ArrayList<Menu> cartItems = (ArrayList<Menu>) session.getAttribute("cartItems");

// retrieve information from the checkoutservlet about the order and update the total price of the order
Order order = (Order) request.getAttribute("order");

//need to figure out when customerID is initialized and how to keep track of it
Customer cust = (Customer) session.getAttribute("cust");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="style.css" type="text/css" rel="stylesheet">
<title>Tony's Pizza Checkout</title>
</head>
<body>
<h1>Tony's Pizza Checkout</h1>
<p>Bring up current order (w/ picture and add/minus buttons at top of form)</p>

<p> <%= order.toString() %></p>

<form name="checkout" action="EndOrderServlet" method="post">
<ul>
	<li>
        <label for="fName">First Name: </label>
        <input type="text" name ="fName" id="fName" value="" /> 
    </li> 
    <li>
        <label for="lName">Last Name: </label>
        <input type="text" name ="lName" id="lName" value="" /> 
    </li> 
    <li>
        <label for="phone">Phone Number: </label>
        <input type="text" name ="phone" id="phone" value="" /> 
    </li> 
	<li>
        <label for="email">Email Address: </label>
        <input type="text" name ="email" id="email" value="" /> 
    </li>   
    <li>
    	<label for="pass">Password: </label>
		<input type="password" name ="pass" id="pass" value="" /> 
    </li>
    <li>
        <label for="address">Street Address: </label>
        <input type="text" name ="address" id="address" value="" /> 
    </li>  
    <li>
        <label for="city">City: </label>
        <input type="text" name ="city" id="city" value="" /> 
    </li>  
    <li>
        <label for="state">State: </label>
        <input type="text" name ="state" id="state" value="" /> 
    </li>  
    <li>
        <label for="zip">Zip Code: </label>
        <input type="text" name ="zip" id="zip" value="" /> 
    </li>  
    <li>
    	<input type="submit" name="Submit Order" />
    </li>
</ul>
 
</form>
<form name="cancel" action="index.jsp">
<input type="submit" name="cancel" value="Cancel Order" >
</form>
</body>
</html>
