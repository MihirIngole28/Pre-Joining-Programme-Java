package ExceptionHandling;
import java.util.Scanner;

class InvalidCountryException extends Exception{
	public InvalidCountryException(){
		System.out.println("InvalidCountryException");
	}
	
	public String toString(){
		return "User Outside India cannot be registered";
	}
	
}

public class UserRegistration {

	public static void main(String[] args) {
		String userName;
		String userCountry;
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Enter your username");
			userName = sc.nextLine();
			
			System.out.println("Enter your Country name");
			userCountry = sc.nextLine();
			registerUser(userName,userCountry);
			
		}catch(InvalidCountryException e){
			System.out.println(e.toString());
		}
	}

	static void registerUser(String username,String usercountry) throws InvalidCountryException{
		if(usercountry.equalsIgnoreCase("India")){
			System.out.println("User registration done successfully");
		}
		else{
			throw new InvalidCountryException();
		}
	}
}
