package main;
import bean.*;
import java.util.*;
public class BoxTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Set<Box> set = new TreeSet<>();
		
		int num;
		System.out.println("Enter the number of Box");
		num = sc.nextInt();
		
		double length;
		double width;
		double height;
		double volume;
		
		for(int i = 1; i<=num; i++){
			Box box = new Box();
			System.out.println("Enter the Box "+i+" details");
			System.out.println("Enter Length");
			length = sc.nextDouble();
			box.setLength(length);
			System.out.println("Enter Width");
			width = sc.nextDouble();
			box.setWidth(width);
			System.out.println("Enter Height");
			height = sc.nextDouble();
			box.setHeight(height);
			
			set.add(box);		
		}
		
		System.out.println("Unique Boxes in the Set are");
		for(Box box : set){
			System.out.println(box);
		}
	}

}
