package ExceptionHandling;

class RestrictedAgeException extends Exception{
	public RestrictedAgeException(){
		System.out.println("RestrictedAgeException");
	}
	
	public String toString(){
		return "Age should not be less than 18 or greater than 59";
	}
}
public class Assignment8 {

	public static void main(String[] args) {
		String name;
		int age;
		
		name = args[0];
		age = Integer.parseInt(args[1]);
		try{
			if(age<18 || age>59){
			throw new RestrictedAgeException();
			}
			else{
				System.out.println("You are eligible");
			}
		}catch(RestrictedAgeException e){
			System.out.println(e.toString());
		}		

	}

}
