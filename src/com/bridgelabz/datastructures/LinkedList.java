package com.bridgelabz.datastructures;

public class LinkedList<T> {
		private Node<T> first;
		private Node<T> last;
		private int count = 0;

		public void add1(T num) {
			if (first == null) {
				first = new Node<T>(num);
				last = first;
				count++;
				return;
			}
			last.next = new Node<T>(num);
			last = last.next;
			count++;
		}

		public void addRear(T ele) {
			Node<T> node = new Node<T>(ele);
			if (last == null) {
				last = node;
				first = last;
				count++;
				return;
			}
			last.next = node;
			last = node;
			count++;

		}

		public void add(int pos, T ele) {

			if (pos == 0) {
				Node<T> node = new Node<T>(ele);
				node.next = first;
				first = node;
				count++;
				return;
			}

			Node<T> temp = first;
			for (int i = 1; i < pos; i++) {
				temp = temp.next;
			}
			Node<T> node = new Node<T>(ele);
			node.next = temp.next;
			temp.next = node;
			count++;

		}

		public int size() {
			return count;
		}

		/**
		 * Remove the elment based on type of element
		 * 
		 * @param Object
		 *            key
		 */
		public void deleteNode(T key) {
			Node<T> temp = first;
			Node<T> prev = null;
			if (temp != null && temp.ele.equals(key)) {
				first = temp.next; // Changed head
				count--;
				return;
			}
			while (temp != null && temp.ele != key) {
				prev = temp;
				temp = temp.next;
				count--;
			}
			if (temp == null)
				return;
			prev.next = temp.next;
		}

		
		public T removeFront() {
			T ele=null;
			if(first!=null) {
				ele=first.ele;
				first=first.next;
				count--;
			}
			return ele;
		}
		
		 public T removeRear() {
			 if(last==null) {
		            System.out.println("Empty queue!!");
		            }
		        T ele=last.ele;
		        Node<T> s=first;
		        Node<T> t=first;
		        while(s!=last) {
		            t=s;
		            s=s.next;
		        }
		        last=t;
		        last.next=null;
		        count--;
		        return ele;
		}
		
		public T deleteAtindex(int index) {
			if (index == 0) {
				T a = first.ele;
				first = first.next;
				count--;
				return a;
			}
			Node<T> temp = first;
			int k = 0;
			while (k < index - 1) {
				temp = temp.next;
				k++;
			}
			T a = temp.ele;
			temp.next = temp.next.next;
			count--;
			return a;

		}
		
		/**
		 * Recursively traverse this list and print the node value
		 */
		public void dispay() {
			Node<T> temp = first;
			while (temp != null) {

				System.out.println(temp.ele);
				temp = temp.next;
			}
		}

		public T getvalue(int index) {
			Node<T> temp = first;
			int count = 0;
			while (temp != null) {
				if (count == index) {
					return temp.ele;
				}
				count++;
				temp = temp.next;
			}
			return null;
		}

		public boolean search(T value) {
			Node<T> temp = first;
			while (temp != null) {
				if (temp.ele.equals(value))
					return true;
				temp = temp.next;
			}

			return false;
		}
		
}
