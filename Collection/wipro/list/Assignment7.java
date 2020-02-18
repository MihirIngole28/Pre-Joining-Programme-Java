package wipro.list;
import java.util.*;
import wipro.list.bean.*;

public class Assignment7 {

	public static void main(String[] args) {
		Vector<Employee> vecEmp = new Vector<Employee>();
		
		Employee emp1 = new Employee(1002,"Mihir", "m.ingole@gmail.com","Male", 350000);
		Employee emp2 = new Employee(1001,"Sheldon", "shel.coop@gmail.com", "Male", 4500000);
		Employee emp3 = new Employee(1003,"Leonard", "l.wolowitz@yahoo.com", "Male", 650000);
		Employee emp4 = new Employee(1004,"Bernadette", "bernadatte04@hotmail.com", "Female", 320000);
		
		vecEmp.add(emp1);
		vecEmp.add(emp2);
		vecEmp.add(emp3);
		vecEmp.add(emp4);
		
		for(Iterator<Employee> it = vecEmp.iterator(); it.hasNext();){
			System.out.println(it.next());
			System.out.println();
		}
	}
}

