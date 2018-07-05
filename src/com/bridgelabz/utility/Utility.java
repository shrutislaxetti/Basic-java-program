/******************************************************************************
 * Purpose: common class to write the methods of all programss..
 *
 * @author  BridgeLabz
 *  
 * @version 1.0
 * @since   18-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.utility;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.datastructures.*;

public class Utility {

	private static Scanner scanner = new Scanner(System.in);

	/* To take String inputs from user */
	public static String userInputString() {
		return scanner.next();
	}

	/* To take Boolean inputs from user */
	public static boolean userInputBoolean() {
		return scanner.nextBoolean();
	}

	/* To take Integer inputs from user */
	public static int userInputInteger() {
		return scanner.nextInt();
	}

	public static double userInputDouble() {
		return scanner.nextDouble();
	}

	/*************************************************************
	 * function to find harmonic mean of sum of N integer inputs
	 * 
	 * @param a
	 * @return
	 ************************************************************/

	public static float harmonic(int a) {
		float sum = 0.0f;

		for (int i = 1; i <= a; i++) {
			sum = sum + (float) 1 / i;
		}
		return sum;
	}

	/*****************************************************************
	 * method that takes two double arguments and prints the wind chill. Use
	 * Math.pow(b, a) to compute b^a.
	 * 
	 * @param temperature
	 * @param speed
	 *
	 ******************************************************************/

	public static void whindchill(double temperature, double speed) {
		double b = 0.16;
		double a = 0.0;
		if (temperature <= 50 && speed <= 120 || speed >= 3)
			a = Math.pow(speed, b);
		double windchill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * a;
		System.out.println(" Whether is :" + windchill);
	}

	/*****************************************************************
	 * function to Print Number of Wins and Percentage of Win and Loss.
	 * 
	 * @param noOfbets
	 * @param stake
	 * @param goal
	 *****************************************************************/
	public static void gambler(int noOfbets, double stake, double goal) {
		double percentage = 0.0;
		int win = 0;
		for (int i = 0; i < noOfbets; i++) {
			/*
			 * to get the random values between 0 and 1
			 */
			double cash = stake;
			while (cash > 0 && cash < goal) {
				if (Math.random() < 0.5) {
					cash++;
				} else {
					cash--;
				}
			}
			if (cash == goal) {
				win++;
			}
		}
		percentage = (win * 100) / noOfbets;
		System.out.println("winning percentage is : " + percentage + "%");

	}

	/*********************************************************************
	 * function to find the number of triplets in an array that sums to zero...
	 * 
	 * @ * @param array
	 * 
	 *********************************************************************/

	public static void triplets(int[] array) {
		int count = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		for (i = 0; i < array.length - 2; i++) {
			for (j = i + 1; j < array.length - 1; j++)

				for (k = j + 1; k < array.length - 0; k++) {
					if ((array[i] + array[j] + array[k]) == 0) {
						count++;
						System.out.println("a[i] :" + array[i] + "  a[j] :" + array[j] + "  a[k]:" + array[k]);
					}
				}
		}
		System.out.println("the number of triplets are :" + count);
	}

	/********************************************************************
	 * function to find the distance from origin to given position using squareroot
	 * function
	 * 
	 * @param x
	 * @param y
	 *
	 *********************************************************************/

	public static void distanceOf(int x, int y) {
		int distance = 0;
		distance = (int) Math.sqrt(x * x + y * y);

		System.out.println("Ditance from p(x,y) to origin is :" + distance);
	}

	/********************************************************************
	 * function to check the number of times coin tossed and prints percentage of
	 * heads appered...
	 * 
	 * @param noOfTimes
	 *
	 *********************************************************************/

	public static void percentage(int noOfTimes) {
		int head = 0;
		int tail = 0;
		double percentageOfCoins = 0.0;

		for (int i = 0; i < noOfTimes; i++) {

			if (Math.random() < 0.5) {
				tail++;
			} else {
				head++;
			}
		}
		percentageOfCoins = ((head * 100) / noOfTimes);
		System.out.println(percentageOfCoins);
		percentageOfCoins = ((tail * 100) / noOfTimes);
		System.out.println(percentageOfCoins);
	}

	/********************************************************************
	 * function to print prime factors for given integer inputs
	 ** 
	 * @param n
	 *********************************************************************/

	public static void primeFactors(int n) {
		if (n < 2)
			System.out.println("invalid input");
		int i = 2;
		while (n > 1 && i <= n) {
			if (n % i == 0) {
				System.out.println(i);
				n = n / i;
			} else
				i++;
		}
	}

	/********************************************************************
	 * function to find Quadratic equation of given integer inputs
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * 
	 *********************************************************************/
	public static void quadratic(int a, int b, int c) {
		double delta;
		double r1;
		double r2;

		delta = b * b - 4 * a * c;

		if (delta > 0) {
			System.out.println("roots are real and unequal");

			r1 = +(-b + Math.sqrt(delta)) / (2 * a);
			System.out.println("root1 : " + r1);

			r2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("root2 : " + r2);
		}

		else if (delta == 0) {
			System.out.println("roots are real and equal");

			r1 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("root1 : " + r1);
		} else {
			System.out.println("imaginary roots");
		}
	}

	/********************************************************************
	 * function to print 2D Array ..
	 * 
	 * @param rows
	 * @param columns
	 * @return
	 *********************************************************************/
	public static double[][] doublearray(int rows, int columns) {
		System.out.println("enter the array elements");
		double[][] y = new double[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				y[i][j] = Utility.userInputDouble();
			}
		}
		return y;
	}

	public static boolean[][] booleanarray(int rows, int columns) {
		System.out.println("enter the boolean array elements");
		boolean[][] y = new boolean[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				y[i][j] = Utility.userInputBoolean();
			}
		}
		return y;
	}

	/****************************************************************************
	 * function to print the permutations of the given string..
	 * 
	 * @param a
	 * @param CalenderWeekObject
	 * @return
	 ****************************************************************************/

	public static void permute(char[] a, int j) {
		if (j == a.length) {
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]);
			}
			System.out.println();
		} else {
			for (int i = j; i < a.length; i++) {
				char temp = a[j];
				a[j] = a[i];
				a[i] = temp;

				/* Recursive method */

				permute(a, j + 1);
				temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		}
	}

	/****************************************************************************
	 * function to check wether the two string are Anagram or not..
	 * 
	 * @param a
	 * @param b
	 * @return
	 ****************************************************************************/
	public static boolean isanagram(String a, String b) {
		char[] a1 = a.toLowerCase().toCharArray();
		char[] b1 = b.toLowerCase().toCharArray();
		Arrays.sort(a1);
		Arrays.sort(b1);
		if (a1.length != b1.length)
			return false;

		if (Arrays.equals(a1, b1))
			return true;
		else
			return false;
	}

	/****************************************************************************
	 * function to print wether the number is primt or not and returns the number..
	 * 
	 * @param num
	 * @return
	 ****************************************************************************/
	public static boolean isPrime(int num) {
		if (num < 2)
			return false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;

	}

	/******************************************************************************
	 * function to convert temperature in farenhit to celcious to viceversa...
	 * 
	 * @param Celcious
	 * @param farenhit
	 ****************************************************************************/

	public static void temperaturConversion(double celcious, double farenhit) {

		System.out.println(" temerature in Farenhit is:" + ((celcious * 9 / 5) + 32));
		System.out.println("temerature in Celcious is:" + ((farenhit - 32) * 5 / 9));
	}

	/*****************************************************************************
	 * function to sort an array usinf Bubble Sort algorithm
	 * 
	 * @param array
	 ***************************************************************************/

	public static <T extends Comparable<T>> void bubbleSort(T[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					T temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	/*******************************************************************************
	 * Insertion Sort
	 *
	 * @param strarray
	 ******************************************************************************/
	public static <T extends Comparable<T>> void insertionSort(T[] strarray) {
		for (int i = 1; i < strarray.length; i++) {
			int j = i - 1;
			T key = strarray[i];
			while (j >= 0 && strarray[j].compareTo(key) > 0) {
				strarray[j + 1] = strarray[j];
				j--;
			}
			strarray[j + 1] = key;
		}
	}

	/****************************************************************************
	 * function to sort the string using Binary search algorithm
	 * 
	 * @param array
	 * @param search
	 * @return
	 ****************************************************************************/
	public static <T extends Comparable<T>> void binarySearch(T[] array, T search) {
		int first = 0;
		int last = array.length - 1;

		while (first <= last) {
			int mid = (first + last) / 2;
			if (search.equals(array[mid])) {
				System.out.println("element found at index" + mid);
				return;
			} else if (search.compareTo(array[mid]) < 0) {
				last = mid - 1;
			} else {
				first = mid + 1;
			}
		}
		System.out.println(" element not found");
		return;

	}

	/****************************************************************************
	 * function to sort the string using Insertion sort algorithm
	 * 
	 * @param
	 * @param array
	 * @return
	 ****************************************************************************/

	public static void insertionSortInt(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int j = i - 1;
			int key = array[i];
			while (j > 0 && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}
	}

	/*************************************************************
	 * function to sort the string elements using bubble sort
	 * 
	 * @param array
	 * 
	 *************************************************************/
	public static <T extends Comparable<T>> void bubbleSortString(T[] array) {
		for (int i = 0; i < array.length - 1; i++) {

			for (int j = 0; j < array.length - 1 - i; j++) {

				if (array[j].compareTo(array[j + 1]) > 0) {
					T temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

	}

	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {

			for (int j = 0; j < array.length - 1 - i; j++) {

				if (array[j] > (array[j + 1])) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	/****************************************************************************
	 * function to sort the string using binary search algorithm
	 * 
	 * @param BinaryTree
	 * @param CalenderWeekObject
	 * @return
	 ****************************************************************************/
	public static int binarysearchstring(String[] array, String search) {
		int first = 0;
		int last = array.length - 1;

		while (first <= last) {
			int mid = (first + last) / 2;
			if (array[mid].equals(search)) {
				return mid;

			} else if (array[mid].compareTo(search) > 0) {
				last = mid - 1;
			} else {
				first = mid + 1;

			}
		}

		return -1;
	}

	/****************************************************************************
	 * function to sort the string using merge sort algorithm
	 * 
	 * @param
	 * @param array
	 * @return
	 ****************************************************************************/
	public static void mergeSort(String[] array) {
		if (array.length >= 2) {
			String[] left = new String[array.length / 2];
			String[] right = new String[array.length - array.length / 2];

			for (int i = 0; i < left.length; i++) {
				left[i] = array[i];
			}

			for (int i = 0; i < right.length; i++) {
				right[i] = array[i + array.length / 2];
			}

			mergeSort(left);
			mergeSort(right);
			merge(array, left, right);
		}
	}

	public static void merge(String[] array, String[] left, String[] right) {
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < left.length && j < right.length) {
			if (left[i].compareTo(right[j]) < 0) {
				array[k] = left[i];
				i++;
				k++;
			} else {
				array[k] = right[j];
				j++;
				k++;
			}
		}
		while (i < left.length) {
			array[k] = left[i];
			k++;
			i++;
		}
		while (j < right.length) {
			array[k] = right[j];
			k++;
			j++;
		}
	}

	/****************************************************************************
	 * function to give monthly payment using formula....
	 * 
	 * @param
	 * @param array
	 * @return
	 ****************************************************************************/
	public static void monthlyPayment(int p, int y, int r) {
		double payment = 0.0;
		int n = 12 * y;

		double r1 = r / 1200;
		payment = (p * r1) / (1 - Math.pow((1 + r1), -n));
		System.out.println("monthly payment is :" + payment);
	}

	/****************************************************************************
	 * function to give monthly payment using formula....
	 * 
	 * @param amount
	 * @param notes
	 * @return
	 ****************************************************************************/

	public static int calculate(int amt, int[] note) {
		int totalnotes = 0;
		if (amt == 0)
			return -1;

		for (int i = 0; i < note.length; i++) {
			if (amt >= note[i]) {
				int num = amt / note[i];
				amt %= note[i];
				totalnotes += num;
				System.out.println(note[i] + "notes are" + num);
			}
		}
		System.out.println("total notes are:" + totalnotes);
		return Utility.calculate(amt, note);

	}

	/****************************************************************************
	 * function to conver decimal to binary....
	 * 
	 * @param amount
	 * @param notes
	 * @return
	 ****************************************************************************/
	public static String binaryconversion(int decimalnum) {
		String s1 = " ";
		while (decimalnum != 0) {
			int rem = decimalnum % 2;
			s1 = rem + s1;
			decimalnum = decimalnum / 2;
		}

		while (s1.length() <= 8) {

			s1 = "0" + s1;
		}
		return s1;
	}

	/***********************************************************
	 * function to add white spaces to the string output and returns the string
	 * 
	 * @param str1
	 * @return
	 ************************************************************/
	public static String nibbleof(String s1) {
		String str1 = s1.substring(0, s1.length() / 2);
		System.out.println(str1);
		String str2 = s1.substring(s1.length() / 2);
		System.out.println(str2);
		return str1 + " " + str2;
	}

	/***********************************************************
	 * function to add white spaces to the string output and returns the string
	 * 
	 * @param s3
	 * @return string
	 ************************************************************/
	public static int decimalconversion(String str) {
		int count = 0;
		int sum = 0;
		int decimalno = Integer.parseInt(str);
		while (decimalno != 0) {
			int rem = decimalno % 10;
			sum = (int) (sum + rem * Math.pow(2, count++));
			decimalno /= 10;
		}
		return sum;
	}

	/***********************************************************
	 * function to swap nibbles and returns the string
	 * 
	 * @param s4
	 * @return string
	 ************************************************************/
	public static String swap(String s4) {

		String s3 = "";
		String str1 = s4.substring(0, s4.length() / 2);
		System.out.println(str1);
		String str2 = s4.substring(s4.length() / 2);
		System.out.println(str2);
		s3 = str2 + str1;
		return (s3.replaceAll("\\s", ""));
	}

	/****************************************************************************
	 * function to find day of the week....
	 * 
	 * @param month
	 * @param day
	 * @return year
	 ****************************************************************************/
	public static String dayOfWeek(int month, int day, int year) {

		int y1 = year - (14 - month) / 12;
		int x = y1 + y1 / 4 - y1 / 100 + y1 / 400;
		int m1 = month + 12 * ((14 - month) / 12) - 2;
		int d1 = (day + x + 31 * m1 / 12) % 7;
		String res = " ";
		switch (d1) {
		case 1:
			res = res + "monday";
			break;
		case 2:
			res = res + "tuesday";
			break;
		case 3:
			res = res + "wednesday";
			break;
		case 4:
			res = res + "thursday";
			break;
		case 5:
			res = res + "friday";
			break;
		case 6:
			res = res + "saturday";
			break;
		case 7:
			res = res + "sunday";
			break;
		default:
			System.out.println("invalid day");

		}
		return res;
	}
	/****************************************************************************
	 * function to find valid date
	 * @param day,month,year
	 * @return boolean true or false
	 *
	 ****************************************************************************/

	public static boolean dateValidator(int day, int month, int year) {
        boolean b = false;
        if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
            b = false;
        } else if (month == 2) {
            if (year % 100 == 0) {
                if ((year % 400 != 0) && day > 28) {
                    b = false;
                } else if ((year % 400 == 0) && day > 29) {
                    b = false;
                } else
                    b = true;
            }
        }
        if (year % 100 != 0) {
            if ((year % 4 != 0) && day > 28) {
                b = true;
            } else if ((year % 4 == 0) && day > 29) {
                b = false;
            } else {
                b = true;
            }
        }
        if (day > 31) {
            b = false;
        } else {
            b = true;
        }
        return b;
    }
	
	 public static double dayOfWeek1(int day, int month, int year) {
         int y0 = year - (14 - month) / 12;
         int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
         int m0 = month + 12 * ((14 - month) / 12) - 2;
         int d0 = (day + x + 31 * m0 / 12) % 7;
         return d0;

     }
	/****************************************************************************
	 * function to find square root of a number using Newtons Method
	 * 
	 * @param number
	 * @return
	 *
	 ****************************************************************************/

	public static double squareroot(double c) {
		double x = 1e-15;
		double t = c;
		while (Math.abs(t - (c / t)) > (x * t)) {
			t = ((c / t) + t) / 2;
		}
		return t;
	}

	/****************************************************************************
	 * function to find the given year is leap year or not..
	 * 
	 * @param year
	 * @return boolean output true or false
	 *
	 ****************************************************************************/

	public static boolean isLeapyear(int year) {

		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
			return true;
		else
			return false;
	}

	/****************************************************************************
	 * function to find the poers of 2
	 * 
	 * @param num
	 *
	 ****************************************************************************/
	public static void power(int num) {
		int power = 1;
		for (int i = 1; i <= num; i++) {
			System.out.println(power *= 2);
		}
	}

	/****************************************************************************
	 * function to calculate the elapsed time between start and stop of the event...
	 * 
	 * @param starttime
	 * @return
	 ****************************************************************************/

	public static long getElapsedTime(long starttime) {

		long elapsetime = 0;
		elapsetime = ((System.currentTimeMillis() - starttime) / 1000);
		return elapsetime;
	}

	/****************************************************************************
	 * function to calculate the prime number is palindrome or not ...
	 * 
	 * @param number
	 ****************************************************************************/

	public static boolean ispalindrome(int i) {
		int a = i;
		int m = 0;
		while (i > 0) {
			m = m * 10 + i % 10;
			i = i / 10;
		}
		if (m == a) {
			return true;
		}
		return false;
	}

	/****************************************************************************
	 * function that takes an argument n,asks you to think of a number between 0 and
	 * 2^n questions
	 * 
	 * @param num
	 * @param first
	 * @param last
	 * @param mid
	 * @param input
	 * @param range
	 ****************************************************************************/
	public static void searchno(int num, int first, int last, int mid, String input, int range) {

		int count = 0;

		while (first <= last) {
			System.out.println("is your nu is " + mid);
			System.out.println("enter the input as high or low or yes");
			input = Utility.userInputString();

			if (input.equals("yes")) {
				System.out.println("your number is" + mid);
				return;
			} else if (input.equals("low")) {
				last = mid;
				count++;

			} else {
				first = mid;
				count++;
			}
			if (count < num) {
				mid = (first + last) / 2;
				System.out.println("is your nu is " + mid);
				System.out.println("enter the input as high or low or yes");
				input = Utility.userInputString();
			}
		}
		System.out.println("number not found");
		return;
	}

	/****************************************************************************
	 * function to check wether the arithmetic expression is balanced or not ...
	 * 
	 ****************************************************************************/
	public static <T extends Comparable<T>> void checkParenthesis() {

		MyStack<Character> stack = new MyStack<Character>();
		System.out.println("enter the expression ");
		String exp = Utility.userInputString();
		for (int i = 0; i < exp.length(); i++) {
			char ch = exp.charAt(i);

			if (ch == '(') {
				stack.push(ch);
			} else if (ch == ')') {
				try {
					stack.pop();
					System.out.println("'('  matched with ')' ");
				} catch (Exception e) {
					System.out.println("'(' is unmatched");
				}
			}
		}
		if (!stack.isEmpty()) {
			System.out.println(" un- balanced");
		}

		else {
			System.out.println(" balanced");
		}
	}

	/****************************************************************************
	 * function to calculate the bank balance ...
	 * 
	 ****************************************************************************/

	public static void checkbankbalance() {
		MyQueue<Integer> q = new MyQueue<Integer>();

		int initialamount = 1000;
		System.out.println("the number of peoples in queue");
		int people = Utility.userInputInteger();
		for (int i = 0; i < people; i++) {
			System.out.println("people " + i);
			q.enqueue(i);
		}
		int i = 0;
		while (people > i) {
			System.out.println("enter 1. for Deposit");
			System.out.println("enter 2. for Withdraw");

			System.out.println("enter your choice");
			int choice = Utility.userInputInteger();
			switch (choice) {
			case 1:
				System.out.println("enter the amount you want to deposit");
				initialamount += Utility.userInputInteger();

				System.out.println("balance is" + initialamount);
				q.dequeue();
				break;

			case 2:
				System.out.println("enter the withdraw amount");
				int withdraw = Utility.userInputInteger();
				if (withdraw < initialamount) {
					initialamount -= withdraw;
					q.dequeue();
					System.out.println(" balance is :" + initialamount);
				} else {
					System.out.println("There is no sufficient money in the bank!!!");
					q.dequeue();
					System.out.println("balance is :" + initialamount);
				}

				break;

			}
			i++;
		}

	}

	/****************************************************************************
	 * function to check prime numbers that are palindrome or not ...
	 * 
	 * @param String
	 *            str
	 * @return boolean true or false
	 ****************************************************************************/

	public static boolean checkPalindrome(String str) {
		Dqueue<Character> dq = new Dqueue<Character>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			dq.addRear(c);
		}

		while (dq.size() > 1) {
			if (dq.removeFront() == dq.removeRear()) {
				return true;
			}
		}

		return false;

	}

	/****************************************************************************
	 * function to the prime numbers that are anagram or not ...
	 * 
	 * @return prime numbers that are anagrams
	 ****************************************************************************/
	public static void isPrimeAnagram() {

		int count = 0;
		for (int i = 0; i < 1000; i++) {
			if (Utility.isPrime(i)) {
				count++;
			}
		}
		int array[] = new int[count];
		int k = 0;
		for (int i = 0; i < 1000; i++) {
			if (Utility.isPrime(i)) {
				array[k++] = i;

			}
		}
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (Utility.isanagram(array[i] + "", array[j] + "")) {
					System.out.println(array[i] + "," + array[j]);
				}
			}

		}

	}

	/****************************************************************************
	 * function to prime numbers in range from 1 to 1000 ...
	 * 
	 * @param number
	 * @return prime array
	 ****************************************************************************/
	public static int[] isprime1(int num) {

		int count = 0;
		for (int i = 0; i < num; i++) {
			if (Utility.isPrime(i)) {
				count++;
			}
		}
		int array[] = new int[count];
		int k = 0;
		for (int i = 0; i < num; i++) {
			if (Utility.isPrime(i)) {
				array[k++] = i;

			}
		}
		return array;

	}

	/****************************************************************************
	 * function Print prime numbers in 2 dimensional array...
	 * 
	 * @param number
	 * @return array of list
	 ****************************************************************************/
	public static LinkedList<LinkedList<Integer>> printprime(int num) {
		LinkedList<LinkedList<Integer>> list = new LinkedList<LinkedList<Integer>>();
		for (int i = 0; i < 10; i++) {
			LinkedList<Integer> array = new LinkedList<Integer>();
			for (int j = 0; j <= 100; j++) {
				int num1 = i * 100 + j;
				if (Utility.isPrime(num1)) {
					array.add1(num1);
				}
			}
			list.add1(array);
		}
		return list;
	}

	/****************************************************************************
	 * function to calculate the ...
	 * 
	 * @param number
	 * @return distinct coupens
	 ****************************************************************************/
	

	public static void patternreplace(String str) {
		final String regexname = "<<name>>";
		final String regexno = "<<fullname>>";
		final String phone = "xxxxxxxxxx";
		final String date = "xx/xx/xxxx";

		Pattern p = Pattern.compile(regexname);
		Matcher m = p.matcher(str);
		System.out.println("enter your name");
		str = m.replaceAll(Utility.userInputString());

		p = Pattern.compile(regexno);
		m = p.matcher(str);
		System.out.println("enter your full name");
		str = m.replaceAll(Utility.userInputString());

		p = Pattern.compile(phone);
		m = p.matcher(str);
		System.out.println("enter the phone number");
		str = m.replaceAll("-" + Utility.userInputString());

		p = Pattern.compile(date);
		m = p.matcher(str);
		System.out.println("enter current date");
		str = m.replaceAll(Utility.userInputString());

		String[] s = str.split(",");
		for (int i = 0; i < s.length; i++) {
			System.out.println((s[i]));
		}
	}

	public static LinkedList<String> printcards(String[] suits, String[] ranks) {
		LinkedList<String> list = new LinkedList<String>();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				list.add1(suits[i] + "-" + ranks[j]);
			}
		}
		return list;
	}

	public static void sufflecard(LinkedList<String> a) {
		LinkedList<String> array = new LinkedList<String>();
		Random random = new Random();
		while (a.size() != 0) {
			int index = random.nextInt(a.size());
			array.add1(a.deleteAtindex(index));
		}
		String[] s = new String[4];

		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 9; i++) {
				array.dispay();
			}
			System.out.println();
		}
	}
	public static String[][] intializecards(String[][] deck, String[] suits, String[] cards) {
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < cards.length; j++) {
				deck[i][j] = suits[i] + "-" + cards[j];
			}
		}
		return deck;
	}

	public static String[][] shuffle(String[][] deck, int suitsize, int cardsize) {
		for (int i = 0; i < suitsize; i++) {
			for (int j = 0; j < cardsize; j++) {
				Random random=new Random();
				int randomValue1 = random.nextInt(suitsize);
				int randomValue2 = random.nextInt(cardsize);
				String temp = deck[randomValue1][randomValue2];
				deck[randomValue1][randomValue2] = deck[i][j];
				deck[i][j] = temp;
			}
		}
		return deck;
	}
	public static void printcards(String[][] deck) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(deck[i][j]+" , ");
			}
			System.out.println();
		}
	}
}
