package com.bridgelabz.objectorientedprograms;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.bridgelabz.utility.Utility;

public class Regex {
public static void main(String[] args) {
	String str="Hello <<name>>, We have your full name as <<fullname>> in oursystem, your contact number is 91­xxxxxxxxxx,  Thank   you   BridgeLabz ";
	Utility.patternreplace(str);
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	LocalDateTime now = LocalDateTime.now();  
    System.out.println(" "+dtf.format(now));  
}
}