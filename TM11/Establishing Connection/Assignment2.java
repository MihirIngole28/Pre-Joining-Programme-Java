package JDBC1;
import java.sql.*;
import java.io.*;

public class Assignment2 {

	public static void main(String[] args) throws SQLException{
		Connection conn = null;
		
		try{
			//Class.forName("oracle.jdbc.driver:OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhoat:1521:orcl","hr","hr");
			System.out.println("Connection established Successfully");
		}catch(Exception e){
			System.out.println("Connection could not be established");
		}

	}

}
