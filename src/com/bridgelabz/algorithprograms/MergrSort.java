
/******************************************************************************
 * Purpose: Merge sort algorithm for string array..
 *
 * @author  BridgeLabz
 *  
 * @version 1.0
 * @since   22-05-2018
 *
 
 ******************************************************************************/

package com.bridgelabz.algorithprograms;

import com.bridgelabz.utility.Utility;

public class MergrSort {

public static void main(String[] args) {
	
	System.out.println("enter the length of String elemnt");
    int length=Utility.userInputInteger();
    
    System.out.println("Enter the string elements of  array:");
    String[] array = new String[length];
    /*
    for(int i=0;i<length;i++) 
    {
    low[i]=Utility.userInputString();
    }
    
    System.out.println("Enter the string elements 2nd array:");
    String[] high = new String[length];
   
    for(int i=0;i<length;i++) 
    {
    high[i]=Utility.userInputString();
    }
    String[] array = new String[low.length + high.length];
       
       Utility. merge(array, low, high);
*/
       Utility.  mergeSort(array);
        
       for (String s : array)
          {
            System.out.print(s+" ");
          }
     }

 }


