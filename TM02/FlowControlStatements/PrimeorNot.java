package FlowControlStatements;
import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		if(args.length==0){
			System.out.println("Please enter an integer number");
			num = sc.nextInt();
		}
		else{
			num = Integer.parseInt(args[0]);
		}
		
		if(num == 1 || num == 0){
			System.out.println(num+" is neither prime nor composite");
		}
		else{
			int k=0;
			for(int i = 2;i < (num); i++){
				if(num % i == 0){
					k=1;
				}
			}
			if(k == 0){
				System.out.println(num+" is a prime number");
			}
			else{
				System.out.println(num+" is not a prime number");
			}
		}
			
	}

}
