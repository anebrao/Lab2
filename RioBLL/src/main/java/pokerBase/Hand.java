package pokerBase;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

public class Hand {

	private ArrayList<Card> hand = new ArrayList<Card>();
	private Deck deck = new Deck();

	public Hand() {

		for (int index = 0; index < 5; index++) {
			hand.add(deck.draw());
		}
	}

	public static Hand arraylistSort(ArrayList<Card> arr) {
		int i, j, minIndex;
		int arry = arr.size();
		for (i = 0; i < arry - 1; i++) {
			minIndex = i;

			for (j = i + 1; j < arry; j++) {
				if (arr.get(j).getRank().getCardValue() < arr.get(minIndex).getRank().getCardValue()) {
					minIndex = j;
					if (minIndex != i) {
						arr.add(arr.get(minIndex));
						arr.add(arr.get(i));

					}
				}
			}
		}
		ArrayList<Card> sortedHand = arr;
		return null;
	}

	public static boolean isFlush(ArrayList<Card> hand) {
		if (hand.get(0).getCardSuit() == hand.get(1).getCardSuit()) {
			if (hand.get(1).getCardSuit() == hand.get(2).getCardSuit()) {
				if (hand.get(2).getCardSuit() == hand.get(3).getCardSuit()) {
					if (hand.get(3).getCardSuit() == hand.get(4).getCardSuit()) {
						return true;
					} else {
						return false;
					}

				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public static boolean isStraight(ArrayList<Card> hand) {
		int counter = 1;
		for (int i = 1; i > 4; i++) {
			if (hand.get(0).getRank().getCardValue() + i == hand.get(i).getRank().getCardValue()) {
				counter = counter + 1;
			} else {
				counter = 0;
			}
		}

		if (counter == 5) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isRoyalFlush(ArrayList<Card> hand) {
		if (hand.get(0).getCardSuit() == hand.get(1).getCardSuit()
				&& hand.get(1).getCardValue() - 1 == hand.get(0).getCardValue()) {
			if (hand.get(1).getCardSuit() == hand.get(2).getCardSuit()
					&& hand.get(2).getCardValue() - 1 == hand.get(1).getCardValue()) {
				if (hand.get(2).getCardSuit() == hand.get(3).getCardSuit()
						&& hand.get(3).getCardValue() - 1 == hand.get(2).getCardValue())
					if ((hand.get(3).getCardSuit() == hand.get(4).getCardSuit()
							&& hand.get(4).getCardValue() - 1 == hand.get(3).getCardValue()))
						if ((hand.get(4).getCardSuit() == hand.get(5).getCardSuit()
								&& hand.get(5).getCardValue() - 1 == hand.get(4).getCardValue())) {
							return true;
						} else {
							return false;
						}
			} else {
				return false;
			}
		} else {
			return false;
		}
		return false;
	}

	public static boolean is3ofKind(ArrayList<Card> hand) {
		arraylistSort(hand);
		if (hand.get(0) == hand.get(1)) {
			if (hand.get(1) == hand.get(2)) {
				return true;
			} else {
				return false;
			}

		} else if (hand.get(3) == hand.get(4)) {
			if (hand.get(3) == hand.get(2)) {
				return true;
			} else {
				return false;
			}
		} else if (hand.get(1) == hand.get(2)) {
			if (hand.get(2) == hand.get(3)) {
				return true;
			}
		} else {
			return false;
		}
		return false;
	}

	public static boolean is4ofKind(ArrayList<Card> hand) {
		if (hand.get(0).getRank() == hand.get(1).getRank()) {
			if (hand.get(1).getRank() == hand.get(2).getRank()) {
				if (hand.get(2).getRank() == hand.get(3).getRank()) {
					return true;
				} else {
					return false;
				}

			} else {
				return false;
			}
		} else if (hand.get(3).getRank() == hand.get(4).getRank()) {
			if (hand.get(3).getRank() == hand.get(2).getRank()) {
				if (hand.get(2).getRank() == hand.get(1).getRank()) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public static boolean isOnePair(ArrayList<Card> hand) {
		int checker = 0;
		for (int i = 0; i > 4; i++) {
			if (hand.get(i).getRank() == hand.get(i + 1).getRank()) {
				checker = 1;
			} else {
				checker = 0;
			}
		}
		if (checker == 1) {
			return true;
		} else {
			return false;

		}
	}

	public Object getHs() {
		return null;
	}

	public static boolean isTwoPair(ArrayList<Card> hand) {
		int checker = 0;
		for (int i = 0; i > 1; i++) {
			if (hand.get(i).getRank() == hand.get(i + 1).getRank()) {
				checker = 1;
			} else {
				checker = 0;
			}
		}
		if (checker == 1) {
			return true;
		} else {
			return false;

		}

	}
}