package AbstractClass;

public class TestInsrument {

	public static void main(String[] args) {
		Instrument inst[] = new Instrument[10];
		
		for(int i = 0; i < 10; i++){ 
			if(i==0 || i==3 || i==6){
				inst[i]=new Piano(); 
			}
				
		
			else if(i==1 || i==4 || i==7){
				inst[i]=new Flute();
			}
			
			else{
				inst[i]=new Guitar(); 
			}
			
		inst[i].play();
		
			if(inst[i] instanceof Piano){
				System.out.println("This is instance of class Piano"); 
			}
				
			else if(inst[i] instanceof Flute){
				System.out.println("This is instance of class Flute"); 
			}
				
			else{
				System.out.println("This is instance of class Guitar");
			}
			
		}
	}

}
