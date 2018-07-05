package com.bridgelabz.datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import com.bridgelabz.utility.Utility;

public class Hash {

	public static void main(String[] args) {
		System.out.println("enter the size");
		File file = new File("/home/bridgrlabz/file1");
		FileReader fr = null;
		HashTable<Integer> hs = new HashTable<Integer>(Utility.userInputInteger());
		BufferedReader fw = null;
		try {
			fr = new FileReader(file);
			fw = new BufferedReader(fr);
			String searchword = fw.readLine();
			System.out.println(searchword);
			String[] str = searchword.split(",");
			int[] array = new int[str.length];
			for (int i = 0; i < str.length; i++) {
				array[i] = Integer.parseInt(str[i]);

			}
			Utility.bubbleSort(array);
			for (int i = 0; i < str.length; i++) {
				hs.insert(array[i]);
			}

			hs.printHashTable();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
