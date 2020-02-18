package AbstractClass;
import java.util.Random;

public class TestCompartment {

	public static void main(String[] args) {
		Compartment cp[] = new Compartment[10];
		Random rnd=new Random(); 
		int num=0; 
		
		for(int i = 0; i < 10; i++){
			num = rnd.nextInt(4); 
			if(num == 0) cp[i] = new FirstClass(); 
			else if(num == 1) cp[i] = new Ladies(); 
			else if(num == 2) cp[i] = new General(); 
			else cp[i] = new Luggage(); 
			 
			System.out.println(cp[i].notice()); 
		} 
	} 

}
