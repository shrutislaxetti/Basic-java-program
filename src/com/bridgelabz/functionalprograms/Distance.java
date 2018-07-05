/******************************************************************************
 * Purpose: To determine Euclidean distance from the point (x, y) to the origin (0, 0).
 *
 * @author  BridgeLabz
 *  
 * @version 1.0
 * @since   18-05-2018
 *
 
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class Distance {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		Utility.distanceOf(x, y);
	}
}
