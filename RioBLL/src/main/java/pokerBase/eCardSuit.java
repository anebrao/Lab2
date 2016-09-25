package pokerBase;

public enum eCardSuit {
	
	Hearts(1), Clubs(2), Diamonds(3), 
	Spades(4), Joker(99);

	private int cardsuit;

	private Card_Suit(final int suit) {
		this.cardsuit = suit;
	}

	public int getSuit() {
		return cardsuit;
	}
	
}
