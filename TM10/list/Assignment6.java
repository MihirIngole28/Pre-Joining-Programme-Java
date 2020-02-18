package wipro.list;
import java.util.*;

public class Assignment6 {

	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>();
		
		vec.add("January");
		vec.add("February");
		vec.add("March");
		vec.add("April");
		vec.add("May");
		vec.add("June");
		vec.add("July");
		vec.add("August");
		vec.add("September");
		vec.add("October");
		vec.add("November");
		vec.add("December");
		
		printAll(vec);
		
	}

	public static void printAll(Vector<String> vec){
		for(Iterator<String> it = vec.iterator(); it.hasNext();){
			System.out.println(it.next());
		}
	}
}
