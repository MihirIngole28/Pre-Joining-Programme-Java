package ExceptionHandling;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number of elements in the array. ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements in the array. ");
		try{
			for(int i = 0 ; i<n; i++){
				arr[i] = sc.nextInt();
			}
			
			System.out.print("Enter the index of the array element you want to access. ");
			int num = sc.nextInt();
			
			System.out.println("The array element at index "+num+" = "+ arr[num]);
			System.out.println("The array element successfully accessed.");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}	

	}

}
