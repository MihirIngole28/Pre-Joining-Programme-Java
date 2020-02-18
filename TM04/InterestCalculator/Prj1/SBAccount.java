package Prj1;

public class SBAccount extends Account {
	
	double interestRate;
	double amount;
	
	String accType = "";
	
	public SBAccount(double amount, String accType){
		this.amount = amount;
		this.accType = accType;
	}
	
	
	public double calculateInterest() {
		if(accType.equalsIgnoreCase("Normal")){
			interestRate = 4;
		}
		else if(accType.equalsIgnoreCase("NRI")){
			interestRate = 6;
		}
		else{
			System.out.println("Invalid account type");
		}
		
		double interest = amount * interestRate / 100.0;;
		
		return interest;
	}

}

