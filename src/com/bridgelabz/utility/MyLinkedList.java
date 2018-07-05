package com.bridgelabz.utility;

public class MyLinkedList<T> {
		private Node<T> first;
		private Node<T> last;
		private int count = 0;
	
		public void add(T ele) {
			if (first == null) {
				first = new Node<T>(ele);
				last = first;
				count++;
				return;
			}
			last.next = new Node<T>(ele);
			last = last.next;
			count++;
		
		}
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
	   
		public boolean isEmpty()
	    {
	        return count==0;
	    }
		
		public T getDataAtIndex(int index) {
			int currentPosition = 0;
			Node<T> temp = first;
			if (first == null)
				return null;
			if (temp.next == null)
				return temp.ele;
			else {
				while (temp.next != null && currentPosition != index) {
					temp = temp.next;
					currentPosition++;
				}
				return temp.ele;
			}
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
		        while(!s.equals(last)) {
		            t=s;
		            s=s.next;
		        }
		        last=t;
		        last.next=null;
		        count--;
		        return ele;
		}
		 public void addFirst(T ele) {
				Node<T> temp = new Node<T>(ele);
				temp.next = first;
				first = temp;
				count++;
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
		 public T removeAt(int index) {
				if (index == 0) {
					T temp = first.ele;
					first = first.next;
					count--;
					return temp;
				}
				Node<T> t = first;
				int count = 0;
				while (count < index - 1) {
					t = t.next;
					count++;
				}
				T temp = t.next.ele;
				t.next = t.next.next;
				count--;
				return temp;
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
