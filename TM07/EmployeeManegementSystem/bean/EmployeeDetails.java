package bean;
import java.io.*;

public class EmployeeDetails implements Serializable{
	int empId;
	int empAge;
	String empName;
	double salary;
	
	public void setEmpId(int empId){
		this.empId = empId;
	}
	
	public void setEmpAge(int empAge){
		this.empAge = empAge;
	}
	
	public void setEmpName(String empName){
		this.empName = empName;
	}
	
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	public String toString(){
		return empId+" "+empName+" "+empAge+" "+salary;
	}
}
