package OverridingPolymorphism;

public class ShapeDemo {

	public static void main(String[] args) {
		Shape c = new Circle();
		Shape t = new Triangle();
		Shape s = new Square();
		
		c.draw();
		t.draw();
		s.draw();
		
		c.erase();
		t.erase();
		s.erase();

	}

}
