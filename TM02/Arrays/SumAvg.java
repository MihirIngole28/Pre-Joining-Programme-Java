package Arrays;

public class SumAvg {

	public static void main(String[] args) {
		int[] num = new int[]{10, 20, 30, 40};
		int avg;
		int sum = 0;
		
		for(int i : num){
			sum = sum + i;
		}
		
		System.out.println("The sum of array is "+sum);
		
		avg = sum/num.length;
		
		System.out.println("The average of array is "+avg);

	}

}
