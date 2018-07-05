/******************************************************************************
 * Purpose: To find the differrent combinations of the given string
 *
 * @author  BridgeLabz
 *  
 * @version 1.0
 * @since   22-05-2018
 
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class StringPermute {
	
	    public static void main(String[] args) 
	    {
	        System.out.println("Enter the length string: ");
	        
	        int n = Utility.userInputInteger();
	 
	        char[] array = new char[n];
	        System.out.println("Enter chars of  string: ");
	        
	        for (int i = 0; i < n; i++)
	            array[i] = Utility.userInputString().charAt(0);
	        
	        System.out.println("permutations of strings are: ");
	        Utility.permute(array, 0);
	        
	    }
}
