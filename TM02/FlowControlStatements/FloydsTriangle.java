package FlowControlStatements;
import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k;
		if(args.length==0){
			System.out.println("Please enter an integer number");
			k = sc.nextInt();
		}
		else{
			k = Integer.parseInt(args[0]);
		}
		
		int j=0;
		while(j<=k){
			for(int i=0;i<j;i++){
				System.out.print("* ");
			}
			System.out.println("");
			j++;
		}			

	}

}
