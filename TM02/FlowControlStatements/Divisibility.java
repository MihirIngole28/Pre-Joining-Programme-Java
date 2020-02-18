package FlowControlStatements;

public class Divisibility {

	public static void main(String[] args) {
		int num,temp;
		int i=0,k=1;
		while(i<5){
			if((k % 2)==0 && (k % 3)==0 && (k%5)==0){
				System.out.println(k);
				i++;
			}
			k++;
		}

	}

}
