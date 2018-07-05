package com.bridgelabz.objectorientedprograms;

import com.bridgelabz.utility.Utility;

public class DeckOfCards {

	public static void main(String[] args) {

		String[] suits = { "Clubs", "Diamond", "Hearts", "Spades" };
		String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		String[][] deck = new String[suits.length][cards.length];

		deck = Utility.intializecards(deck, suits, cards);
		deck = Utility.shuffle(deck, suits.length, cards.length);

		Utility.printcards(deck);
	}

}
