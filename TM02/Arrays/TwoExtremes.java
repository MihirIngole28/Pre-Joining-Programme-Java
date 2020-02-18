package Arrays;

public class TwoExtremes {

	public static void main(String[] args) {
		int[] num = new int[]{40, 30, 20, 90, 10, 60, 70, 80, 50};
		int max1, min1;
		int max2, min2;
		max1 = num[0];
		max2 = num[0];
		min1 = num[0];
		for(int i : num){
			if(i>max1){
				max1 = i;
			}
			if(i<min1){
				min1 = i;
			}
		}		

		min2 = max1;
				
		for(int j : num){
			if(j>max2 && j < max1){
				max2 = j;
			}
			if(j<min2 && j > min1){
				min2 = j;
			}
		}
		
		System.out.println("Largest two:"+max2+" "+max1);
		System.out.println("Smallest two:"+min1+" "+min2);
	
	}

}
