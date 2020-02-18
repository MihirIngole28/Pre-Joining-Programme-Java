package Arrays;

public class Reverse2dArray {

	public static void main(String[] args) {
		int[][] num = new int[2][2];
		
		int[] tempfrd = new int[4];
		int[] temprev = new int[4];
		int temp = 0;
		int k = 0,z = 0;
		
		if(args.length != 4){
			System.out.println("Please enter 4 integer numbers");
		}
		
		for(int i=0; i<num.length; i++){
			for(int j=0;j<num.length;j++){
				k = j;
				if(i==1){
					k += 2; 
				}
				num[i][j]= Integer.parseInt(args[k]); 
			}
		}
		
		for(int i=0; i<num.length; i++){
			for(int j=0;j<num.length;j++){
				temp = num[i][j];
				k = j;
				if(i==1){
					k += 2;
				}
				tempfrd[k]=temp;
			}
		}
		
		for(int i=tempfrd.length-1;i>=0;i--){
			temprev[z]=tempfrd[i];
			z++;
		}
		
		for(int i=0; i<num.length; i++){
			for(int j=0;j<num.length;j++){
				k = j;
				if(i==1){
					k += 2; 
				}
				num[i][j]= temprev[k];
			}
		}
		
		for(int i=0; i<num.length; i++){
			for(int j=0;j<num.length;j++){
				System.out.print(num[i][j]+" ");
			}
			System.out.println("");
		}

	}

}
