package pokerBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

public class Hand {
	private ArrayList<Card> CardsInHand = new ArrayList<Card>();

	public void evalHand()
	{ 
		CardsInHand.get(0);
		
	}
	public ArrayList<Card> getCardsInHand() {
		return CardsInHand;
	}

	public void setCardsInHand(ArrayList<Card> cardsInHand) {
		CardsInHand = cardsInHand;
	}


}
