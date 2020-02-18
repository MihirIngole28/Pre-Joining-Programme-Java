package JDBC3;
import java.sql.*;
import java.io.*;
import java.util.*;

public class Assignment5 {

	public static void main(String[] args) throws SQLException{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		}catch(Exception e){
			System.out.println("Connection not established");
			if(conn != null) conn.close();
		}
		
		int rollno = 0;
		String sql = "";
		Scanner sc = new Scanner(System.in);
		rollno = sc.nextInt();
		
		
		
		try{
			if(rollno != 0){
				sql = "SELECT * FROM Student WHERE rollno = ?";
			}else{
				sql = "SELECT * FROM Student";
			}
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				int ROLLNO = rs.getInt("ROLLNO");
				String STUDENTNAME = rs.getString("STUDENTNAME");
				String STANDARD = rs.getString("STANDARD");
				String DATE_OF_BIRTH = rs.getString("DATE_OF_BIRTH");
				double FEES = rs.getDouble("FEES");
				
				System.out.println(ROLLNO + " " + STUDENTNAME + " " + STANDARD + 
						" " + DATE_OF_BIRTH + " " + FEES);
				
			}
		}catch(Exception e){
			System.out.println("Process not complete");
		}
	}

}
