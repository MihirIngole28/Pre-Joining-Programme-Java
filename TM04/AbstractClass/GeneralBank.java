package AbstractClass;

public abstract class GeneralBank {
	
	abstract void getSavingsInterestRate();
	abstract void getFixedDepositInterestRate();

}

class ICICIBank extends GeneralBank{
	
	
	void getSavingsInterestRate(){
		System.out.println("The savings interest rate of ICICI bank is 4%");
	}
	
	void getFixedDepositInterestRate(){
		System.out.println("The fixed interest rate of ICICI bank is 8.5%");
	}
	
}


class KotMBank extends GeneralBank{
	
	void getSavingsInterestRate(){
		System.out.println("The savings interest rate of Kotak M Bank is 4%");
	}
	
	void getFixedDepositInterestRate(){
		System.out.println("The fixed interest rate of Kotak M Bank is 8.5%");
	}
	
}