/******************************************************************************
 * Purpose: Simulates a gambler who start with stake amount and bets until
            he loose or reach goal...
 *
 * @author  BridgeLabz
 *  
 * @version 1.0
 * @since   18-05-2018
 *
 
 ******************************************************************************/

package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class Gambler {

	public static void main(String[] args) {

		System.out.println("enter the number of times the Bets :");
		int numofbets = Utility.userInputInteger();
		System.out.println("enter the stake amount $stake: ");
		double stakeamt = Utility.userInputDouble();
		System.out.println("enter the goal amount $goal: ");
		double goalamt = Utility.userInputDouble();
		Utility.gambler(numofbets, stakeamt, goalamt);

	}

}
