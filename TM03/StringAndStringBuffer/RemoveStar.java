package StringAndStringBuffer;
import java.util.Scanner;

public class RemoveStar {

	public static void main(String[] args) {
		String st;
		int n,m;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string with star");
		st = sc.nextLine();
		
		n = st.indexOf('*');
		m = st.length();
		
		System.out.println(st.substring(0,n-1)+""+st.substring(n+2,m));		
	}

}
