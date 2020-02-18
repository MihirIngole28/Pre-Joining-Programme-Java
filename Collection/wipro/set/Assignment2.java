package wipro.set;
import java.util.*;

public class Assignment2 {
	
	public static void main(String[] args) {
		HashSet<String> employee = new HashSet<String>();
		
		employee.add("Mihir");
		employee.add("Sheldon");
		employee.add("Leonard");
		employee.add("Barnedette");
		
		Iterator<String> it = employee.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	
	}

}
