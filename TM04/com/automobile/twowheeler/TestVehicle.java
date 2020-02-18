package com.automobile.twowheeler;

public class TestVehicle {

	public static void main(String[] args) {
		Hero hr = new Hero("Passion Pro","Mihir","MH02HN2482",70);
		System.out.println("Model name: "+hr.getModelName());
		System.out.println("Owner name: "+hr.getOwnerName());
		System.out.println("Registration number: "+hr.getRegistrationNumber());
		System.out.println("Speed in kmph: "+hr.getSpeed());
		hr.radio();
		
		
		Honda hd = new Honda("CB Unicorn","Aditya","MH12HN5715",72);
		System.out.println("Model name: "+hd.getModelName());
		System.out.println("Owner name: "+hd.getOwnerName());
		System.out.println("Registration number: "+hd.getRegistrationNumber());
		System.out.println("Speed in kmph: "+hd.getSpeed());
		hd.cdplayer();
	}

}
