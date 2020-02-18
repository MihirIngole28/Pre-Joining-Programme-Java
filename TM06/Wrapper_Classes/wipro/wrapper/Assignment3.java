package wipro.wrapper;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		
		int num;
		String str;
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Please enter an integer between 1 and 255");
			num = sc.nextInt();
			
			if(num<1 || num>255){
				throw new InvalidInputException(); 
			}
			else{
				str = Integer.toBinaryString(num);
				if(str.length()==8){
					System.out.println(str);
				}
				else{
					int k = str.length();
					String s = "";
					for(int i = 0;i < 8-k; i++){
						s = s+"0";
					}
					System.out.println(s+str);
				}
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}
		
		

	}

}

class InvalidInputException extends Exception{
	
	public InvalidInputException(){
		super();
	}
	
	public String toString(){
		return "InvalidInputException Occured: Enter Integer between 1 to 255";
	}
}