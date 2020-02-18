package ClassesAndObjects;

public class Claculator {
	
	static double powerInt(int num1,int num2){
		 return Math.pow(num1, num2);
	}
	
	static double powerDouble(double num1,int num2){
		return Math.pow(num1, num2);
	}

	public static void main(String[] args) {
		Claculator cal = new Claculator();
		System.out.println(cal.powerInt(2,4));
		System.out.println(cal.powerDouble(2.3,4));
	}

}
