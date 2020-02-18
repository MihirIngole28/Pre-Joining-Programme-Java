package main;
import java.util.*;

import bean.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter the Number of Employees");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		ArrayList<Employee> elist = new ArrayList<Employee>();
		
		for(int i = 1; i<=num; i++){
			System.out.println("Enter Employee "+i+" Details:");
			System.out.println("Enter the Firstname");
			if(i==1)sc.nextLine();
			String firstName = sc.nextLine();
			System.out.println("Enter the Lastname");
			String lastName = sc.nextLine();
			System.out.println("Enter the Mobile");
			long mobno = sc.nextLong();
			System.out.println("Enter the Email");
			sc.nextLine();
			String email = sc.nextLine();
			System.out.println("Enter the Address");
			String address = sc.nextLine();
			
			elist.add(new Employee(firstName, lastName, mobno, email, address));
		}
		
		Collections.sort(elist);
		
		System.out.println("Employee List: ");
		System.out.format("%-15s %-15s %-15s %-30s %-15s\n","Firstname","Lastname","Mobile","Email","Address");
		
		Iterator<Employee> it = elist.iterator();
		while(it.hasNext()){
			Employee emp = it.next();
			System.out.format("%-15s %-15s %-15s %-30s %-15s\n",emp.getFirstName(),emp.getLastName(),
					emp.getMobileNumber(),emp.getEmail(),emp.getAddress());
		}
		
		
	}

}
