package main;
import bean.*;

import java.io.*;
import java.util.*;

public class EmpManSysTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		int empId;
		int empAge;
		String empName = "";
		double salary;
		
		Scanner sc = new Scanner(System.in);
		
		FileOutputStream fos = new FileOutputStream("serial");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		FileInputStream fis = new FileInputStream("serial");
		ObjectInputStream ois = new ObjectInputStream(fis);;
		
		int choice;
		
		
		do{
			
			System.out.println("Main Menu\n1. Add an Employee\n2. Display All\n3. Exit");
			choice = sc.nextInt();
			switch(choice){
			case 1:  EmployeeDetails emp = new EmployeeDetails();
				System.out.println("Enter Employee ID: ");
				empId = sc.nextInt();
				emp.setEmpId(empId);
				sc.nextLine();
				System.out.println("Enter Employee Name: ");
				empName = sc.nextLine();
				emp.setEmpName(empName);
				System.out.println("Enter Employee Age: ");
				empAge = sc.nextInt();
				emp.setEmpAge(empAge);
				System.out.println("Enter Employee Salary: ");
				salary = sc.nextDouble();
				emp.setSalary(salary);
				oos.writeObject(emp);
				break;
				
			case 2: System.out.println("----Report-----");
				emp = null;
				while(fis.available()>0){
					emp = (EmployeeDetails)ois.readObject();
					System.out.println(emp);
				}
				System.out.println("----End of Report-----");
				break;
			
			default: 
				break;
			}
		}while(choice != 3);
		
		fos.close();
		fis.close();
		sc.close();
		oos.close();
		ois.close();
	}

}
