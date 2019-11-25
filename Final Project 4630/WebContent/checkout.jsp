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
//still need to get price of each item to put with the order to find total price


// retrieve information from the checkoutservlet about the order and update the total price of the order
Order order = (Order) session.getAttribute("order");

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
<br>
<h4>Order Information</h4>

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
    <li>
    <h4>Credit Card Information</h4>
    </li>
    <li>
        <label for="ccNumber">Credit Card Number: </label>
        <input type="text" name ="number" id="ccNumber" value="" /> 
    </li>  
    <li>
    <li>
        <label for="ccExpDate">Expiration Date: </label>
        <input type="text" name ="date" id="ccExpDate" value="" /> 
    </li>  
    <li>
    <li>
        <label for="ccCCV">CCV: </label>
        <input type="text" name ="ccv" id="ccCCV" value="" /> 
    </li>  
    <li>
    	<input type="submit" name="Submit Order" />
    </li>
</ul>
 
</form>
<a href="index.jsp">Cancel Order</a>
</body>
</html>
