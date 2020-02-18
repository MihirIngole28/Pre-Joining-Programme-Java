package StringAndStringBuffer;
import java.util.Scanner;

public class ConcatenateStr {

	public static void main(String[] args) {
		String a, b, c;
		int n,m;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two strings");
		a = sc.nextLine();
		b = sc.nextLine();
		
		n = a.length();
		m = b.length();
		
		if((a.length() != 0) && (b.length() != 0) && ((a.charAt(n-1))==(b.charAt(0)))){
			c = a + b.substring(1);
		}
		else{
			c = a + b;
		}
		
		System.out.println("The concatination of two strings is :"+ c.toLowerCase());
	}

}
