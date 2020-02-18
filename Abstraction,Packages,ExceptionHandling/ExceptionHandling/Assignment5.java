package ExceptionHandling;

public class Assignment5 {

	public static void main(String[] args) {
		int m,n;
		double k;
		m = Integer.parseInt(args[0]);
		n = Integer.parseInt(args[1]);
		
		try{
			k = division(m,n);
			System.out.println(k);
		}catch(ArithmeticException e){
			System.out.println("ArithmeticException");
		}

	}
	
	static double division(int a, int b) throws ArithmeticException{
		return a/b;
	}

}
