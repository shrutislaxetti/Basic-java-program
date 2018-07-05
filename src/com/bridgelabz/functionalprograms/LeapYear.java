/******************************************************************************
 * Purpose: Determines the year is leapyear or not.
 *
 * @author  BridgeLabz
 *  
 * @version 1.0
 * @since   18-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class LeapYear {

	 public static void main(String[] args) {
		
	System.out.println("Enter the year :");
	int year=Utility.userInputInteger();
	boolean result=Utility.isLeapyear(year);
	if(result){
     System.out.println("leap year");
   }
    else{
    System.out.println("not leap year");
   }
}
}
