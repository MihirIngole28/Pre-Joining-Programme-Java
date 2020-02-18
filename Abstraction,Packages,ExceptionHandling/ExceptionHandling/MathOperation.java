package ExceptionHandling;

public class MathOperation {

	public static void main(String[] args) {
		int n;
		n = args.length;
		int num[] = new int[n];
		try{
			for(int i = 0;i < n;i++){
				num[i] = Integer.parseInt(args[i]);
			}
			
			int sum = 0;
			int avg;
			for(int j = 0;j < n;j++){
				sum = sum + num[j];
			}
			
			avg = sum/n;
			
			System.out.println("The sum is : "+sum);
			System.out.println("The average is : "+avg);
			 
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException");
		}catch(NumberFormatException e){
			System.out.println("NumberFormatException");
		}catch(ArithmeticException e){
			System.out.println("ArithmeticException");
		}		
		
	}

}
