package wipro.map;
import java.util.*;
import java.util.Map.*;


public class Assignment4 {
	
	HashMap<String, Integer> ContactList = new HashMap<String, Integer>();
	
	public void addContacts(String name, int number){
		ContactList.put(name, number);
	}
	
	public boolean checkKey(String name){
		Set<Entry<String, Integer>> set = ContactList.entrySet();
		
		Iterator<Entry<String, Integer>> it = set.iterator();
		
		while(it.hasNext()){
			Map.Entry<String, Integer> mp = it.next();
			if(mp.getKey().equals(name))
				return true;
		}
		return false;
	}
	
	public boolean checkValue(int number){
		Set<Entry<String, Integer>> set = ContactList.entrySet();
		
		Iterator<Entry<String, Integer>> it = set.iterator();
		
		while(it.hasNext()){
			Map.Entry<String, Integer> mp = it.next();
			if(mp.getValue() == number){
				return true;
			}
		}
		return false;
	}
	
	public void viewMap(){
		Set<Entry<String, Integer>> set = ContactList.entrySet();
		
		Iterator<Entry<String, Integer>> it = set.iterator();
		
		while(it.hasNext()){
			Map.Entry<String, Integer> mp = it.next();
			System.out.println(mp);
		}
	}

	public static void main(String[] args) {
		Assignment4 contacts = new Assignment4();
		
		contacts.addContacts("Mihir", 987654321);
		contacts.addContacts("Sheldon", 341541351);
		contacts.addContacts("Leonard", 557845254);
		contacts.addContacts("Barnedette", 853652164);

		if(contacts.checkKey("Mihir")){
			System.out.println("This Key exists");
		}else{
			System.out.println("This Key doesn't exists");
		}
		System.out.println();
		if(contacts.checkValue(987654321)){
			System.out.println("This Value exists");
		}else{
			System.out.println("This Value doesn't exists");
		}
		System.out.println();
		contacts.viewMap();
	}

}
