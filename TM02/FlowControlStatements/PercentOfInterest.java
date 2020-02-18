package FlowControlStatements;

public class PercentOfInterest {

	public static void main(String[] args) {
		int age = Integer.parseInt(args[1]);
		String gender = args[0];
		String Male = "Male";
		String Female = "Female";
		
		if(gender.equals(Male) && (age >= 1 && age <= 58)){
			System.out.println("The percentage of Interest is 8.4%");
		}
		
		else if(gender.equals(Male) && (age >= 59 && age <= 100)){
			System.out.println("The percentage of Interest is 10.5%");
		}
		
		else if(gender.equals(Female) && (age >= 1 && age <= 58)){
			System.out.println("The percentage of Interest is 8.2%");
		}
		
		else{
			System.out.println("The percentage of Interest is 9.2%");
		}
	}

}
