package StringAndStringBuffer;
import java.util.Scanner;

public class ReturnMiddle {

	public static void main(String[] args) {
		String st;
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		st = sc.nextLine();
		n = st.length();
		
		System.out.println(st.substring(1,n-1));
	}

}
