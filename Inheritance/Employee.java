package Inheritance;

public class Employee extends Person {
	double Salary;
	int YoJ;	// Year of joining
	String NIN;  // National Insurance number
	

	public Employee(String name){
		super(name);
	}
	
	void setSalary(double Salary){
		this.Salary = Salary;
	}
	
	void setYoJ(int YoJ){
		this.YoJ = YoJ;
	}
	
	void setNIN(String NIN){
		this.NIN = NIN;
	}
	
	void getSalary(){
		System.out.println("The salary of the Employee is Rs."+ Salary);
	}
	
	void getYoJ(){
		System.out.println("The year of joining of the Employee is "+ YoJ);
	}
	
	void getNIN(){
		System.out.println("The National Insurance Number of the Employee id "+ NIN);
	}
}