package pokerBase;

//import java.util.Comparator;

public class Card {
	
	// fields 
	private int cardnumber;
	private int cardsuit;
	public int cardvalue;
	
	// constructors 
	public Card(int number, int suit){
		this.cardnumber = number;
		this.cardsuit = suit;
	}
	
	//getters 
	public int getCardNbr(){
		return cardnumber;
	}
	public int getCardSuit(){
		return cardsuit;
	}
	//public int getCardValue(){
	//	return cardvalue;
	//}
	
	// setters 
	public void setSuit(int setsuit){
		this.cardsuit = setsuit;
	}
	//public void setValue(int setvalue){
	//	this.cardvalue = setvalue;
	//}
}
