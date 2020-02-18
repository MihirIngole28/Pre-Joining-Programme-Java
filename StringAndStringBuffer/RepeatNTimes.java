package StringAndStringBuffer;
import java.util.*;

public class RepeatNTimes {

	public static void main(String[] args) {
		String st;
		int n,m;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string and the number");
		st = sc.nextLine();
		n = sc.nextInt();
		
		m = st.length();
		
		if(n<=m){
			for(int i = 0; i < n; i++){
				System.out.print(st.substring(m-n,m));
			}
		}
		
		else{
			System.out.println("Invalid Input");
		}
		
	}

}
