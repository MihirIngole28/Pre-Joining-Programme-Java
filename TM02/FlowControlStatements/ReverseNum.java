package FlowControlStatements;

public class ReverseNum {

	public static void main(String[] args) {
		int num;
		num = Integer.parseInt(args[0]);
		int temp;
		
		while(num>0){
			temp = num % 10;
			System.out.print(temp);
			num /= 10;
		}

	}

}
