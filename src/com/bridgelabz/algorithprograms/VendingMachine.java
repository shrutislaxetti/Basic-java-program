/******************************************************************************
 * Purpose: Determines the Fewest Notes to be returned for Vending Machine
 * @author  BridgeLabz
 * @version 1.0
 * @since   23-05-2018
 ******************************************************************************/
package com.bridgelabz.algorithprograms;

import com.bridgelabz.utility.Utility;

public class VendingMachine {

	public static void main(String[] args) {

		System.out.print("Enter the Amount:");
		int amount = Utility.userInputInteger();

		int[] notes = { 1000, 500, 100, 50, 10, 5, 2, 1 };

		System.out.println(Utility.calculate(amount, notes));

	}
}
