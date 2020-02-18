package ClassesAndObjects;

public class Patient {
	String patientName;
	double height;
	double weight;
	
	public Patient(String patientName, double height, double weight){
		this.patientName = patientName;
		this.height = height;
		this.weight = weight;
	}
	
	double computeBMI(){
		return (weight/(height*height));
	}
	
	
	public static void main(String[] args) {
		Patient pt1 = new Patient("Mihir", 1.74, 62);
		System.out.println(pt1.computeBMI());		
	}

}
