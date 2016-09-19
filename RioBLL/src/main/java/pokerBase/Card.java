package pokerBase;

import java.util.Comparator;

public class Card {
	
	// fields 
	private  int cardnumber;
	private int cardsuit;
	private int cardrank;
	
	// constructors 
	public Card(int number, int suit, int rank){
		cardnumber = number;
		cardsuit = suit;
		cardrank = rank;
	}
	
	public int getCardNbr(){
		return cardnumber;
	}
	
	public int getCardSuit(){
		return cardsuit;
	}
	
	public int getCardRank(){
		return cardrank; 
	}
	
	
}
