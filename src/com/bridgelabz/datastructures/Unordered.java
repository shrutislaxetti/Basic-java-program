package com.bridgelabz.datastructures;
import com.bridgelabz.datastructures.MyLinkedList;
import java.io.*;
import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class Unordered<T> {
	public static  void main(String[] args) {
		File file = new File("/home/bridgrlabz/file");
		FileReader fr = null;
		MyLinkedList<String> list1 = new MyLinkedList<String>();
		BufferedReader fw = null;
		try {
			fr = new FileReader(file);
			fw = new BufferedReader(fr);
			String searchword = fw.readLine();
			System.out.println(searchword);
			while (searchword != null) {
				String[] str = searchword.split(",");
				for (int i = 0; i < str.length; i++) {
					list1.add(str[i]);
				}
				
				list1.dispay();
				
				System.out.println("enter the elements to be added to the list");
				String ele = Utility.userInputString();
				if(!list1.search( ele)) {
					list1.add(ele);
					list1.dispay();
				}
				
				else 
				{
					list1.deleteNode(ele);
					list1.dispay();
				}
				
				PrintWriter fw1 = new PrintWriter("/home/bridgrlabz/file");
				for (int i = 0; i < list1.size(); i++) {
					fw1.print(list1.getvalue(i)+",");
				}
				fw1.close();
				
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		
		}

	}


		
	

