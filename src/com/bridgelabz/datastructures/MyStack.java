package com.bridgelabz.datastructures;

public class MyStack<T extends Comparable<T>> {

	private MyLinkedList<T> list;

	public MyStack() {
		list = new MyLinkedList<>();
	}

	public void push(T element) {
		list.add(element);
	}

	public T pop() {
		return list.deleteAtindex(list.size() - 1);
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