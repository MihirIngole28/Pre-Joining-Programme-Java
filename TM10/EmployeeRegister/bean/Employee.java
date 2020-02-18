package bean;

public class Employee implements Comparable<Employee>{
	String firstName;
	String lastName;
	long mobno;
	String email;
	String address;
	
	public Employee(String firstName, String lastName, long mobno, String email,	String address){
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobno = mobno;
		this.email = email;
		this.address = address;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public long getMobileNumber(){
		return mobno;
	}
	
	public String getEmail(){
		return email;
	}
	
	public String getAddress(){
		return address;
	}
	
	public String toString(){
		return firstName+" "+lastName+" "+mobno+" "+email+" "+address;
	}
	
	public int compareTo(Employee emp) {
		return this.firstName.compareTo(emp.getFirstName()) * -1;
	}
}
