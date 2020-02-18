package Inheritance;


class Teacher extends Person{
	double Salary;
	String subject;
	
	Teacher(String name, String DOB){
		super(name,DOB);
	}
	
	void setSalary(double Salary){
		this.Salary = Salary;
	}
	
	void setSubject(String subject){
		this.subject = subject;
	}
	
	void getSalary(){
		System.out.println("The salary is "+ Salary+".");
	}
	
	void getSubject(){
		System.out.println(name+" teaches "+ subject +" subject.");
	}
}

class Student extends Person {
	String studentID;
	
	Student(String name){
		super(name);
		this.studentID = studentID;
	}
	
	void setStudentID(String studentID){
		 this.studentID = studentID;
	}
	void getStudentID(){
		System.out.println("Student ID is "+ studentID);
	}
}

class CollegeStudent extends Student{
	String collegeName;
	String Year;
	
	CollegeStudent(String name, String collegeName, String Year){
		super(name);
		this.collegeName = collegeName;
		this.Year = Year;
	}
	
	void getClgName(){
		System.out.println("The student belongs to "+collegeName+" college");
	}
	
	void studYear(){
		System.out.println("The student is in "+Year+" year");
	}	
}



public class TestCollege{
	public static void main(String[] args){
		Teacher th = new Teacher("Mrs Deshpande","15-07-1971");
		Student st = new Student("Agnij Dave");
		CollegeStudent cs = new CollegeStudent("Darshan Kumar"," Sinhgad Academy of Engg.","fourth");
		
		
		th.setSalary(210000);
		th.setSubject("Machine Learning");
		
		th.getName();
		th.getSalary();
		th.getSubject();
		
		System.out.println();
		
		st.setStudentID("AD20196041");
		st.getName();
		st.getStudentID();
		
		System.out.println();
		
		cs.getName();
		cs.setStudentID("DK20193871");
		cs.getStudentID();
		cs.getClgName();
		cs.studYear();
	}
}

