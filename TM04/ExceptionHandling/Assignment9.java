package ExceptionHandling;
import java.util.Scanner;

class Assignment9 {

	public static void main(String[] args) {
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		try{
			System.out.println("the quotient of "+a+"/"+b+" = "+(a/b));
		}catch(ArithmeticException e){
			System.out.println("DivideByZeroException caught");
		}
		finally{
			System.out.println("Inside finally block");
		}
	}

}
