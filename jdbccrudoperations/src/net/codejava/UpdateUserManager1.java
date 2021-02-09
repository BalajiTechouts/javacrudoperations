package net.codejava;
// in the next program i.e in UpdateUserManager4 we update Through Prepare Statement.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateUserManager1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jddburl="jdbc:mysql://localhost:3306/sampledb";
		String dbusername="root";
		String dbpassword="root";
		try{
		Connection connection=DriverManager.getConnection(jddburl, dbusername, dbpassword);
		String sql="UPDATE users SET userpassword='ravisurya' Where username='kumar'";
		Statement statement=connection.createStatement();
		int rows=statement.executeUpdate(sql);
		if(rows>0){
			
			System.out.println("The users information has been updated");
		}
		
			
		}
		catch(SQLException e){
			
			e.printStackTrace();
		}
		
		
	}
		
}
