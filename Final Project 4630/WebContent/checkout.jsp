<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="model.Order" %>
<%@ page import="model.Customer" %>  
<%@ page import="model.Menu" %>  
<%@ page import="java.util.Date" %>
<%@ page import="java.text.DateFormat" %>  
<%@ page import="java.text.SimpleDateFormat" %> 
    
<%
DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
Date date = new Date();

// retrieve information from the cartservlet
Order order = new Order(1, dateFormat.format(date), 0, 0);
//need to figure out when customerID is initialized and how to keep track of it
Customer customer = new Customer();
Menu menu = new Menu();

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tony's Pizza Checkout</title>
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
<h1>Tony's Pizza Checkout</h1>
<p>Bring up current order (w/ picture and add/minus buttons at top of form)</p>

<form name="checkout" action="CheckoutServlet" method="post">

<input type="hidden" name="orderID" value="<%= order.getOrderID() %>" />  
<input type="hidden" name="orderDate" value="<%= order.getOrderDate() %>" /> 
<input type="hidden" name="customerID" value="<%= customer.getCustomerID() %>"/>
<input type="hidden" name="menuID" value="<%= menu.getMenuID() %>" /> 
<input type="hidden" name="quantity" value="<%= order.getOrderQuantity() %>" />
<input type="hidden" name="price" value="<%= order.getPrice() %>" />
<input type="submit" name="Submit Order" />
 
</form>
<form name="cancel" action="index.jsp">
<input type="submit" name="cancel" value="Cancel Order" >
</form>
</body>
</html>
