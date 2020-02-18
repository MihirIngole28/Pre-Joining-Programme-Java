package StringAndStringBuffer;
import java.util.Scanner;

public class ReturnHalf {

	public static void main(String[] args) {
		String st;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		st = sc.nextLine();
		
		n = st.length();
		
		if(n%2==0){
			System.out.println(st.substring(0,n/2));
		}
		else{
			System.out.println("null");
		}
	}

}
