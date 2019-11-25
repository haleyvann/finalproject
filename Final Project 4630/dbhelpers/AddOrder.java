package dbHelpers;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Customer;
import model.Menu;
import model.Order;

public class AddOrder {
	
	public Connection connection;
	
	public AddOrder(String dbName, String uname, String pwd){
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd); 
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doAdd(Order order, Customer cust, Menu menu){
		String query = "insert into orders (orderID, orderDate, Customers_CustomerID,"
				+ " Menu_MenuID, orderQuantity, Revenue) values (?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setInt(1, order.getOrderID());
			ps.setString(2, order.getOrderDate());
			ps.setInt(3, cust.getCustomerID());
			ps.setDouble(4, menu.getMenuID());
			ps.setDouble(5, order.getOrderQuantity());
			ps.setDouble(6, order.getRevenue());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
