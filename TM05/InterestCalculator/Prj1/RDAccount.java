package Prj1;

public class RDAccount extends Account {

	double interestRate;
	double amount;
	double monthlyAmount;
	
	int noOfMonths;
	int ageOfACHolder;
	
	public RDAccount( double amount, int noOfMonths, int ageOfACHolder){
		
		this.amount = amount;		
		this.noOfMonths = noOfMonths;
		this.ageOfACHolder = ageOfACHolder;
	}
	public double calculateInterest() {
		
		if(ageOfACHolder > 0 && ageOfACHolder <65 ){
			if(noOfMonths == 6){
				interestRate = 7.50;
			}
			else if(noOfMonths == 9){
				interestRate = 7.75;
			}
			else if(noOfMonths == 12){
				interestRate = 8.00;
			}
			else if(noOfMonths == 15){
				interestRate = 8.25;
			}
			else if(noOfMonths == 18){
				interestRate = 8.50;
			}
			else if(noOfMonths == 21){
				interestRate = 8.75;
			}
			else {
				System.out.println("Invalid Maturity Period");
			}
		}
		
		else if(ageOfACHolder >= 65  ){
			if(noOfMonths == 6){
				interestRate = 8.00;
			}
			else if(noOfMonths == 9){
				interestRate = 8.25;
			}
			else if(noOfMonths == 12){
				interestRate = 8.50;
			}
			else if(noOfMonths == 15){
				interestRate = 8.75;
			}
			else if(noOfMonths == 18){
				interestRate = 9.00;
			}
			else if(noOfMonths == 21){
				interestRate = 9.25;
			}
			else {
				System.out.println("Invalid Maturity Period");
			}
		}
		
		else{
			System.out.println("Invalid age of account holder");
		}
		
		double interest = amount * interestRate / 100.0;
		return interest;
	}

}

