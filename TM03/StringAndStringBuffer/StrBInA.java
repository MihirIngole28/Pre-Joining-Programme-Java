package StringAndStringBuffer;
import java.util.Scanner;

public class StrBInA {

	public static void main(String[] args) {
		String a,b;
		int k,m,n,i=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the two characters");
		
		a = sc.nextLine();
		b = sc.nextLine();
		
		m = b.length();
		k = a.length();
		
		for(;;){
			if(i < k){
				n = a.indexOf(b,i);
				if(n >= 0){
					if(n > 0){
						System.out.print(a.charAt(n-1));
					}
					
					if(n+m<k){
						System.out.print(a.charAt(n+m));
					}				
					i = n + m;
				}
				
			}
			else{
				break;
			}			
		}
	}
}
