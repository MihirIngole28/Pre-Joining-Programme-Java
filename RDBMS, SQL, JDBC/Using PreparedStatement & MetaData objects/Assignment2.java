package JDBC3;
import java.sql.*;
import java.io.*;
import java.util.*;

public class Assignment2 {

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

		int rollno = 0;
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("Enter Roll no. :");
			String rollstr = sc.nextLine();
			
			try{
				rollno = Integer.parseInt(rollstr);
				if(String.valueOf(rollno).length() != 4) rollno = 4;
			}catch(Exception e){}
		}while(rollno == 0);
		
		
		String studentName = "";
		boolean lowercasefound;
		
		do {
			System.out.print("Enter name: ");
			studentName = sc.nextLine();
			
			lowercasefound = false;
			for (int i = 0; i < studentName.length(); i++) {
				if (Character.isLowerCase(studentName.charAt(i))) {
					lowercasefound = true;
					break;
				}
			}
			
		} while (studentName.length() > 20 || lowercasefound);
		
		String standard = "";
		String[] standards = {"I", "II", "III", "IV", "V", "Vi", "VII", "VIII", "IX", "X"};
		List<String> list = new ArrayList<>(Arrays.asList(standards));
		do {
			System.out.print("Enter standard: ");
			standard = sc.nextLine();
		} while (!list.contains(standard));

		System.out.print("Enter D.O.B.: ");
		String dob = sc.nextLine();
		
		Double fees = 0.0;
		do {
			System.out.print("Enter fees: ");
			if (sc.hasNextDouble())
				fees = sc.nextDouble();
		} while (fees == 0.0);
		
		String sql = "INSERT INTO Students VALUES(?,?,?,?,?)";
		try{
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rollno);
			pstmt.setString(2, studentName);
			pstmt.setString(3, standard);
			pstmt.setString(4, dob);
			pstmt.setDouble(5, fees);
			pstmt.executeQuery();
		}catch(Exception e){
			System.out.println("Insertion Error");
			pstmt.close();
			conn.close();
		}
		
	}

}
