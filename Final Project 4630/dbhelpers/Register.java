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
	
	public void doRegister(NewUser newUser) {
		
		String query = "insert into users (fName, lName, email, pass, phone) values(?,?,?,?,?)";
		
		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			
			ps.setString(1, newUser.getfName());
			ps.setString(2, newUser.getlName());
			ps.setString(3, newUser.getEmail());
			ps.setString(4, newUser.getPass());
			ps.setString(5, newUser.getPhone());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
