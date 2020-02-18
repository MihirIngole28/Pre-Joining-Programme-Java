package Inheritance;

class Animal {
	
	public void eat(){
		System.out.println("Animal class eat method");
	}
	
	public void sleep(){
		System.out.println("Animal class sleep method");
	}
	
}

class Bird extends Animal{
	
	public void eat(){
		System.out.println("Bird class eat method");
	}
	
	public void sleep(){
		System.out.println("Bird class sleep method");
	}
	
	public void fly(){
		System.out.println("Bird class fly method");
	}
	
}

public class TestAnimal{
	
	public static void main(String[] args){
		Animal a1 = new Animal();
		a1.eat();
		a1.sleep();
		
		Bird b1 = new Bird();
		b1.eat();
		b1.sleep();
		b1.fly();
	}
}




