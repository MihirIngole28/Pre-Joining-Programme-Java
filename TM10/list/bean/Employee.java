package wipro.list.bean;

public class Employee {
	
	int empId;
	String empName;
	String email;
	String gender;
	float salary;
	
	public Employee(int empId, String empName, String email, String gender, float salary){
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.gender = gender;
		this.salary = salary;
	}
	
	public void GetEmployeeDetails(){
		System.out.println("The details are as follows:\n 1). Employee ID: "+this.empId+"\n 2). Employee Name: "+this.empName+"\n "
				+ "3). E-mail Id: "+this.email+"\n 4). Gender: "+this.gender+"\n 5). Salary: "+this.salary);
	}
	
	public int getEmpId(){
		return this.empId;
	}
	
	public float getSalary(){
		return this.salary;
	}
	
	public String getEmpName(){
		return this.empName;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public String getGender(){
		return this.gender;
	}
	
	public String toString(){
		return "The details are as follows:\n 1). Employee ID: "+this.empId+"\n 2). Employee Name: "+this.empName+"\n "
				+ "3). E-mail Id: "+this.email+"\n 4). Gender: "+this.gender+"\n 5). Salary: "+this.salary;
	}

}
