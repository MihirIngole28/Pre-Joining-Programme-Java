package JDBC3;
import java.sql.*;
import java.io.*;
import java.util.*;

public class Assignment4 {

	public static void main(String[] args) throws SQLException{
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		}catch(Exception e){
			System.out.println("Connection not established");
			if(conn != null) conn.close();
		}
		int rollno = Integer.parseInt(args[0]);
		double fee = Double.parseDouble(args[1]);
		try{
			String sql = "UPDATE Student SET fees = ? WHERE rollno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rollno);
			pstmt.setDouble(2, fee);
			if (pstmt.executeUpdate() == 1)
				System.out.println("Fees of student having rollno = " + rollno + " updated successfully");
			else
				System.out.println("Modification Error");
		}catch(Exception e){
			System.out.println("Process not completed");
		}
	}

}
