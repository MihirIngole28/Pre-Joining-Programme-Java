package Prj1;

public class FDAccount extends Account {
	
	double interestRate;
	double amount;

	int noOfDays;
	int ageOfACHolder;
	
	public FDAccount( double amount, int noOfDays, int ageOfACHolder){
		this.amount = amount;
		this.noOfDays = noOfDays;
		this.ageOfACHolder = ageOfACHolder;
	}
	
	public double calculateInterest() {
		
		if(amount < 10000000){
			if(ageOfACHolder > 0 && ageOfACHolder < 65){
				if(noOfDays >= 7 && noOfDays <= 14){
					interestRate = 4.50;
				}
				else if(noOfDays >= 15 && noOfDays <= 29){
					interestRate = 4.75;
				}
				else if(noOfDays >= 30 && noOfDays <= 45){
					interestRate = 5.50;
				}
				else if(noOfDays >= 46 && noOfDays <= 60){
					interestRate = 7;
				}
				else if(noOfDays >= 61 && noOfDays <= 184){
					interestRate = 7.50;
				}
				else if(noOfDays >= 185 && noOfDays <= 365){
					interestRate = 8.00;
				}
				else{
					System.out.println("Invalid number of days");
				}
			}
			
			else if(ageOfACHolder >= 65){
				if(noOfDays >= 7 && noOfDays <= 14){
					interestRate = 5.00;
				}
				else if(noOfDays >= 15 && noOfDays <= 29){
					interestRate = 5.25;
				}
				else if(noOfDays >= 30 && noOfDays <= 45){
					interestRate = 6.00;
				}
				else if(noOfDays >= 46 && noOfDays <= 60){
					interestRate = 7.50;
				}
				else if(noOfDays >= 61 && noOfDays <= 184){
					interestRate = 8.00;
				}
				else if(noOfDays >= 185 && noOfDays <= 365){
					interestRate = 8.50;
				}
				else{
					System.out.println("Invalid number of days");
				}
			}
			
			else{
				System.out.println("Invalid age of AC holder");
			}
		}
		
		else if(amount >= 10000000){
			if(noOfDays >= 7 && noOfDays <= 14){
				interestRate = 6.50;
			}
			else if(noOfDays >= 15 && noOfDays <= 29){
				interestRate = 6.75;
			}
			else if(noOfDays >= 30 && noOfDays <= 45){
				interestRate = 6.75;
			}
			else if(noOfDays >= 46 && noOfDays <= 60){
				interestRate = 8.00;
			}
			else if(noOfDays >= 61 && noOfDays <= 184){
				interestRate = 8.50;
			}
			else if(noOfDays >= 185 && noOfDays <= 365){
				interestRate = 10.00;
			}
			else{
				System.out.println("Invalid number of days");
			}
		}
		
		double interest = amount * interestRate / 100;
		return interest;
	}

}

