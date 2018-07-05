/******************************************************************************
 * Purpose: Stack implemented using linked list.
 * @author  BridgeLabz
 * @version 1.0
 * @since   29-05-2018
 ******************************************************************************/

package com.bridgelabz.utility;

public class MyStack<T> {

	private MyLinkedList<T> list;

	public MyStack() {
		list = new MyLinkedList<>();
	}

	public void push(T element) {
		list.addFirst(element);
	}

	public T pop() {
		return list.removeAt(0);
	}

	public boolean isEmpty() {
		return list.size() == -1;
	}

	public int size() {
		return list.size();
	}

	public void display() {
		if (size() == 0) {
			System.out.println("empty");
			return;
		}
	}
}