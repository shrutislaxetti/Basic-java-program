
/******************************************************************************
 * Purpose: To determine the Prime numbers from 1 to 1000
 * @author  BridgeLabz
 *  
 * @version 1.0
 * @since   21-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithprograms;

import com.bridgelabz.utility.Utility;

public class PrimePalindromeNumbers {

	public static void main(String[] args) {

		System.out.println("Enter the numbers from 1 to 1000");
		int number = Utility.userInputInteger();
		System.out.println("prime numbers which are palindrome are:");
		int count=0;
		for (int i = 2; i <= number; i++) {
			/*if (Utility.isPrime(i) ) {
				count++;
				System.out.println(i);
			}
			*/
			if (Utility.isPrime(i) && Utility.ispalindrome(i)) {
				if(i>9) {
				System.out.println(i);
			}
			}
		}System.out.println(count);
	}
}
