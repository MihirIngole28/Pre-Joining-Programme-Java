package ClassesAndObjects;

public class Box {
	double width;
	double height;
	double depth;
	
	public Box(double width, double height, double depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	double volume(){
		return width * height * depth;
	}

	public static void main(String[] args) {
		Box b1 = new Box(10,20,30);
		System.out.println(b1.volume());
		

	}

}
