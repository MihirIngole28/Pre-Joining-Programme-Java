package JDBC3;
import java.sql.*;
import java.io.*;
import java.util.*;

public class Assignment3 {

	public static void main(String[] args) throws SQLException{
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		}catch(Exception e){
			System.out.println("Connection not established");
			if(conn != null)conn.close();
		}

		int rollno = 0;
		Scanner sc = new Scanner(System.in);
		
		
		try{
			String sql = "INSERT INTO StudentLog FROM Student WHERE rollno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rollno);
			int log = pstmt.executeUpdate();
			
			sql = "DELETE Students WHERE rollno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rollno);

			if (pstmt.executeUpdate() == 1 && log == 1)
				System.out.println("Student record having rollno = " + rollno + " deleted successfully");
			else
				System.out.println("Deletion Error");
			
		}catch(Exception e){
			System.out.println("Process not completed");
			conn.close();
			pstmt.close();
		}	
		
	}

}
