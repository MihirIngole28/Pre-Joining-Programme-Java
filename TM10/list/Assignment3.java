package wipro.list;
import java.util.*;

public class Assignment3 {

	public static void main(String[] args) {
		ArrayList<String> StArr = new ArrayList<>();
		
		StArr.add("Mihir");
		StArr.add("Ingole");
		StArr.add("Project");
		StArr.add("Engineer");
		StArr.add("Wipro");
		
		printAll(StArr);
	}
	
	public static void printAll(ArrayList<String> StArr){
		Iterator<String> it = StArr.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
