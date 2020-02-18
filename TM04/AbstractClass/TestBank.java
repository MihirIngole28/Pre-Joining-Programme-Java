package AbstractClass;

public class TestBank {

	public static void main(String[] args) {
		ICICIBank i=new ICICIBank();
		
		i.getSavingsInterestRate();
		i.getFixedDepositInterestRate();
		
		KotMBank k=new KotMBank();
		
		k.getSavingsInterestRate();
		k.getFixedDepositInterestRate();
		
		GeneralBank g1=new KotMBank();
		
		g1.getSavingsInterestRate();
		g1.getFixedDepositInterestRate();
		
		GeneralBank g2=new ICICIBank();
		
		g2.getSavingsInterestRate();
		g2.getFixedDepositInterestRate();


	}

}
