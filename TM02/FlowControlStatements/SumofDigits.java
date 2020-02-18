package FlowControlStatements;
import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int sum=0, temp;
		num = sc.nextInt();
		
		while(num > 0){
			temp = num;
			temp = temp % 10;
			sum = sum + temp;
			num /= 10;
		}	
		
		System.out.println(sum);		

	}

}
