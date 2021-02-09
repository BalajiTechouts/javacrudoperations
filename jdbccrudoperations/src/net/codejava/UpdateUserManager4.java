package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateUserManager4 {
public static void main (String[] args){
		
		String jdbcurl="jdbc:mysql://localhost:3306/sampledb";
		String dbusername="root";
		String dbpassword="root";
		String userpassword="natangi";
		String useremail="ravidada@gmail.com";
		String userfullname="ravidada@gmail.com";
		
		String username="kumar";
		
		String sql="UPDATE users SET userpassword = ?, userfullname=?, useremail=? Where username=?";
		
		try{
		Connection connection=DriverManager.getConnection(jdbcurl, dbusername,dbpassword);
		PreparedStatement statement= connection.prepareStatement(sql);
		statement.setString(1,userpassword);
		statement.setString(2,userfullname);
		statement.setString(3,useremail);
		statement.setString(4,username);
		int rows= statement.executeUpdate();
		
		if(rows>0){
			
			System.out.println("one row updated");
			
		}
		
		
		connection.close();
		
		
		}
		catch(SQLException ex){
			
			ex.printStackTrace();
			
		}
		
		
		
		
		
		
		
	}
}
