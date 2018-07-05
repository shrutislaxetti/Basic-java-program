package com.bridgelabz.datastructures;

public class MyQueue<T extends Comparable<T>>{
	private MyLinkedList<T> list;
	
	public MyQueue() {
		list = new MyLinkedList<>();
	}
	
	public void enqueue(T element) {
		list.add(element);
	}
	public T dequeue() {
		return list.deleteAtindex(list.size() - 1);
	}
	public boolean isEmpty() {
		return list.size() == -1;
	}
	public int size() {
		return list.size();
	}

	public void display() {
		list.dispay();
	}
}
