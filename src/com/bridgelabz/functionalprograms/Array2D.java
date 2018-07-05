
/******************************************************************************
 * Purpose: To print the 2 dimensional array for given rows and columns
 *
 * @author  BridgeLabz
 *  
 * @version 1.0
 * @since   18-05-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class Array2D {

	public static void main(String[] args) {
		
		System.out.println("enter the number of rows :");
		int rows = Utility.userInputInteger();

		System.out.println("enter the number of columns :");
		int columns = Utility.userInputInteger();

		double[][] arr = Utility.doublearray(rows, columns);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		boolean [][] arr1 = Utility.booleanarray(rows, columns);
		
		for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr1.length; j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
}
