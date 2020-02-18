package OverridingPolymorphism;
import java.util.Scanner;

public class Fruit {
	String name, taste, size;
	
	Scanner sc = new Scanner(System.in);
	
	public void eat(){
		System.out.println("Please enter the name of the fruit");
		name = sc.nextLine();
		System.out.println("Please enter the taste");
		taste = sc.nextLine();
	}
}

class Apple extends Fruit{
	public void eat(){
		System.out.println("The name of the fruit is Apple");
		System.out.println("It is sweet");
	}
}

class Orange extends Fruit{
	public void eat(){
		System.out.println("The name of the fruit is Orange");
		System.out.println("It is sweet and sour");
	}
}