package StringAndStringBuffer;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String a;
		String b = "";
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		a = sc.nextLine();
		n = a.length();
		for(int i = n-1; i >=0; i--){
			b = b + a.charAt(i);
		}
		
		if(b.equalsIgnoreCase(a)){
			System.out.println("The String entered is a Plaindrome");
		}
		else{
			System.out.println("The String entered is not a Plaindrome");
		}
	}
}
