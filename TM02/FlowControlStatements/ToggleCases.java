package FlowControlStatements;

public class ToggleCases {

	public static void main(String[] args) {
		char ch1 = 'K';
		char ch2;
		int temp;
		temp = (int)ch1;
		
		if(ch1 >= 65 && ch1 <= 90){
			ch2 = (char)(temp + 32);
			System.out.println(ch1+"->"+ch2);
		}
		if(ch1 >= 97 && ch1 <= 122){
			ch2 = (char)(temp - 32);
			System.out.println(ch1+"->"+ch2);
		}

	}

}
