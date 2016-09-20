package pokerBase;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;

public class HandScore {
	// fields
	private ArrayList<Card> Kickers = new ArrayList<Card>();
	private int HandStrength;
	private int HiHand;
	private int LoHand;
	// constructors

	public HandScore() {
	}

	public HandScore(int handStrength, int hiHand, int loHand, ArrayList<Card> kickers) {
		super();
		HandStrength = handStrength;
		HiHand = hiHand;
		LoHand = loHand;
		Kickers = kickers;
	}

	public int getHandStrength() {
		return HandStrength;
	}
	
	public void setHandStrength(int handStrength){
		HandStrength = handStrength; 
	}
}
 //more methods to be added