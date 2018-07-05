package com.bridgelabz.datastructures;

import com.bridgelabz.utility.Utility;

public class PalindromeChecker {
 public static void main(String[] args) {
	 
	System.out.println("enter the String ");
	String str=Utility.userInputString();
	boolean result= Utility.checkPalindrome(str);
	if(result) {
		System.out.println("is palindrome");
	}
	else {
		System.out.println("not palindrome");
	}
}
}