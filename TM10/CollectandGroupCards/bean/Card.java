package bean;

public class Card implements Comparable{
	
	char symbol;
	int number;
	
	public void setSymbol(char symbol){
		this.symbol = symbol;
	}
	
	public void setNumber(int number){
		this.number = number;
	}
	
	public char getSymbol(){
		return symbol;
	}
	
	public int getNumber(){
		return number;
	}
	
	public int compareTo(Object obj){
		if(obj instanceof Card){
			Card card = (Card)obj;
			if(this.symbol < card.symbol) return -1;
			else if(this.symbol > card.symbol) return 1;
			else return 1;
		}
		return 1;
	}

}
