package wipro.set;
import java.util.*;

public class Assignment4 {
	
	TreeSet<String> ts = new TreeSet<String>();
	
	public TreeSet<String> saveCountryNames(String CountryName){
		ts.add(CountryName);
		return ts;
	}
	
	public String getCountry(String CountryName){
		Iterator<String> it = ts.iterator();
		while(it.hasNext()){
			if(it.next().equals(CountryName)){
				return CountryName;
			}
		}
		
		return null;
	}
	
	
	
	public static void main(String[] args) {
		Assignment4 country = new Assignment4();
		
		country.saveCountryNames("USA");
		country.saveCountryNames("India");
		country.saveCountryNames("England");
		country.saveCountryNames("Spain");
		country.saveCountryNames("Wales");
		country.saveCountryNames("Scotland");
		
		System.out.println(country.getCountry("England"));
		System.out.println(country.getCountry("China"));		

	}

}
