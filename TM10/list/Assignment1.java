package wipro.list;
import java.util.*;

public class Assignment1 {

	public static void main(String[] args) {
		ArrayList<String> als = new ArrayList<String>();
		
		als.add("January");
		als.add("February");
		als.add("March");
		als.add("April");
		als.add("May");
		als.add("June");
		als.add("July");
		als.add("August");
		als.add("September");
		als.add("October");
		als.add("November");
		als.add("December");
		
		printAll(als);
		
	}	
	
	public static void printAll(ArrayList<String> al){
		for(Iterator<String> i = al.iterator(); i.hasNext();){
			System.out.println(i.next());
		}
	}

}