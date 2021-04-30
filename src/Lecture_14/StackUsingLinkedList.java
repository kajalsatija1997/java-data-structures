package Lecture_14;

import Lecture_13.Linked_list;

public class StackUsingLinkedList {
	
	private Linked_list list;

	public StackUsingLinkedList() {
		// TODO Auto-generated constructor stub
		list = new Linked_list();
	}

	public int size() {
		return this.list.size();
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void push(int item) {
		this.list.addFirst(item);
	}

	public int pop() throws Exception {
		int rv = this.list.getFirst();
		this.list.removeFirst();
		return rv;
	}

	public int top() throws Exception {
		int rv = this.list.getFirst();
		return rv;
	}

	public void display() {
		this.list.display();
	}
}
