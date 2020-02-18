package wipro.list;
import java.util.*;

public class Assignment5 {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("January");
		list.add("February");
		list.add("March");
		list.add("April");
		list.add("May");
		list.add("June");
		list.add("July");
		list.add("August");
		list.add("September");
		list.add("October");
		list.add("November");
		list.add("December");

		printAll(list);
	}
	
	public static  void printAll(LinkedList<String> list){
		for(Iterator<String> it = list.iterator(); it.hasNext();){
			System.out.println(it.next());
		}
	}
}
