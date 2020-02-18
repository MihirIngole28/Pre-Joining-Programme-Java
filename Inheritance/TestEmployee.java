package Inheritance;

public class TestEmployee {
	
	public static void main(String[] args){
		Employee emp = new Employee("Mihir");
		emp.setSalary(350000);
		emp.setYoJ(2019);
		emp.setNIN("123456789");
		
		emp.getName();
		emp.getSalary();
		emp.getYoJ();
		emp.getNIN();
	}
}
