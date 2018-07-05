
/******************************************************************************
 * Purpose: To sort the unsorted elemts of an array using bubble Sort algorithm .
 *
 * @author  BridgeLabz
 *  
 * @version 1.0
 * @since   21-05-2018
 *
 
 ******************************************************************************/
package com.bridgelabz.algorithprograms;

import com.bridgelabz.utility.Utility;

public class BubbleSort {
	
public static <T>void main(String[] args) {
	
	System.out.println("enter the length of array:");
	int length=Utility.userInputInteger();
	Integer [] array= new Integer[length];
	System.out.println("enter the array elemts:");
	for(int i=0;i<length;i++)
	{
	array[i]=Utility.userInputInteger();
	}
	
	Utility.bubbleSort(array);
	
	for(int num:array)
	{
		System.out.println(num);
	}
 }

}

