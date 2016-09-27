package pokerBase;

public enum eCardValue {
	
	TWO(2),THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11),
	QUEEN(12), KING(13), ACE(14), RoyalFlush;
	

	private int cardvalue;

	private eCardValue(int cardvalue){
		this.cardvalue = cardvalue; 
	}
	public int getcardvalue(){
		return cardvalue;
	}
	public int compareto(Card card){
		return this.cardvalue - card.cardvalue;
	}

}
