package pokerBase;

import java.util.Comparator;
import pokerEnums.eRank;
import pokerBase.eCardSuit;


public class Card {
	private Card rank;

	// fields 
	private int cardsuit;
	public int cardvalue;
	private int iCardNbr;
	private boolean bWild;

	
	// constructors 
	public Card(int value, int suit){
		this.cardvalue = value;
		this.cardsuit = suit;
	}
	
	//getters 
	public int getCardSuit(){
		return cardsuit;
	}
	public int getCardValue(){
		return cardvalue;
	}
	
	// setters 
	public void setSuit(int setsuit){
		this.cardsuit = setsuit;
	}
	public void setValue(int setvalue){
		this.cardvalue = setvalue;
	}
	public Card getRank() {
		return rank;
	}
	public static Comparator<Card> CardRank = new Comparator<Card>() {

		public int compare(Card c1, Card c2) {

		   int Cno1 = c1.getRank().getCardValue();
		   int Cno2 = c2.getRank().getCardValue();

		   /*For descending order*/
		   return Cno2 - Cno1;

	   }};
	   
	public int compareTo(Object o) {
	    Card c = (Card) o; 
	    return c.getRank().compareTo(this.getRank()); 

	}
}
