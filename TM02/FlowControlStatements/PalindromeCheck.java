package FlowControlStatements;

public class PalindromeCheck {

	public static void main(String[] args) {
		int num;
		num = Integer.parseInt(args[0]); 
		int temp = num;
		int k=0;
		int sum = 0;
		
		while(temp>0){
			k = temp%10;
			sum = (sum*10)+k;
			temp /= 10;
		}
		if(sum==num){
			System.out.println(num+" is a palindrome");
		}
		else{
			System.out.println(num+" is not a palindrome");
		}

	}

}
