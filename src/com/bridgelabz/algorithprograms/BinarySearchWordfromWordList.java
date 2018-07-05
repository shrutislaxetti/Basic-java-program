/******************************************************************************
 * Purpose: Binary search algorithm using file reader and buffer writer..
 *
 * @author  BridgeLabz
 *  
 * @version 1.0
 * @since   22-05-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithprograms;

import com.bridgelabz.utility.Utility;
import java.io.*;
import java.util.*;

public class BinarySearchWordfromWordList {

 public static void main(String[] args) {
	
	File file=new File("/home/bridgrlabz/file");
	FileReader fr=null;
    int count=0;
    ArrayList<String> a=new ArrayList<String>();
    BufferedReader fw=null;
    try {
        fr=new FileReader(file);
        fw=new  BufferedReader(fr);
        String searchword=fw.readLine();
        System.out.println(searchword);
        while(searchword!=null)
        {
          String[] str=searchword.split(",");
           
          for(int i=0;i<str.length;i++)
            {
        	  
                a.add(str[i]);
                count++;
            }
          searchword=null ;
         }
       }
     catch (Exception e)
       {
        e.printStackTrace();
       }
    String[] array =new String[count];
    for(int i=0; i<a.size();i++) 
      {
        array[i]=a.get(i);
      }
    Arrays.sort(array);
    for(int i=0;i<array.length;i++) {
    System.out.println(array[i]);
    }
    System.out.println("Enter the search  string :");
    String search=Utility.userInputString();
    int result=Utility.binarysearchstring(array,search);
    if(result==-1)
	{
		System.out.println(" search string not found");
	}
	else 
	{
		System.out.println(" search string found at index :"+result);
	}
   
	}
}
