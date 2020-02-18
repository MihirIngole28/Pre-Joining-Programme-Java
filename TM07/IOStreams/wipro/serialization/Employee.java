package wipro.serialization;
import java.io.*;
import java.util.*;
import java.text.*;

public class Employee implements Serializable{
	
	String name;
	Date dateOfBirth;
	String department, designation;
	double salary;
	
	public Employee(){
		System.out.println("Employee constructor before serialization and deserialization");
	}
	
	void setName(String name){
		this.name = name;
	}
	
	void setDOB(String dateOfBirth){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
		try {
			this.dateOfBirth = sdf.parse(dateOfBirth);
            System.out.println(this.dateOfBirth);
        } catch (ParseException e) {
            e.printStackTrace();
        }
		
	}
	
	void setDepartment(String department){
		this.department = department;
	}
	
	void setDesignation(String designation){
		this.designation = designation;
	}
	
	void setSalary(double salary){
		this.salary = salary;
	}
	
	void getDetails(){
		System.out.println("The details are as follows:\n 1). Name: "+this.name+"\n 2). Date of Birth: "+this.dateOfBirth+"\n "
				+ "3). Department: "+this.department+"\n 4). Designation: "+this.designation+"\n 5). Salary: "+this.salary);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Employee emp1 = new Employee();
		emp1.setName("Mihir Ingole");
		emp1.setDOB("28-06-1998");
		emp1.setDepartment("TRB2");
		emp1.setDesignation("Project Engineer");
		emp1.setSalary(350000);
		
		//emp1.getDetails();
		
		
		FileOutputStream fout;
		
		
		try{
			fout= new FileOutputStream("serial");
		}catch(FileNotFoundException e){
			System.out.println("File not found");
			return;
		}
		
		//Serializtion
		try{
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(emp1);
			oos.flush();
			oos.close();
		}catch(IOException e){
			System.out.println("File error");
		}
		
		//Deserialization
		
		try{
			Employee emp2;
			FileInputStream finp = new FileInputStream("serial");
			ObjectInputStream ois = new ObjectInputStream(finp);
			emp2 = (Employee)ois.readObject();
			ois.close();
			emp2.getDetails();
			finp.close();
			fout.close();
		}catch(IOException e){
			System.out.println("");
		}catch(ClassNotFoundException e){
			System.out.println("Class not found");
		}
		
		

	}

}
