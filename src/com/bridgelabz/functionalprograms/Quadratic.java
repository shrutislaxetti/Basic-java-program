
/******************************************************************************
 * Purpose: Determines the Quadratic sum of N ineter..
 *
 * @author  BridgeLabz
 *  
 * @version 1.0
 * @since   18-05-2018
 *
 
 ******************************************************************************/

package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class Quadratic {

	public static void main(String[] args) {

		System.out.println("enter the value of 'a' :");
		int x=Utility.userInputInteger();
		System.out.println("enter the value of 'b' :");
		int y=Utility.userInputInteger();
		System.out.println("enter the value of 'c' :");
		int z=Utility.userInputInteger();
		Utility.quadratic(x,y ,z );
	}

}
