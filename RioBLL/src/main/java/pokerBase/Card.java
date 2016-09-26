package pokerBase;

import java.util.Comparator;


public class Card {
	private Card rank;

	// fields 
	private int cardsuit;
	public int cardvalue;
	
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
}
