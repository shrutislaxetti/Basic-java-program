/******************************************************************************
 * Purpose: To convert decimal number to binary .
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

public class DecimalToBinary {

	public static void main(String[] args) {

		System.out.println("enter the decimal number :");
		int decimalnum = Utility.userInputInteger();

		String s1 = Utility.binaryconversion(decimalnum);
		System.out.println(s1);

		String s3 = Utility.nibbleof(s1);
		System.out.println(s3);

	}

}
