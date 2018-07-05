/******************************************************************************
 * Purpose: Determines the Powers of 2..
 *
 * @author  BridgeLabz
 *  
 * @version 1.0
 * @since   18-05-2018
 
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class Power2 {
	public static void main(String[] args) {
		
		int num = Integer.parseInt(args[0]);
		System.out.println("Powers of 2 are :");
		Utility.power(num);

	}
}
