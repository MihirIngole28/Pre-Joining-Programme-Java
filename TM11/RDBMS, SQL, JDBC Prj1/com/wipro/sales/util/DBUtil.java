package com.wipro.sales.util;
import java.sql.*;

public class DBUtil{
	
	
	public static Connection getDBConnection() throws SQLException{
		Connection conn = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		}catch(Exception e){
			System.out.println("Connection not established");
			if(conn != null)conn.close();
		}
		return conn;
	}
}
