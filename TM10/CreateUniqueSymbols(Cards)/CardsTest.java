import java.util.*;
public class CardsTest {

	public static void main(String[] args) {
		Set<Card> cardSet = new HashSet<>();
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0; i < 8; i++){
			System.out.println("Enter a card :");
			Card card = new Card();
			card.setSymbol(sc.nextLine().charAt(0));
			card.setNumber(sc.nextInt());
			sc.nextLine();
			
			cardSet.add(card);			
		}
		
		System.out.println("Four symbols gathered in 8 cards.");
		System.out.println("Cards in Set are :");
		
		for(Card i : cardSet){
			System.out.println(i.getSymbol()+" "+i.getNumber());
		}

	}

}
