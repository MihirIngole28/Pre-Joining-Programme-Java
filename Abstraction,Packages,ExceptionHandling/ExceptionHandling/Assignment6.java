package ExceptionHandling;
import java.util.Scanner;
import java.util.InputMismatchException;

class ValuesOutOfRangeException extends Exception{
	ValuesOutOfRangeException(){
		super();
	}
	public String toString(){
		return "ValuesOutOfRangeException : Values cannot be negative or greater than the specified limit.";
	}
}
public class Assignment6 {

	public static void main(String[] args) {
		int sub[] = new int[3];
		int num = 2;
		int sum, avg;
		String name;
		Scanner sc = new Scanner(System.in);
		
		try{
			for(int j = 0; j < num; j++){
				
				sum = 0;
				
				System.out.println("Enter your name");
				name = sc.nextLine();
				
				System.out.println("Enter the marks : ");
				for(int i = 0 ; i < 3; i++){
					sub[i] = sc.nextInt();
					if(sub[i] < 0 || sub[i] > 100){
						throw new ValuesOutOfRangeException();
					}
					sum = sum + sub[i];
				}
				avg = sum / 3;
				System.out.println("The avg marks of "+name+" is "+avg);
			}
		}catch(InputMismatchException e){
			System.out.println("InputMismatchException");
		}catch(ValuesOutOfRangeException e){
			System.out.println(e.toString());
		}
				
	}

}
