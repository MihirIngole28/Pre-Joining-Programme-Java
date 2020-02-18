package wipro.map;
import java.util.*;
import java.util.Map.*;

public class Assignment5 {
	
	TreeMap<String, String> M1 = new TreeMap<String, String>();
	
	public TreeMap<String, String> saveCountryCapital(String CountryName, String capital){
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
	
	public TreeMap<String, String> swapKV(){
		
		TreeMap<String, String> M2 = new TreeMap<String, String>();
		
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
		
		Assignment5 tm = new Assignment5();
		
		tm.saveCountryCapital("USA", "Washington DC");
		tm.saveCountryCapital("India", "Delhi");
		tm.saveCountryCapital("Japan", "Tokyo");
		tm.saveCountryCapital("Netherlands", "Amsterdam");
		tm.saveCountryCapital("England", "London");
		tm.saveCountryCapital("Belgium", "Brussels");
		tm.saveCountryCapital("Spain", "Madrid");
		
		
		System.out.println(tm.getCapital("India"));
		
		System.out.println(tm.getCountry("Tokyo"));
		
		System.out.println(tm.toArrayList());
		
		TreeMap<String, String> M = tm.swapKV();
		Set<Entry<String, String>> set = M.entrySet();
		
		Iterator<Entry<String, String>> it = set.iterator();
		while(it.hasNext()){
			Map.Entry<String, String> mp = it.next();
			
			System.out.println(mp);
		}
		
		
	}

}
