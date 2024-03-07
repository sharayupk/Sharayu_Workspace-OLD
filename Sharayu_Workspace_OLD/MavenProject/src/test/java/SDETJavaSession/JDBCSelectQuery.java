package SDETJavaSession;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSelectQuery {

	public static void main(String[] args) throws SQLException 
	{
		//Create Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		
		//Create Statement
		Statement stmt=con.createStatement();
		String s="select EmpId,EmpName,Salary from employee";
		
		//Execute Query
		ResultSet rs=stmt.executeQuery(s);
		
		while(rs.next())
		{
			int empId=rs.getInt("EmpId");
			String empName=rs.getString("EmpName");
			int sal=rs.getInt("Salary");
			
			System.out.println(empId+"     "+empName+"    "+sal);
			
		}
		
		//Close Connection
		con.close();
		
		System.out.println("Program is Completed");
	}

}
