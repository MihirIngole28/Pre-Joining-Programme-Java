package StringAndStringBuffer;
import java.util.Scanner;

public class LongShort {

	public static void main(String[] args) {
		String a,b;
		int n,m;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a long and  a short string");
		a = sc.nextLine();
		b = sc.nextLine();
		
		n = a.length();
		m = b.length();
		
		if(n>m){
			System.out.println(b+""+a+""+b);
		}
		else{
			System.out.println(a+""+b+""+a);
		}
	}

}
