package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Utility;

public class StopWatch1 {
	public static void main(String[] args) {

		System.out.println("press 1 starting time");
		long starttime = System.currentTimeMillis();
		System.out.println("Timer has been statrted...");

		System.out.println("press 0 to stop time");
		long elapsedtime = Utility.getElapsedTime(starttime);
		System.out.println(elapsedtime);
	}
}
