/******************************************************************************
 * Purpose: Determines the monthly payment using principal amount,year,rate of interest..
 * @author  BridgeLabz
 * @version 1.0
 * @since   23-05-2018
 ******************************************************************************/

package com.bridgelabz.algorithprograms;

import com.bridgelabz.utility.Utility;

public class MonthlyPayement {
	public static void main(String[] args) {

		System.out.println("enter the principal loan amount");
		int p = Integer.parseInt(args[0]);

		System.out.println("enter the years to pay off :");
		int y = Integer.parseInt(args[1]);

		System.out.println("enter rate of percent interest compounded monthly");
		int r = Integer.parseInt(args[2]);

		Utility.monthlyPayment(p, y, r);

	}
}
