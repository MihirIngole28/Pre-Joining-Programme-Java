package com.automobile.fourwheeler;

public class TestVehicle {

	public static void main(String[] args) {
		Logan lgn = new Logan("Renault Tondar 90","Mihir","MH02HN3526",180);
		System.out.println("Model name: "+lgn.getModelName());
		System.out.println("Owner name: "+lgn.getOwnerName());
		System.out.println("Registration number: "+lgn.getRegistrationNumber());
		System.out.println("Speed in kmph: "+lgn.getSpeed());
		lgn.gps();
		
		
		Ford frd = new Ford("Mustang","Aditya","MH12HN1465",200);
		System.out.println("Model name: "+frd.getModelName());
		System.out.println("Owner name: "+frd.getOwnerName());
		System.out.println("Registration number: "+frd.getRegistrationNumber());
		System.out.println("Speed in kmph: "+frd.getSpeed());
		frd.tempControl();

	}

}
