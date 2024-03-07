package SDETJavaSession;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{   
		
		//Create Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		
		//Create Statement/Query
		Statement stmt=con.createStatement();
		//String s="insert into employee values(5,'Scott',60,'scott@gmail.com')";
		//String s="update employee set EmpName='Tom' where EmpId=4";
		String s="delete from employee where EmpId=3";
		
		//Execute Statement
		stmt.executeUpdate(s);
		
		//Close Connectiom
		con.close();
		
		System.out.println("Program is Completed");
		

	}

}
