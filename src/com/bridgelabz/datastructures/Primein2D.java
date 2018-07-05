package com.bridgelabz.datastructures;

import com.bridgelabz.utility.Utility;

public class Primein2D {
	public static void main(String[] args) {
		System.out.println("enter the range");
		int num = Utility.userInputInteger();
		LinkedList<LinkedList<Integer>> a = Utility.printprime(num);
		for (int j = 0; j < 10; j++) {
			LinkedList<Integer> array = a.getvalue(j);
			for (int i = 0; i < array.size(); i++) {

				System.out.print(array.getvalue(i) + " ");
			}
			System.out.println();
		}
	}
}