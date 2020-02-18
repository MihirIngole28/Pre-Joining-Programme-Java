package Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int num[] = new int[]{12,34,12,45,67,89};
		int len = num.length;
		int[] temp1 = new int[len];
		int flag=0;
		int k=0;
		for(int i=0; i<len; i++){
			for(int j=i+1;j<len;j++){
				if(num[i]==num[j]){
					flag++;
				}				
			}
			
			if(flag==0){
				temp1[k++]=num[i];
			}
			flag=0;
		}
		
		int[] temp2 = new int[k];
		
		for(int i=0;i<k;i++){
			temp2[i] = temp1[i];
		}
		
		for(int z:temp2){
			System.out.print(z+" ");
		}
		
	}

}
