package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteUserManager {
	
	public static void main (String[] args){
		
		String jdbcurl="jdbc:mysql://localhost:3306/sampledb";
		String dbusername="root";
		String dbpassword="root";
		String username="BALAJI";
		
		String sql="DELETE FROM users Where username=?";
		
		try{
		Connection connection=DriverManager.getConnection(jdbcurl, dbusername,dbpassword);
		PreparedStatement statement= connection.prepareStatement(sql);
		statement.setString(1, username);
		int rows= statement.executeUpdate();
		
		if(rows>0){
			
			System.out.println("one row deleted");
			
		}
		
		
		connection.close();
		
		
		}
		catch(SQLException ex){
			
			ex.printStackTrace();
			
		}
		
		
		
		
		
		
		
	}

}
