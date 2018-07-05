package com.bridgelabz.datastructures;

public class Dqueue<T extends Comparable<T>> {
	private MyLinkedList<T> list;
	public Dqueue() {
		list = new MyLinkedList<T>();
	}
   public void addFront(T ele) {
	   list.add(ele);
   }
   public void addRear(T ele) {
	   list.addRear(ele);
   }
   public T removeFront() {
	return list.removeFront();
	   
   }
   public T removeRear() {
		 return list.removeRear();
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
