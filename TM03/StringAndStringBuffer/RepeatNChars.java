package StringAndStringBuffer;

public class RepeatNChars {

	public static void main(String[] args) {
			String st = "Wipro";
			int n = st.length();
			
			for(int i = 0; i < n; i++){
				System.out.print(st.substring(0,2));
			}
	}

}
