package JDBC2;
import java.sql.*;
import java.io.*;

public class Assignment1 {

	public static void main(String[] args) throws SQLException{
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
			System.out.println("Connection established successfully");
		}catch(Exception e){
			System.out.println("Connection could not be established");
			if(conn != null) conn.close();
		}
		
		String sql = "SELECT empno , ename FROM emp";
		stmt = conn.createStatement();
		rset = stmt.executeQuery(sql);
		
		while(rset.next()){
			System.out.println("Employee no. : "+rset.getInt(1)+"\nEmployee Name : "+rset.getString("ename"));
		}		
		
		if(stmt != null) stmt.close();
		if(rset != null) rset.close();
	}

}
