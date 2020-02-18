package Arrays;

public class CheckNo {

	public static void main(String[] args){  
		int[] arr = new int[]{1,4,34,56,7};
		int num = Integer.parseInt(args[0]);
		int k=0;
		
		for(int i=0; i<arr.length; i++){
			if(num == arr[i]){
				System.out.println(i);
				k++;
			}
		}
		
		if(k==0){
			System.out.println("-1");
		}
	}

}
