package wipro.wrapper;

public class Employee implements Cloneable{
	int emp_no;
	double Salary;
	String designation; 
	
	Employee(int emp_no, double Salary, String designation){
		this.emp_no = emp_no;
		this.Salary = Salary;
		this.designation = designation;
	}
	
	void printDetails(){
		System.out.println("The details are as follows: \nEmployee no.: "+emp_no+"\nSalary: "+Salary+"\nDesignation: "+designation);
	}
	
	public Employee cloneTest(){
		try{
			return (Employee)super.clone();
		}catch(CloneNotSupportedException e){
			System.out.println(e);
			return this;
		}
		
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(1234, 30000, "Project Engineer");
		
		Employee emp2 = emp1.cloneTest();
		
		emp1.printDetails();
		System.out.println();
		emp2.printDetails();
		System.out.println();
		
		emp1.emp_no = 5678;
		emp1.Salary = 50000;
		emp1.designation = "Project Engineer";
		
		emp1.printDetails();
		System.out.println();
		emp2.printDetails();
		
	}

}
