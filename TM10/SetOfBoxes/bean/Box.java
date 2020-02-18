package bean;
import java.util.*;

public class Box implements Comparable{
	
	double length;
	double width;
	double height;
	
	public double getLength(){
		return length;
	}
	
	public double getWidth(){
		return width;
	}
	
	public double getHeight(){
		return height;
	}
	
	public void setLength(double length){
		this.length = length;
	}
	
	public void setWidth(double width){
		this.width = width;
	}
	
	public void setHeight(double height){
		this.height = height;
	}
	
	public int compareTo(Object obj){
		Box box = (Box)obj;
		double volume1 = this.height*this.length*this.width;
		double volume2 = box.height*box.length*box.width;
		
		if(volume1>volume2)return 1;
		else if(volume1<volume2)return -1;
		else return 0;
	}
	
	public String toString(){
		double volume = length * width * height;;
		String str = String.format("Length = "+length+" Width = "+width+" Height = "+height+" Volume = %.2f",volume);
		return str;
	}
	
	public boolean equals(Object obj){
		Box box = (Box)obj;
		double volume1 = this.height*this.length*this.width;
		double volume2 = box.height*box.length*box.width;
		
		if(volume1==volume2)return true;
		else return false;
	}
	
	public int hashCode(){
		double volume = this.height*this.length*this.width;
		String str = String.valueOf(volume);
		return str.hashCode();
	}
}
