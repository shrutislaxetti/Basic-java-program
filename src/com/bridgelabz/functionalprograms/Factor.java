/******************************************************************************
 * Purpose: Determines the No of times coin tossed..
 *
 * @author  BridgeLabz
 *  
 * @version 1.0
 * @since   18-05-2018
 *
 
 ******************************************************************************/

package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class Factor {

	public static void main(String[] args) {

		System.out.println("enter a number N to find prime factors : ");
		int number=Utility.userInputInteger();
		Utility.primeFactors(number);
	}
}
