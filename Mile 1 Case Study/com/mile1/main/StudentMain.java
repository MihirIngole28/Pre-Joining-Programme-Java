package com.mile1.main;
import com.mile1.bean.*;
import com.mile1.exception.*;
import com.mile1.service.*;


public class StudentMain {

	static Student data[] = new Student[8];
	
	static{
		for(int i=0;i < data.length; i++){
			data[i] = new Student();
		}		
		
		data [0] = new Student ("A1", new int [ ] {72, 73, 74});
		data [1] = new Student ("B1", new int [ ] {75, 76, 77});
		data [2] = new Student ("C1", new int[ ] {99, 99, 99});
		data [3] = new Student ("C3", new int[ ] {100, 100, 99});
		data [4] = new Student ("B2", new int[ ] {13, 88, 13});
		data [5] = new Student ("C3", new int[ ] {14, 14, 99});
		data [6] = new Student ("A2", new int[ ] {77, 55, 12});
		data [7] = new Student ("A5", new int[ ] {13, 88, 13});
	}
	
	public static void main(String[] args) {
		StudentReport StuRep = new StudentReport();
		StudentService StuSer = new StudentService();
		System.out.println (" Grades Calculation: ");
		String x = null;
		for(int i = 0; i<data.length; i++){
			try{
				x = StuRep.validate(data[i]);
			}catch(NullNameException e){
				x="NullNameException occurred";
			}
			catch(NullMarksArrayException e){
				x="NullMarksArrayException occurred";
			}
			catch(NullStudentException e){
				x="NullStudentException occurred ";
			}
			System.out.println ("GRADE="+x);
		}
		
		System.out.println ("Number of Objects with Marks array as null =" 
		+ StuSer.findNumberOfNullMarks (data));
		System.out.println ("Number of Objects with Name as null="
		+ StuSer.findNumberOfNullNames(data));
		System.out.println ("Number of Objects that are entirely null="
		+ StuSer.findNumberOfNullObjects(data));
		
	}

}
