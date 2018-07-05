package com.bridgelabz.objectorientedprograms;

import com.bridgelabz.datastructures.MyQueue;
import com.bridgelabz.utility.Utility;

public class DeckOfCardsQueue {

	public static void main(String[] args) {

		String[] suits = { "Clubs", "Diamond", "Hearts", "Spades" };
		String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		String[][] deck = new String[suits.length][cards.length];

		deck = Utility.intializecards(deck, suits, cards);
		deck = Utility.shuffle(deck, suits.length, cards.length);
		String[] player1 = new String[9];
		String[] player2 = new String[9];
		String[] player3 = new String[9];
		String[] player4 = new String[9];

		MyQueue<String> queue1 = new MyQueue<>();
		MyQueue<String> queue2 = new MyQueue<>();
		MyQueue<String> queue3 = new MyQueue<>();
		MyQueue<String> queue4 = new MyQueue<>();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 9; j++) {
				if (i == 0) {
					player1[i] = suits[i] + "-" + cards[j];
					queue1.enqueue(deck[i][j]);
				} else if (i == 1) {
					player2[i] = suits[i] + "-" + cards[j];
					queue2.enqueue(deck[i][j]);
				} else if (i == 2) {
					player3[i] = suits[i] + "-" + cards[j];
					queue3.enqueue(deck[i][j]);
				} else if (i == 3) {
					player4[i] = suits[i] + "-" + cards[j];
					queue4.enqueue(deck[i][j]);
				}
			}
		}
		queue1.display();
		System.out.println();
		queue2.display();
		System.out.println();
		queue3.display();
		System.out.println();
		queue4.display();
	}

	public static void printcards(String[][] deck) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(deck[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
