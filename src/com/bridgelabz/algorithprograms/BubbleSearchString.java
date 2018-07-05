/******************************************************************************
 * Purpose: bubble sort algorithm for String .
 *
 * @author  BridgeLabz
 *  
 * @version 1.0
 * 
 * @since   21-05-2018
 *
 ******************************************************************************/


package com.bridgelabz.algorithprograms;

import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class BubbleSearchString {

	public static void main(String[] args) {

		System.out.println("enter the length of  string array:");
		int length=Utility.userInputInteger();
		
		String [] array= new String[length];
		
		for(int i=0;i<array.length;i++)
		{
		array[i]=Utility.userInputString();
		}
		Arrays.sort(array);
		Utility.bubbleSortString(array);
		
	   /* for each loop to print an array from index o to n */
		for(String str:array)
		{
			System.out.print(str +" ");
		}
	 }
	}


