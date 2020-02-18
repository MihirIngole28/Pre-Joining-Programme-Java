package com.mile1.service;

import com.mile1.bean.*;
import com.mile1.exception.*;

public class StudentReport {
	public String findGrade(Student studentObject){
		int a[] = studentObject.getMarks();
		int flag = 0;
		int sum = 0;
		String grade;
		
		for(int i = 0;i < 3; i++){
			if(a[i]<35)
				flag++;
		}
		
		if(flag > 0){
			grade = "F";
		}
		
		else{
			for(int j = 0; j < 3; j++){
				sum = sum + a[j];
			}
			if(sum <= 150 ){
				grade = "D";
			}
			else if(sum > 150 && sum <= 200){
				grade = "C";
			}
			else if(sum > 200 && sum <= 250){
				grade = "B";
			}
			else{
				grade = "A";
			}
		}
		return grade;
		
	}
	
	public String validate(Student studentObject) throws NullStudentException,
	NullNameException,NullMarksArrayException{
		
		String result = "";
		try{
			if(studentObject == null){
				throw new NullStudentException();
			}
			else if(studentObject.getName() == null){
				throw new NullNameException();
			}
			else if(studentObject.getMarks() == null){
				throw new NullMarksArrayException();
			}
			else{
				result = findGrade(studentObject);
			}
		}catch(Exception e){
			result = e.toString();
		}
		return result;
	}
}
