package dbhelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Validate {
	
	private Connection connection;
	private ResultSet results;
	
	public Validate(String netappsdb, String root, String pwd) {
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
	
	public boolean checkUser(String email, String pass) {
		
        boolean st = false;
        
        try {
        	PreparedStatement ps = this.connection.prepareStatement("select * from customers where userName=? and password=?");
            ps.setString(1, email);
            ps.setString(2, pass);
            this.results = ps.executeQuery();
            st = this.results.next();

        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return st;                 
    }   
}
