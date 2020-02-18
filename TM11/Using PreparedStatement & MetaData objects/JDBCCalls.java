package JDBC3;
import java.sql.*;
import java.io.*;

public class JDBCCalls {

	public static void main(String[] args) {
		int num = 0;
		int rollno;
		String StudentName = args[2];
		String std = args[3];
		String DOB = args[4];
		double fees;
		
		rollno = Integer.parseInt(args[1]);
		fees = Double.parseDouble(args[5]);
		
		DAOClass dbms = new DAOClass();
		
		num = Integer.parseInt(args[0]);
		switch(num){
		case 1: dbms.insert(rollno, StudentName, std, DOB, fees);
		break;
		case 2: dbms.delete(rollno);
		break;
		case 3: dbms.modify(rollno, fees);
		break;
		case 4: if(args[1] != null) dbms.display(rollno);
				else dbms.display();
		break;
		
		default:
			System.out.println("Invalid Input");
		}

	}

}
