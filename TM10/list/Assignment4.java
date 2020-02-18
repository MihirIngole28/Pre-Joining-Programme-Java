package wipro.list;
import java.util.*;

public class Assignment4 {
	public static void main(String args[]){
		List<Object> list = new MyArrayList<>();	
		
		try{
			list.add(10);
			list.add(4.2F);
			list.add(3.142D);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println(list);
	}
	
}

class MyArrayList<E> extends ArrayList<E>{
	public boolean add(E e){
		if(e instanceof Integer || e instanceof Float || e instanceof Double){
			super.add(e);
			return true;
		}else{
			throw new ClassCastException("Only Integer, Float, and Double types are allowed");
		}
	}
}