package dbhelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CheckoutQuery {
	
	private Connection connection;
	private ResultSet results;
	
	public CheckoutQuery(String netappsdb, String root, String pwd) {
		String url = "jdbc:mysql://localhost:3306/" + netappsdb;
		
		//setup driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url,root,pwd);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int checkInv(int menuID, int quantity) {
		int qtyCheck = 0;
		
		String query = "select quantity from Inventory where inventoryID=?";
		
		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			
			ps.setInt(1, menuID);
			this.results = ps.executeQuery();
			
			qtyCheck = this.results.getInt("quantity") - quantity;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return qtyCheck;
		
	}

	public void updateInv(int menuID, int qtyCheck) {
		
		String query = "update Inventory set quantity=? where inventoryID=?";
		
		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			
			ps.setInt(1, qtyCheck);
			ps.setInt(2, menuID);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
