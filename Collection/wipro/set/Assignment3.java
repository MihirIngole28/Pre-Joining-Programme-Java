package wipro.set;
import java.util.*;

public class Assignment3 {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder());
		TreeSet<String> td;
		
		ts.add("USA");
		ts.add("India");
		ts.add("England");
		ts.add("Wales");
		ts.add("Scotland");
		ts.add("Ireland");
		ts.add("Spain");
		
		String temp = "Wales";
		
		Iterator<String> i1 = ts.iterator();
		
		while(i1.hasNext()){
			System.out.println(i1.next());
		}
		
		System.out.println();
		Iterator<String> i2  = ts.iterator();
		
		while(i2.hasNext()){
			if(i2.next().equals(temp)){
				System.out.println(temp + " exists");
				break;
			}
			else{
				System.out.println(temp + " doesn't exists");
			}
		}		

	}

}
