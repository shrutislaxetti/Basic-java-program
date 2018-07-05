package com.bridgelabz.algorithprograms;

import com.bridgelabz.utility.Utility;

public class BinaryToBinary {

	public static void main(String[] args) {
		System.out.println("enter the decimal number :");
		int decimalnum = Utility.userInputInteger();
		String s1 = Utility.binaryconversion(decimalnum);
		System.out.println(s1);
		String str = Utility.swap(s1);
		System.out.println(str);
		int dnum = Utility.decimalconversion(str);
		System.out.println(dnum);

	}
}
