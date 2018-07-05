/******************************************************************************
 * Purpose: Determines the square root of a given number..
 * @author  BridgeLabz
 * @version 1.0
 * @since   23-05-2018
 ******************************************************************************/

package com.bridgelabz.algorithprograms;

import com.bridgelabz.utility.Utility;

public class SquareRoot {

	public static void main(String[] args) {
		
		System.out.println("enter the number to find the square root");
		double number = Utility.userInputInteger();

		if (number > 0) {
			double result = Utility.squareroot(number);
			System.out.println(result);
			
		}
	}

}
