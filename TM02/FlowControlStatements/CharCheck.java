package FlowControlStatements;

public class CharCheck {

	public static void main(String[] args) {
		char ch1 = 'A';
		
		if(ch1 >= 65 && ch1 <= 90 || ch1 >= 97 && ch1 <= 122){
			System.out.println("Alphabet");
		}
		else if(ch1 >= 48 && ch1 <= 57){
			System.out.println("Digit");
		}
		else 
		{
			System.out.println("Special Character");
		}
	}

}
