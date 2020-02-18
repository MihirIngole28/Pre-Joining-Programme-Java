package wipro.map;
import java.util.*;
import java.util.Map.*;

public class Assignment1 {
	
	HashMap<String, String> M1 = new HashMap<String, String>();
	
	public HashMap<String, String> saveCountryCapital(String CountryName, String capital){
		M1.put(CountryName ,capital);
		return M1;
	}
	
	public String getCapital(String CountryName){
		return M1.get(CountryName);
	}
	
	public String getCountry(String capitalName){
		Set<Entry<String, String>> set = M1.entrySet();
		
		Iterator<Entry<String, String>> it = set.iterator();
		
		while(it.hasNext()){
			Map.Entry<String, String> m = it.next();
			
			if(m.getValue().equals(capitalName)){
				return m.getKey();
			}
		}
		return null;
	}
	
	public HashMap<String, String> swapKV(){
		
		HashMap<String, String> M2 = new HashMap<String, String>();
		
		Set<Entry<String,String>> set = M1.entrySet();
		
		Iterator<Entry<String,String>> it = set.iterator();
		
		while(it.hasNext()){
			Map.Entry<String, String> m = it.next();
			M2.put(m.getValue(), m.getKey());
		}
		
		return M2;
	}
	
	public ArrayList<String> toArrayList(){
		ArrayList<String> al = new ArrayList<String>();
		
		Set<Entry<String, String>> set = M1.entrySet();
		
		Iterator<Entry<String, String>> it = set.iterator();
		while(it.hasNext()){
			Map.Entry<String, String> me = it.next();			
			al.add(me.getKey());
		}
		
		return al;
		
	}
	

	public static void main(String[] args) {
		
		Assignment1 hm = new Assignment1();
		
		hm.saveCountryCapital("USA", "Washington DC");
		hm.saveCountryCapital("India", "Delhi");
		hm.saveCountryCapital("Japan", "Tokyo");
		hm.saveCountryCapital("Netherlands", "Amsterdam");
		hm.saveCountryCapital("England", "London");
		hm.saveCountryCapital("Belgium", "Brussels");
		hm.saveCountryCapital("Spain", "Madrid");
		
		
		System.out.println(hm.getCapital("India"));
		
		System.out.println(hm.getCountry("Tokyo"));
		
		System.out.println(hm.toArrayList());
		
		HashMap<String, String> M = hm.swapKV();
		Set<Entry<String, String>> set = M.entrySet();
		
		Iterator<Entry<String, String>> it = set.iterator();
		while(it.hasNext()){
			Map.Entry<String, String> mp = it.next();
			
			System.out.println(mp);
		}
		
		
	}

}
