package Inheritance;

public class Person {
	String name;
	String DOB;
	
	public Person(){
		System.out.println("Person class");
	}
	
	public Person(String name){
		this.name = name;
	}
	
	public Person(String name,String DOB){
		this.name = name;
		this.DOB = DOB;
	}
	
	void getName(){
		System.out.println("The name is "+ name);
	}
}
