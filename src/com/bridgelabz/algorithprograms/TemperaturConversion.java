
/******************************************************************************
 * Purpose: Determines Windchill.
 *
 *  @author  BridgeLabz
 *  
 *  Given the temperature t (in Fahrenheit) and Celcious,compute temperature in Celsius or viceversa using the using the formula
 * 
 *     Celsius to Fahrenheit: (°C × 9/5) + 32 = °F
       Fahrenheit to Celsius: (°F − 32) x 5/9 = °C
       
 * @version 1.0
 * @since   21-05-2018
 *
 
 ******************************************************************************/

package com.bridgelabz.algorithprograms;

import com.bridgelabz.utility.Utility;

public class TemperaturConversion {
	
public static void main(String[] args) {
	
	System.out.println("Emter the temperature in celcious :" );
	double TempeCelcious=Utility.userInputInteger();
	
	System.out.println("Enter the temperature in fahrenheit:");
	double TempFarenhit=Utility.userInputInteger();
	
	Utility.temperaturConversion(TempeCelcious,TempFarenhit);
}


}
