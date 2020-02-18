package Prj1;

import java.util.Scanner;

public class InterestCalculator {

	public static void main(String[] args) {
		
		double amount;
		int noOfDays;
		int age;
		String accType = "Normal";
		int choice;
		
		Scanner sc = new Scanner(System.in);
		
		
		do{
			System.out.println("1. Interest Calculator – SB\n2. Interest Calculator – FD\n3. Interest Calculator – RD\n4. Exit");
			System.out.println("Enter your option (1..4):");
			choice = sc.nextInt();
			
			switch(choice){
			case 1: 
				System.out.println("Enter the Average amount in your account: "); 
				amount = sc.nextDouble();
				SBAccount sb = new SBAccount(amount, accType);
				System.out.println("Interest gained: Rs. "+sb.calculateInterest());		
				break;
			
			case 2: 
				System.out.println("Enter the FD amount: "); 
				amount = sc.nextDouble();
				System.out.println("Enter the number of days: ");
				noOfDays = sc.nextInt();
				System.out.println("Enter your age: ");
				age = sc.nextInt();			
				FDAccount fd = new FDAccount(amount, noOfDays, age);
				System.out.println("Interest gained: Rs. "+fd.calculateInterest());	
				break;
				
			case 3:
				System.out.println("Enter the RD amount: "); 
				amount = sc.nextDouble();
				System.out.println("Enter the months: ");
				noOfDays = sc.nextInt();
				System.out.println("Enter your age: ");
				age = sc.nextInt();			
				RDAccount rd = new RDAccount(amount, noOfDays, age);
				System.out.println("Interest gained: Rs. "+rd.calculateInterest());	
				break;
				
			default:
				break;
			}
			
		}while(choice < 4 && choice > 0);
		
		
		

	}

}
 
