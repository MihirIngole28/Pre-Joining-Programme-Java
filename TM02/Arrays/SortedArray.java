package Arrays;

public class SortedArray {

	public static void main(String[] args) {
		int[] num = new int[]{21,32,43,98,87,65,54,76,10};
		int temp;
		int len = num.length;
		
		for(int i=0;i<len-1;i++){
			for(int j=i; j<len;j++){
				if(num[i]>num[j]){
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		
		for(int i : num)
			System.out.print(i+" ");

	}

}
