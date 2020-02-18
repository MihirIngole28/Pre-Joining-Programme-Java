package wipro.list;

import java.util.*;
import wipro.list.bean.*;

public class Assignment2 {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1002,"Mihir", "m.ingole@gmail.com","Male", 350000);
		Employee emp2 = new Employee(1001,"Sheldon", "shel.coop@gmail.com", "Male", 4500000);
		Employee emp3 = new Employee(1003,"Leonard", "l.wolowitz@yahoo.com", "Male", 650000);
		Employee emp4 = new Employee(1004,"Bernadette", "bernadatte04@hotmail.com", "Female", 320000);
		
		EmployeeDB empDB = new EmployeeDB();
		
		empDB.addEmployee(emp1);
		empDB.addEmployee(emp2);
		empDB.addEmployee(emp3);
		empDB.addEmployee(emp4);
		
		empDB.deleteEmployee(1003);
		
		System.out.println(empDB.showPaySlip(1004));
		
		for(Employee emp : empDB.listAll()){
			emp.GetEmployeeDetails();
			System.out.println();
		}
	}

}