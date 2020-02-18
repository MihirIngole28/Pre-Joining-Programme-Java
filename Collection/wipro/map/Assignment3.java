package wipro.map;
import java.util.*;
import java.util.Map.Entry;

public class Assignment3 {	
	
	public static void main(String[] args) {
		Properties pr = new Properties();
		
		pr.setProperty("Maharashtra","Mumbai");
		pr.setProperty("West Bengal", "Kolkata");
		pr.setProperty("Tamil Nadu", "Chennai");
		
		Set<Entry<Object, Object>> set = pr.entrySet();
		
		Iterator<Entry<Object,Object>> it = set.iterator();
		while(it.hasNext()){
			Entry<Object, Object> en = it.next();
			System.out.println(en);
		}
		
	}

}
