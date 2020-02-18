package Arrays;

public class PrintSum {

	public static void main(String[] args) {
		int[] num = new int[]{10,3,6,1,2,7,9};
		
		int len = num.length;
		int temp = 0, sum = 0;
		int k = len;
		for(int i=0; i<len; i++){
			if(num[i]==6){
				k = i;
			}
		}
		
		for(int j=k; j<len; j++){
			if(num[j]==7){
				temp=j;
			}
		}
		
		if(temp == 0){
			for(int i : num){
				sum = sum + i;
			}
		}
		
		else{
			for(int i=0; i<len; i++ ){
				if(i == k){
					i = temp+1;
				}
				sum = sum + num[i];
			}
		}	
		
		
		System.out.println(sum);
	}

}
