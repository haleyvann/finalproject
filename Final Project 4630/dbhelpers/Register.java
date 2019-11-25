package dbhelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.NewUser;

public class Register {
	
	public Connection connection;
	
	public Register(String netappsdb, String root, String pwd) {
		
		String url = "jdbc:mysql://localhost:3306/" + netappsdb;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url,root,pwd);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void doRegister(Customer cust) {
		
		String query = "insert into customers (fName, lName, userName, password, phone) values(?,?,?,?,?)";
		
		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			
			ps.setString(1, cust.getfName());
			ps.setString(2, cust.getlName());
			ps.setString(3, cust.getEmail());
			ps.setString(4, cust.getPassword());
			ps.setString(5, cust.getPhone());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
