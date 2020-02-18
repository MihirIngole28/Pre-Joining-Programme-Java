package FlowControlStatements;
import java.lang.Math;

public class CheckPrime {

	public static void main(String[] args) {
		int num = 4;
		int k=0;
		for(int i = 2;i < (num); i++){
			if(num % i == 0){
				k=1;
			}
		}
		if(k == 0){
			System.out.println("The given number is prime");
		}
		else{
			System.out.println("The number is not Prime");
		}

	}

}
