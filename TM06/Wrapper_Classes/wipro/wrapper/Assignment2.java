package wipro.wrapper;

public class Assignment2 {

	public static void main(String[] args) {
		int i1;
		i1 = Integer.parseInt(args[0]);
		
		System.out.println("Given Number :"+i1);
		
		System.out.println("Binary equivalent :"+Integer.toBinaryString(i1));
		
		System.out.println("Octal equivalent :"+Integer.toOctalString(i1));
		
		System.out.println("Hexadecimal equivalent :"+Integer.toHexString(i1));
	}

}
