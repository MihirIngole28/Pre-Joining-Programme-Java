package StringAndStringBuffer;
import java.util.Scanner;

public class CharsX {

	public static void main(String[] args) {
		String st;
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		st = sc.nextLine();
		n = st.length();
		if(st.charAt(0)=='x' && st.charAt(n-1)=='x'){
			System.out.println(st.substring(1, n-1));
		}
		else{
			System.out.println(st);
		}

	}

}
