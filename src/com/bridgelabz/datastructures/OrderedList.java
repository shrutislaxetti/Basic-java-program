
package com.bridgelabz.datastructures;

import com.bridgelabz.datastructures.MyLinkedList;
import java.io.*;
import com.bridgelabz.utility.Utility;

public class OrderedList<T>{
	public static  void main(String[] args) {
		
			File file = new File("/home/bridgrlabz/file1");
			FileReader fr = null;
			MyLinkedList<Integer> list1 = new MyLinkedList<Integer>();
			BufferedReader fw = null;
			try {
				fr = new FileReader(file);
				fw = new BufferedReader(fr);
				String searchword = fw.readLine();
				System.out.println(searchword);
				while (searchword != null) {
				String[] str = searchword.split(",");
				int []array=new int[str.length];
				for (int i = 0; i < str.length; i++) {
					array[i]=Integer.parseInt(str[i]);
					
				}
				Utility.bubbleSort(array);
				for (int i = 0; i < str.length; i++) {
					list1.addSorted(array[i]);
				}
				
				list1.dispay();
				
				System.out.println("enter the elements you want to search");
				Integer ele = Utility.userInputInteger();
				if(!list1.search( ele)) {
					list1.addSorted(ele);
					list1.dispay();
				}
				
				/*else 
				{
					list1.deleteNode(ele);
					list1.dispay();
				}*/
				
				PrintWriter fw1 = new PrintWriter("/home/bridgrlabz/file1");
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

