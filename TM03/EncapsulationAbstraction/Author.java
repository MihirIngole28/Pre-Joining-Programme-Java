package EncapsulationAbstraction;

public class Author {
	
	String name;
	String email;
	char gender;
	
	public Author(String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName(){
		return name;
	}
	
	public char getGender(){
		return gender;
	}
	
	public String getEmail(){
		return email;
	}
	
	public String toString(){
		return name + " (" + gender + ") at " + email;
	}
	
	
	
	public static void main(String[] args) {
		Author ah1 = new Author("J.K. Rowling", "rowling@gmail.com", 'm');
	    System.out.println(ah1);
	    System.out.println("name is: " + ah1.getName());
	    System.out.println("gender is: " + ah1.getGender());
	    System.out.println("email is: " + ah1.getEmail());
	   }

}

