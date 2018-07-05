/******************************************************************************
 * Purpose: To find Anagram of two string .
 * @author  BridgeLabz
 * @version 1.0
 * @since   21-05-2018
 ******************************************************************************/

package com.bridgelabz.algorithprograms;

import com.bridgelabz.utility.Utility;

public class Anagram {

	public static void main(String[] args) {
		System.out.println("enter the string ");
		String str1 = Utility.userInputString();
		System.out.println("enter the search stringt to check whether anagram or not");
		String str2 = Utility.userInputString();
		if (Utility.isanagram(str1, str2))
			System.out.println("Strin gis an anagram");
		else
			System.out.println("String is not an anagram");
	}

}
