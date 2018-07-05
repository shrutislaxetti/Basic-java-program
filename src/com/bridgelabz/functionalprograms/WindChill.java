/******************************************************************************
 * Purpose: Determines Windchill.
 *
 *  @author  BridgeLabz
 *  
 *  Given the temperature t (in Fahrenheit) and the wind speed v
 *  (in miles per hour), compute the wind chill w using the formula
 *  from the National Weather Service.
 *
 *     w = 35.74 + 0.6215*t + (0.4275*t - 35.75)  *  v ^ 0.16
 * @version 1.0
 * @since   18-05-2018
 *
 
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class WindChill
{
	public static void main(String[] args)
	{
		System.out.println("enter temperature in Fahrenheit");
		double temperature=Double.parseDouble(args[0]);
		
		System.out.println("enter speed in mili per hour");
		double speed=Double.parseDouble(args[1]);
		Utility.whindchill(temperature,speed);
	}

	
}
