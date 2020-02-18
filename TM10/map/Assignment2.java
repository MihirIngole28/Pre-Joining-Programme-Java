package wipro.map;
import java.util.*;
import java.util.Map.*;

public class Assignment2 {
	
	HashMap<String,String> M1 = new HashMap<String,String>();
	
	public HashMap<String,String> saveString(String s1, String s2){
		M1.put(s1,s2);
		return M1;
	}
	
	public boolean checkKey(String s){
		Set<Entry<String, String>> set = M1.entrySet();
		
		Iterator<Entry<String, String>> it = set.iterator();
		
		while(it.hasNext()){
			Map.Entry<String, String> map = it.next();
			if(map.getKey().equals(s)){
				return true;
			}
		}
		return false;
	}
	
	public boolean checkValue(String s){
		Set<Entry<String, String>> set = M1.entrySet();
		
		Iterator<Entry<String, String>> it = set.iterator();
		
		while(it.hasNext()){
			Map.Entry<String, String> map = it.next();
			if(map.getValue().equals(s)){
				return true;
			}
		}
		return false;
	}
	
	public void viewMap(){
		Set<Entry<String,String>> set = M1.entrySet();
		
		Iterator<Entry<String,String>> it = set.iterator();
		
		while(it.hasNext()){
			Map.Entry<String, String> mp = it.next();
			System.out.println(mp);
		}
	}
	
	public static void main(String[] args) {
		
		Assignment2 hm = new Assignment2();
		
		hm.saveString("USA", "Washington DC");
		hm.saveString("India", "Delhi");
		hm.saveString("Japan", "Tokyo");
		hm.saveString("Netherlands", "Amsterdam");
		hm.saveString("England", "London");
		
		if(hm.checkKey("USA")){
			System.out.println("This Key exists");
		}else{
			System.out.println("This Key doesn't exist");
		}
		System.out.println();
		if(hm.checkValue("Tokyo")){
			System.out.println("This Value exists");
		}else{
			System.out.println("This value doesn't exist");
		}
		System.out.println();
		
		hm.viewMap();
		
	}

}
