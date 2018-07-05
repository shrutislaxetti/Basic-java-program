
/******************************************************************************
 * Purpose: To find search element using binary search algorithm .
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

public class BinarySearch {
public static void main(String[] args) {
	System.out.println("enter the length of an array");
	int length=Utility.userInputInteger();
	System.out.println("enter the array elements");
	Integer array[]=new Integer[length];
	for(int i=0;i<length;i++) {
		array[i]=Utility.userInputInteger();
	}
	Arrays.sort(array);System.out.print("{");
	for(int i=0;i<array.length;i++) {
		System.out.print(array[i]+",");
	}
	System.out.print("}");
	System.out.println();
	System.out.println("Enter the search elemnt from 1 to 10");
	int search=Utility.userInputInteger();
	long starttime = System.nanoTime();
	Utility.binarySearch(array,search);
	long elapsedtime = System.nanoTime() - starttime;

	System.out.println(" elapsed time is :" + elapsedtime);
	
  }
}
