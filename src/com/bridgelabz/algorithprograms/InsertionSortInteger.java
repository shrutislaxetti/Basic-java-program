
/******************************************************************************
 * Purpose: To find sort element of an array using insertion sort algorithm .
 *
 * @author  BridgeLabz
 *  
 * @version 1.0
 * 
 * @since   21-05-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithprograms;

import com.bridgelabz.utility.Utility;

public class InsertionSortInteger {
	
	public static void main(String[] args) {
		
		System.out.println("enter the length array :");
		int length=Utility.userInputInteger();
		int[] array=new int[length];
		
		for(int i=0;i<array.length;i++)
		{
		     array[i]=Utility.userInputInteger();
		}
		
		Utility.insertionSortInt(array);
		
		System.out.println("Sorted arrays are:");
		
		for(int a:array) 
	      {
			System.out.print(" "+a);
		  }
	}
}
