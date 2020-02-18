package com.mile1.service;

import com.mile1.bean.*;
import com.mile1.exception.*;

public class StudentService {
	
	public int findNumberOfNullMarks(Student data[]){
		
		int k=0;
		
		for(int i = 0; i < data.length; i++){
			if(data[i] == null){
				
			}
			else if(data[i].getMarks()==null){
				k++;
			}
		}
		
		return k;
	}
	
	public int findNumberOfNullNames(Student data[]){
		
		int k=0;
		
		for(int i = 0; i < data.length; i++){
			if(data[i] == null){
				
			}
			else if(data[i].getName()==null){
				k++;
			}
		}
		
		return k;
	}

	public int findNumberOfNullObjects(Student data[]){
		
		int k=0;
		
		for(int i = 0; i < data.length; i++){
			if(data[i] == null){
				k++;
			}
		}
		
		return k;
	}
	
}
