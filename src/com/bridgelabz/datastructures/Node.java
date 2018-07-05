package com.bridgelabz.datastructures;

public class Node<T> {
	T ele;
	Node<T> next;
	Node<T> previous;
	public Node(T ele) {
		this.ele = ele;
	}

	public T getValue() {
		return ele;
	}
	
}
