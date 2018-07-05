/******************************************************************************
 * Purpose: Question to find your number
 *
 * @author  BridgeLabz
 *  
 * @version 1.0
 * 
 * @since   23-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithprograms;

import com.bridgelabz.utility.Utility;

public class GuessNumber {

	public static void main(String[] args) {

		System.out.println("Enter the number");
		int num = Utility.userInputInteger();

		int range = (int) Math.pow(2, num);
		String input = null;
		int first = 0;
		int last = range;
		int mid = (first + last) / 2;
		System.out.println(" your number is between 0 to " + range);
		Utility.searchno(num, first, last, mid, input, range);

	}

	public static void searchno(int num, int first, int last, int mid, String input, int range) {

		int count = 0;

		while (first <= last) {
			System.out.println("is your nu is " + mid);
			System.out.println("enter the input as high or low or yes");
			input = Utility.userInputString();

			if (input.equals("yes")) {
				System.out.println("your number is" + mid);
				return;
			} else if (input.equals("low")) {
				last = mid;
				count++;

			} else {
				first = mid;
				count++;
			}
			if (count < num) {
				mid = (first + last) / 2;
				System.out.println("is your nu is " + mid);
				System.out.println("enter the input as high or low or yes");
				input = Utility.userInputString();
			}
		}
		System.out.println("number not found");
		return;
	}
}
