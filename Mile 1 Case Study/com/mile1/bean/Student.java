package com.mile1.bean;

public class Student {
	String name;
	int marks[] = new int[3];
	
	public Student(){
		
	}
	
	public Student(String name, int[] marks){
		this.name = name;
		this.marks = marks;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int[] getMarks(){
		return marks;
	}

}
