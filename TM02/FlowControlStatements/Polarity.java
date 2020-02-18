package FlowControlStatements;

public class Polarity {

	public static void main(String[] args) {
		double i = Double.parseDouble(args[0]);
		if(i > 0){
			System.out.println("Positive");
		}
		else if(i == 0){
			System.out.println("Zero");
		}
		else{
			System.out.println("Negative");
		}
	}

}
