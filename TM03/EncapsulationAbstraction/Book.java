package EncapsulationAbstraction;


public class Book{
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	
	Book(String name, Author author, double price, int qtyInStock){
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	
	public String getName(){
		return name;
	}
	
	public Author getAuthor(){
		return author;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void setPrice(double price) {
	      this.price = price;
	   }
	
	public int getQtyInStock(){
		return qtyInStock;
	}
	
	public String toString() {
	      return "'" + name + "' by " + author;
	}
	
	
	public static void main(String[] args){
		Author ah1 = new Author("J.K. Rowling", "rowling@gmail.com", 'f');
	    System.out.println(ah1);
	    
		Book b1 = new Book("Harry Potter",ah1,55.5,100);
		System.out.println(b1);
		
		System.out.println("name is: " + b1.getName());
	    System.out.println("price is: " + b1.getPrice());
	    System.out.println("qty is: " + b1.getQtyInStock());
	    System.out.println("author is: " + b1.getAuthor());
	    System.out.println("author's name is: " + b1.getAuthor().getName());
	    System.out.println("author's email is: " + b1.getAuthor().getEmail());
	    System.out.println("author's gender is: " + b1.getAuthor().getGender());
		
	}
}
