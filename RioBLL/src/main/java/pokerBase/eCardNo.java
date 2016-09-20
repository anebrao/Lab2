package pokerBase;

public enum eCardNo {
	
	TWO(2),THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11),
	QUEEN(12), KING(13), ACE(14);
	

	private int cardvalue;

	private eCardNo(int cardvalue){
		this.cardvalue = cardvalue; 
	}
	public int getcardvalue(){
		return cardvalue;
	}
	public int compareto(Card card){
		return this.cardvalue - card.cardvalue;
	}
	
	// FIRSTCARD, SECONDCARD, THRIRDCARD, FOURTHCARD, FIFTHCARD;

}
