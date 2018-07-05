package com.bridgelabz.datastructures;

import com.bridgelabz.utility.Utility;

class BinaryTree {
public static void main(String[] args) {
    System.out.println("enter node");
    int node = Utility.userInputInteger();
    System.out.println("no of binary trees possible are:");
    int trees = (int) Math.pow(2, node) - node;
    System.out.println(trees);
}
}