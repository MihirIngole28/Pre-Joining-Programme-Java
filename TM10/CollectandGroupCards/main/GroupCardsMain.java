package main;
import bean.*;
import java.util.*;
import java.util.Map.*;


public class GroupCardsMain {

	public static void main(String[] args) {
		
		Map<Character, ArrayList<Card>> cards = new TreeMap<>();
		Scanner sc = new Scanner(System.in);
		int num;
		
		char symbol;
		int number;
		System.out.println("Enter Number of cards : ");
		num = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= num; i++){
			System.out.println("Enter card "+i+": ");
			
			Card card = new Card();
			symbol = sc.nextLine().charAt(0);
			number = sc.nextInt();
			
			card.setSymbol(symbol);			
			card.setNumber(number);
			sc.nextLine();
			
			if(cards.containsKey(symbol) == false){
				ArrayList<Card> list = new ArrayList<>();
				list.add(card);
				cards.put(symbol, list);
			}else{
				ArrayList<Card> list = cards.get(symbol);
				list.add(card);
			}
		}	
		
		System.out.println("Distinct Symbols are :");
			
		Set<Entry<Character, ArrayList<Card>>> set = cards.entrySet();
		Iterator<Entry<Character, ArrayList<Card>>> it = set.iterator();
		
		while(it.hasNext()){
			System.out.print(it.next().getKey()+" ");
		}
			
		set = cards.entrySet();
		it = set.iterator();
		
		while(it.hasNext()){
			int sum = 0;
			Map.Entry<Character, ArrayList<Card>> m = it.next();
			ArrayList<Card> list = m.getValue();
			
			System.out.println("Cards in " + m.getKey() + " Symbol");
			
			for (Card k : list) {
				System.out.println(k.getSymbol() + " " + k.getNumber());
				sum += k.getNumber();
			}
			
			System.out.println("Number of cards : " + list.size());
			System.out.println("Sum of Numbers : " + sum);
		}	
	}
}
