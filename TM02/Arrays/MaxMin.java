package Arrays;

public class MaxMin {

	public static void main(String[] args) {
		int[] num = new int[]{10, 40, 20, 30};
		int max = num[0];
		int min = num[0];
		
		for(int i : num){
			if(i > max)
				max = i;
		}
		
		for(int i : num){
			if(i < min)
				min = i;
		}
		System.out.println("The maximum value of the array is "+max+" and the minimum value is "+min);

	}

}
