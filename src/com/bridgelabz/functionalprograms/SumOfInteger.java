/******************************************************************************
 * Purpose: To print triplets where sum of integers adds to zeo.
 *
 * @author  BridgeLabz
 *  
 * @version 1.0
 * @since   18-05-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class SumOfInteger {
	
	public static void main(String[] args){
		
     System.out.println("enter number of integers :");
     int num=Utility.userInputInteger();
     System.out.println("enter total elemts of array :");
    
     int array[]=new int[num];
    
     for(int i=0;i<array.length;i++) 
     {
    	 array[i]=Utility.userInputInteger(); 
     }
     
     Utility.triplets(array);

	}
}
