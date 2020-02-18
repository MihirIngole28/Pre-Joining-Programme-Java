package com.automobile.twowheeler;
import com.automobile.*;

public class Hero extends Vehicle {
	int Speed;
	String ModelName;
	String ownerName;
	String RegNo;
	
	Hero(String ModelName, String ownerName, String RegNo, int Speed){
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
	
	public void radio(){
		System.out.println("This model provides radio");
	}

}
