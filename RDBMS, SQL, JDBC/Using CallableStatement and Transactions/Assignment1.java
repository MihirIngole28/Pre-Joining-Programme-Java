package JDBC4;
import java.sql.*;
import java.io.*;

public class Assignment1 {

	public static void main(String[] args) throws SQLException{
		Connection conn = null;
		Statement stmt = null;
		CallableStatement cstmt = null;
		ResultSet rs;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		}catch(Exception e){
			System.out.println("Connection not created");
		}
		
		
		try{
			String sql = "SELECT * FROM emp";
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				double netSalary = 0;
				
				String sql2 = "{ call calculate_salary(?, ?)}";
				
				cstmt = conn.prepareCall(sql2);
				cstmt.setInt(1, empno);
				cstmt.registerOutParameter(2, Types.DOUBLE);
				cstmt.executeQuery();
				netSalary = cstmt.getDouble(2);
				
				System.out.println("empno: " + empno + ", ename: " + ename + ", net salary: " + netSalary);
			}	
			
		}catch(Exception e){
			System.out.println("Process not completed");
			stmt.close();
			cstmt.close();
			conn.close();
		}

	}

}
