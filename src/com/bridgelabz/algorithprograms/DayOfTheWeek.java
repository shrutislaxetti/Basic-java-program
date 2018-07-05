/******************************************************************************
 * Purpose: Determines the day for the given month and year..
 *
 * @author  BridgeLabz
 *  
 * @version 1.0
 * @since   18-05-2018
 *
 
 ******************************************************************************/

package com.bridgelabz.algorithprograms;

import com.bridgelabz.utility.Utility;

public class DayOfTheWeek {

	public static void main(String[] args) {
		
		System.out.println("Enter the month");
		int month = Integer.parseInt(args[0]);
		
		System.out.println("Enter the day");
		int day = Integer.parseInt(args[1]);
		
		System.out.println("Enter the year");
		int year = Integer.parseInt(args[2]);
		
		String res = Utility.dayOfWeek(month, day, year);
		System.out.print(res);
	}

}
