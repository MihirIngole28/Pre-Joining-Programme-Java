package wipro.list.bean;

import wipro.list.bean.*;
import java.util.*;

public class EmployeeDB {
	List<Employee> empDB = new ArrayList<>();
	
	public boolean addEmployee(Employee e){
		return empDB.add(e);
	}
	
	public boolean deleteEmployee(int EmpId){
		
		boolean flag = false;
		for(Iterator<Employee> it = empDB.iterator(); it.hasNext();){
			 Employee emp = it.next();
			 if(emp.getEmpId() == EmpId){
				 it.remove();
				 flag = true;
			 }
		}
		return flag;
	}
	
	public String showPaySlip(int empId){
		String paySlip = "";
		for(Iterator<Employee> it = empDB.iterator(); it.hasNext();){
			Employee emp = it.next();
			if(emp.getEmpId() == empId){
				paySlip = "Pay slip of Employee ID: "+empId+" is "+emp.getSalary();
				break;
			}
			else{
				paySlip = "Invalid Employee ID";
			}			
		}
		
		return paySlip;
	}
	
	public Employee[] listAll(){
		Employee[] empArr = new Employee[empDB.size()];
		
		for(int i=0; i < empDB.size(); i++)
			empArr[i] = empDB.get(i);
		return empArr;
	}
	
}
