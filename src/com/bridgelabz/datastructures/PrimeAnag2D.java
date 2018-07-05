package com.bridgelabz.datastructures;

import com.bridgelabz.utility.Utility;

public class PrimeAnag2D {
public static void main(String[] args) {
	  LinkedList[][] array = new LinkedList[10][];
      for (int i = 0; i < 10; i++) {
          array[i] = new LinkedList[100];
          for (int j = 0; j < 100; j++) {
              array[i][j] = new LinkedList();
          }
      }
      for (int i = 0; i < 10; i++) {
          int k = 0;
          for (int j = 100 * i; j < 100 * (i + 1); j++) {
              if (Utility.isPrime(j)) {
                  for (int m = j + 1; m < 100 * (i + 1); m++) {
                      if (Utility.isanagram(("" + j), ("" + m)) == true) {
                          array[i][k++].add1(j);
                          System.out.println("[" + j + "," + m + "]");

                      }
                  }
              }
          }

          System.out.println();
      }
  }
}



