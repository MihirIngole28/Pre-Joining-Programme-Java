package OverridingPolymorphism;

public class Shape {
	
	public void draw(){
		System.out.println("Drawing shape");
	}
	
	public void erase(){
		System.out.println("Erasing shape");
	}

}

class Circle extends Shape{
	public void draw(){
		System.out.println("Drawing Circle");
	}
	
	public void erase(){
		System.out.println("Erasing Circle");
	}
}

class Triangle extends Shape{
	public void draw(){
		System.out.println("Drawing Triangle");
	}
	
	public void erase(){
		System.out.println("Erasing Triangle");
	}
}

class Square extends Shape{
	public void draw(){
		System.out.println("Drawing Square");
	}
	
	public void erase(){
		System.out.println("Erasing Square");
	}
}
