package project;

public class Video {
	String videoName;
	boolean checkout;
	int rating;
	
	public Video(String name){
		this.videoName = name;
	}
	
	public String getName(){
		return videoName;
	}
	
	public void doCheckout(){
		checkout = true;
	}
	
	public void doReturn(){
		checkout = false;
	}
	
	public void receiveRating(int Rating){
		this.rating = Rating;
	}
	
	public int getRating(){
		return rating;
	}
	
	public boolean getCheckout(){
		return checkout;
	}
}

