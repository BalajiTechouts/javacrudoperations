package net.codejava;
 // here we just checking wheter the connection to db is occured or not check next 
//class i.e UsersManager1 in same package where we are inserting values in db
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UsersManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbcURL="jdbc:mysql://localhost:3306/sampledb";
		String username="root";
		String password="root";
		try {
			Connection connection=DriverManager.getConnection(jdbcURL, username, password);
			
			if(connection!=null){
				System.out.println("Connected to data base");//just to Check Whether it is Connected to db or not
				//if printed then sysout statement will be prited on console if not we get sql exception saying no sutable driver found so we have to use mysql connector in order to connect with database. 
				connection.close();
			}
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
