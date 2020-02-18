package Interfaces;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		KidUser ku = new KidUser();
		AdultUser au = new AdultUser();
		
		
		ku.registerAccount();
		
		ku.requestBook();
		
		au.registerAccount();
		
		au.requestBook();
	}

}
