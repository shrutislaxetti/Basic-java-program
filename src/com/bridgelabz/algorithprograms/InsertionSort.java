package com.bridgelabz.algorithprograms;

import com.bridgelabz.utility.Utility;

public class InsertionSort {
	public static void main(String[] args) {
		System.out.println("enter the length of string array :");
		int length = Utility.userInputInteger();
		System.out.println("enetr the string elemts");
		String[] strarray = new String[length];
		for (int i = 0; i < length; i++) {
			strarray[i] = Utility.userInputString();
		}

		Utility.insertionSort(strarray);
		for (String a : strarray) {
			System.out.println(a);
		}
	}
}
