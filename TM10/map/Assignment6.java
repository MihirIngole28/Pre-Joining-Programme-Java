package wipro.map;
import java.util.*;
import java.util.Map.*;

public class Assignment6 {
	
	Hashtable<String, String> M1 = new Hashtable<String, String>();
	
	public Hashtable<String, String> saveCountryCapital(String CountryName, String capital){
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
	
	public Hashtable<String, String> swapKV(){
		
		Hashtable<String, String> M2 = new Hashtable<String, String>();
		
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
		
		Assignment6 ht = new Assignment6();
		
		ht.saveCountryCapital("USA", "Washington DC");
		ht.saveCountryCapital("India", "Delhi");
		ht.saveCountryCapital("Japan", "Tokyo");
		ht.saveCountryCapital("Netherlands", "Amsterdam");
		ht.saveCountryCapital("England", "London");
		ht.saveCountryCapital("Belgium", "Brussels");
		ht.saveCountryCapital("Spain", "Madrid");
		
		
		System.out.println(ht.getCapital("India"));
		
		System.out.println(ht.getCountry("Tokyo"));
		
		System.out.println(ht.toArrayList());
		
		Hashtable<String, String> M = ht.swapKV();
		Set<Entry<String, String>> set = M.entrySet();
		
		Iterator<Entry<String, String>> it = set.iterator();
		while(it.hasNext()){
			Map.Entry<String, String> mp = it.next();
			
			System.out.println(mp);
		}
		
		
	}

}
