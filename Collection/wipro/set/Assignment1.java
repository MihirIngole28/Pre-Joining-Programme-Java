package wipro.set;

import java.util.*;

public class Assignment1 {
	
	HashSet<String> H1 = new HashSet<String>();
	
	public HashSet<String> saveCountryNames(String CountryName){
		H1.add(CountryName);
		return H1;
	}

	public String getCountry(String CountryName){
		Iterator<String> it = H1.iterator();
		while(it.hasNext()){
			if(it.next().equals(CountryName))
				return CountryName;
		}
		
		return null;
	}
	public static void main(String[] args) {
		Assignment1 country = new Assignment1();
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
