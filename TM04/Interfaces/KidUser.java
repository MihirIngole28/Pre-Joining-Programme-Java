package Interfaces;

import java.util.Scanner;

public class KidUser implements LibraryUser{
	int age;
	String bookType;
	
	Scanner sc = new Scanner(System.in);
	
	public void registerAccount(){
		System.out.println("Please enter your age");
		age = sc.nextInt();
		
		if(age<12){
			System.out.println("You have successfully registered under a Kids Account");
			
		}
		else{
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}
	
	
	public void requestBook(){
		System.out.println("Please enter the book type");
		bookType = sc.nextLine();
		
		if(bookType.equalsIgnoreCase("Kids")){
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}		
		else{
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}
}
