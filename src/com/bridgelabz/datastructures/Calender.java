package com.bridgelabz.datastructures;

import com.bridgelabz.utility.Utility;

public class Calender {

	public static void main(String[] args) {
		CalenderLogic<String> ob = new CalenderLogic<String>();
		System.out.print("Enter the year : ");
		int y = Utility.userInputInteger();
		System.out.print("Enter the month name (e.g. January) : ");
		String mname = Utility.userInputString();
		System.out.print("Enter the week day name (e.g. Sunday) of 1st day of " + mname + " : ");
		String wname = Utility.userInputString();

		int max = ob.findMaxDay(mname, y);
		int f = ob.findDayNo(wname);
		ob.fillCalendar(max, f, mname, y);

	}

}
