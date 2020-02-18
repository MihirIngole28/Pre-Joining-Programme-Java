package StringAndStringBuffer;
import java.util.Scanner;

public class AssembleFirstSec {

	public static void main(String[] args) {
		String a,b;
		int m,n,i,j;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the two string values");
		
		a = sc.nextLine();
		b = sc.nextLine();
		
		m = a.length();
		n = b.length();
		
		j = 0;
		for(i=0;i<m;i++){
			System.out.print(a.charAt(i));
			if(j<n){
				System.out.print(b.charAt(j));
				j++;
			}
		}
		
		System.out.print(b.substring(j, n));
	}

}
