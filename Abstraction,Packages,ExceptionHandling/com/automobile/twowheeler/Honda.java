package com.automobile.twowheeler;

public class Honda {
	int Speed;
	String ModelName;
	String ownerName;
	String RegNo;
	
	Honda(String ModelName, String ownerName, String RegNo, int Speed){
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
	
	public void cdplayer(){
		System.out.println("Provides the facility of cd player");
	}

}
