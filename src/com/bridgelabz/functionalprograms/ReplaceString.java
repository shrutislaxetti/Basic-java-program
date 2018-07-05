
/******************************************************************************
 * Purpose: To replace a Given String in the format "Hello <<UserName",s>>How are you?"
 *
 * @author  BridgeLabz
 *  
 * @version 1.0
 * @since   18-05-2018
 
 ******************************************************************************/

package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class ReplaceString {

	public static void main(String[] args) {

		System.out.println("enter  a string ");
		String s = Utility.userInputString();
        String template="hello <<Username>> How are you?";
		if (s.length() >= 3) {
		  template=template.replace("<<Username>>",s);
		  System.out.println(template);
		} else {
			System.out.println("entered String is small");
		}
	}

}
