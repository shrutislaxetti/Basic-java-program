
/******************************************************************************
 * Purpose: Binary search algorithm for String arrays..
 *
 * @author  BridgeLabz
 *  
 * @version 1.0
 * @since   21-05-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithprograms;

import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class BinarySearchString {

	public static void main(String[] args) {
		System.out.println("enter the length of String elemnt");
		int length = Utility.userInputInteger();

		String[] array = new String[length];

		System.out.println("Enter the string elements:");

		for (int i = 0; i < array.length; i++) {
			array[i] = Utility.userInputString();
		}

		System.out.println("Enter the search  string :");

		String search = Utility.userInputString();

		Arrays.sort(array);
		long starttime = System.nanoTime();
		Utility.binarySearch(array, search);
		long elapsedtime = System.nanoTime() - starttime;

		System.out.println(" elapsed time is :" + elapsedtime);
	}

}
