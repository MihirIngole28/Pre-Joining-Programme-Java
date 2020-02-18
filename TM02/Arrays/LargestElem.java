package Arrays;

public class LargestElem {

	public static void main(String[] args) {
		
		int num[][] = new int[3][3];
		int k=0;
		int max = num[0][0];
		
		if(args.length != 9)
			System.out.println("Please enter 9 integer numbers");
		
		for(int i=0;i<num.length;i++){
			for(int j=0;j<num.length;j++){
				k = j;
				if(i == 1){
					k += 3;
				}
				else if(i == 2){
					k += 6;
				}
				num[i][j] = Integer.parseInt(args[k]);
			}
		}
		
		System.out.println("The given array is :");
		for(int i=0;i<num.length;i++){
			for(int j=0;j<num.length;j++){
				System.out.print(num[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		for(int i=0;i<num.length;i++){
			for(int j=0;j<num.length;j++){
				if(num[i][j] > max){
					max = num[i][j];
				}
			}
		}
		
		System.out.println("The biggest number in the given array is "+max);

	}

}
