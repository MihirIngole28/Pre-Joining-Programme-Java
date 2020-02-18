package JDBC3;
import java.sql.*;
import java.io.*;

public class DAOClass {
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	public Connection myConnection() throws SQLException{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
			return conn;
		}catch(Exception e){
			System.out.println("The connection could not be established");
			if(conn != null) conn.close();
		}
		return conn;
	}
	
	public void insert(int rollno, String StudentsName, String std, String DOB, double fees){
		String sql = "INSERT INTO Students VALUES (?,?,?,?,?)";
		try{
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rollno);
			pstmt.setString(2, StudentsName);
			pstmt.setString(3, std);
			pstmt.setString(4, DOB);
			pstmt.setDouble(5, fees);
			pstmt.executeUpdate();
			
			System.out.println("Insertion successfull");
		}catch(Exception e){
			System.out.println("Insertion error");
		}	
		
	}
	
	public void delete(int rollno){
		String sql = "DELETE Students WHERE rollno = ?";
		
		try{
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rollno);
			pstmt.executeUpdate();
			
			System.out.println("Deletion successfull");
		}catch(Exception e){
			System.out.println("DEletion error");
		}
	}
	
	public void modify(int rollno, double fee){
		String sql = "MODIFY Students SET fee = ? WHERE rollno = ?";
		try{
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rollno);
			pstmt.setDouble(2, fee);
			pstmt.executeUpdate();
			
			System.out.println("Modification successfull");
		}catch(Exception e){
			System.out.println("Modification error");
		}	
		
	}
	
	public void display(int rollno){
		String sql = "SELECT * FROM Students WHERE rollno = ?";
		
		try{
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rollno);
			
			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			
			while(rs.next()){
				StringBuffer sb = new StringBuffer();
				
				for(int i = 1; i<= rsmd.getColumnCount(); i++){
					String columnName = rsmd.getColumnName(i);
					
					sb.append(rs.getObject(columnName));
					if(i != rsmd.getColumnCount()) sb.append(", ");
				}
				System.out.println(sb);
				
			}
			System.out.println("Display successfull");
		}catch(Exception e){
			System.out.println("Display error");
		}
	}
	
	public void display(){
		String sql = "SELECT * FROM Students";
		
		try{
			pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();			
			ResultSetMetaData rsmd = rs.getMetaData();
			
			while(rs.next()){
				StringBuffer sb = new StringBuffer();
				
				for(int i = 1; i <= rsmd.getColumnCount(); i++){
					String columnName = rsmd.getColumnName(i);
					
					sb.append(rs.getObject(columnName));					
					if(i != rsmd.getColumnCount()) sb.append(", ");
				}
			}
			System.out.println("Display successfull");
		}catch(Exception e){
			System.out.println("Display error");
		}
	}

}
