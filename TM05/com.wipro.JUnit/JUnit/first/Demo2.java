package JUnit.first;

public class Demo2 {
	public boolean palindromeCheck(String st){
		String str = "";
		boolean b;
		for(int i = st.length()-1;i>=0; i--){
			str = str + st.charAt(i);
		}
		return str.equalsIgnoreCase(st);
	}

}
