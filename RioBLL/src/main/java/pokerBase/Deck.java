package pokerBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck  {
	
	private ArrayList<Card> DeckCards = new ArrayList<Card>();
	
	// generates 52 cards in the deck 
	public Deck(){ 
		for (int i = 0; i<4; i++)
		{
			for (int j = 0; j<13; j++)
			{ 
				Card c = new Card(i,j);
				DeckCards.add(c);  
			}
		}
		
		// shuffle the deck 
		Collections.shuffle(DeckCards);
		
		// look back at this Collections.sort(DeckCards );
	//public card draw(){ 
		// card newcardtaken
	}
	}
}
