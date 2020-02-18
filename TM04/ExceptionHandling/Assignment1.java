package ExceptionHandling;

public class Assignment1 {

	public static void main(String[] args) {
		try{
			System.out.println("Enter an integer: "+args[0]);
			int num = Integer.parseInt(args[0]);
			System.out.println("The square value is "+(num*num));
			System.out.println("The work has been done successfully");
		}catch(NumberFormatException nfe){
			System.out.println("Entered input is not a valid format for an integer.");
		}
	}
}
