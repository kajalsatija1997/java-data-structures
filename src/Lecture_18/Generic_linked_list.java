package Lecture_18;

public class Generic_linked_list<T> {
	private class Node {
		T data;
		Node next;

		Node(T data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public Generic_linked_list() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public int size() {

		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public void addFirst(T data) {
		Node node = new Node(data, this.head);
		this.head = node;
		if (this.isEmpty()) {
			this.tail = node;
		}
		this.size++;
	}

	public void addLast(T data) {
		Node node = new Node(data, null);
		if (this.isEmpty()) {
			this.head = node;
			this.tail = node;
		} else {
			this.tail.next = node;
			this.tail = node;
		}
		this.size++;
	}

	private Node getNodeAt(int index) throws Exception {
		if (index < 0 || index > this.size) {
			throw new Exception("");
		}
		int counter = 0;
		Node temp = this.head;
		while (counter < index) {
			temp = temp.next;
			counter++;
		}
		return temp;
	}

	public void addAt(T data, int index) throws Exception {
		if (index < 0 || index > this.size) {
			throw new Exception("");
		}
		if (index == 0) {
			this.addFirst(data);
		} else if (index == this.size) {
			this.addLast(data);
		} else {
			Node temp = this.getNodeAt(index - 1);
			Node node = new Node(data, temp.next);
			temp.next = node;
			this.size++;

		}
	}

	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println("End");
	}

	public T getFirst() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Linked list is empty");

		}
		return this.head.data;
	}

	public T getLast() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Linked list is empty");

		}
		return this.tail.data;
	}

	public T getAt(int index) throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Linked list is empty");

		}
		if (index < 0 || index >= this.size) {
			throw new Exception();
		}
		return this.getNodeAt(index).data;
	}

	public T removeFirst() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("No node to remove");
		}
		Node rv=this.head;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
		} else {
			this.head = this.head.next;
		}
		this.size--;
		return rv.data;
	}

	public T removeLast() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("No node to remove..");
		}
		Node rv=this.tail;
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
		} else {
			Node temp = getNodeAt(this.size - 2);
			tail = temp;
			tail.next = null;
		}
		this.size--;
		return rv.data;
	}

	public T removeNodeAt(int index) throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is Empty");
		}
		if (index < 0 || index >= this.size) {
			throw new Exception("Invalid index");
		}
		if (index == 0) {
			return this.removeFirst();
		}
		if (index == this.size - 1) {
			return this.removeLast();
		} else {
			Node rv=this.getNodeAt(index);
			Node temp = this.getNodeAt(index - 1);
			temp.next = (temp.next).next;
			this.size--;
			return rv.data;
		}
	}
	public int find(T data)
	{
		int idx=0;
		for(Node temp=this.head;temp!=null;temp=temp.next)
		{
			if(temp.data.equals(data))
			{
				return idx;
			}
			else
			{
				idx++;
			}
		}
		return -1;
	}
}
