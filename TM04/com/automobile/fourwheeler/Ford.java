package com.automobile.fourwheeler;
import com.automobile.*;

public class Ford extends Vehicle{
	int Speed;
	String ModelName;
	String ownerName;
	String RegNo;
	
	Ford(String ModelName, String ownerName, String RegNo, int Speed){
		this.ModelName = ModelName;
		this.Speed = Speed;
		this.ownerName = ownerName;
		this.RegNo = RegNo;
	}
	
	public String getModelName(){
		return ModelName; 
	}
	
	public String getRegistrationNumber(){
		return RegNo;
	}
	
	public String getOwnerName(){
		return ownerName;
	}
	
	
	public int getSpeed(){
		return Speed;
	}
	
	public void tempControl(){
		System.out.println("Provides facility to control the air conditioning device");
	}

}
