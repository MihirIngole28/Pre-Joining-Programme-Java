package bean;
import java.util.*;

public class StringList {
	List<String> list = new ArrayList<String>();
	
	public boolean Insert(String object){
		try{
			list.add(object);
			return true;
		}catch(Exception e){
			return false;
		}
	}
	
	public boolean Search(String object){
		try{
			boolean b = false;
			Iterator<String> it = list.iterator();
			
			while(it.hasNext()){
				if(it.next().equals(object)) b = true;
				break;
			}
			return b;
		}catch(Exception e){
			return false;
		}
	}
	
	public boolean Delete(String object){
		try{
			boolean b = false;
			Iterator<String> it = list.iterator();
			
			while(it.hasNext()){
				if(it.next().equals(object)){
					list.remove(object);
					b = true;
				}
			}
			return b;
		}catch(Exception e){
			return false;
		}
	}
	
	public void Display(){
		for(String i : list){
			System.out.println(i);
		}
	}
		
	
}
