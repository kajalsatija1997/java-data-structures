package Lecture_13;

public class Linked_list {
	private class Node {
		int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public Linked_list() {
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

	public void addFirst(int data) {
		Node node = new Node(data, this.head);
		this.head = node;
		if (this.isEmpty()) {
			this.tail = node;
		}
		this.size++;
	}

	public void addLast(int data) {
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

	public void addAt(int data, int index) throws Exception {
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

	public int getFirst() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Linked list is empty");

		}
		return this.head.data;
	}

	public int getLast() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Linked list is empty");

		}
		return this.tail.data;
	}

	public int getAt(int index) throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Linked list is empty");

		}
		if (index < 0 || index >= this.size) {
			throw new Exception();
		}
		return this.getNodeAt(index).data;
	}

	public void removeFirst() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("No node to remove");
		}
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
		} else {
			this.head = this.head.next;
		}
		this.size--;
	}

	public void removeLast() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("No node to remove..");
		}
		if (this.size == 1) {
			this.head = null;
			this.tail = null;
		} else {
			Node temp = getNodeAt(this.size - 2);
			tail = temp;
			tail.next = null;
		}
		this.size--;
	}

	public void removeNodeAt(int index) throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is Empty");
		}
		if (index < 0 || index >= this.size) {
			throw new Exception("Invalid index");
		}
		if (index == 0) {
			removeFirst();
		}
		if (index == this.size - 1) {
			removeLast();
		} else {
			Node temp = this.getNodeAt(index - 1);
			temp.next = (temp.next).next;
			this.size--;
		}
	}

	public void reverseDI() throws Exception {
		int left = 0;
		int right = this.size - 1;
		while (left <= right) {
			int temp = this.getNodeAt(left).data;
			this.getNodeAt(left).data = this.getNodeAt(right).data;
			this.getNodeAt(right).data = temp;
			left++;
			right--;
		}
	}

	public void reversePI() throws Exception {
		Node prev = this.head;
		Node curr = this.head.next;

		while (curr != null) {
			Node tempPrev = prev;
			Node tempcurr = curr;
			prev = curr;
			curr = curr.next;
			tempcurr.next = tempPrev;
		}
		
		Node t=this.head;
		this.head=this.tail;
		this.tail=t;
		this.tail.next=null;

	}
	public void reversePR() throws Exception
	{
         reversePR(this.head);
         Node t=this.head;
 		this.head=this.tail;
 		this.tail=t;
 		this.tail.next=null;
         
	}
	public void reversePR(Node node) throws Exception
	{
		if (node == this.tail) {
			return;
		}
		reversePR(node.next);
		node.next.next = node;
	}
	public void reverseDR() {
		HeapMover hm = new HeapMover(this.head);
		reverseDR(hm, this.head, 0);
	}

	private void reverseDR(HeapMover hm, Node right, int level) {
		if (right == null) {
			return;
		}
		reverseDR(hm, right.next, level + 1);
		if (level >= this.size() / 2) {
			int temp = hm.node.data;
			hm.node.data = right.data;
			right.data = temp;

			hm.node = hm.node.next;
		}
	}

	private class HeapMover {
		Node node;

		HeapMover(Node node) {
			this.node = node;
		}
	}
	public int middle() {
		return getMidNode().data;
	}

	private Node getMidNode() {
		Node slow = this.head, fast = this.head;
		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		return slow;
	}
	public int KthFromEnd(int index)throws Exception
	{
		if(index<1||index>this.size)
		{
		throw new Exception("Invalid Index");	
		}
		Node fp= this.head;
		Node sp=this.head;
		for(int i=0;i<index;i++)
		{
			fp=fp.next;
		}
		while(fp!=null)
		{
			fp=fp.next;
			sp=sp.next;
		}
		return sp.data;
	}
	public Linked_list merge(Linked_list other)
	{
		Linked_list rv = new Linked_list();
		Node thistemp = this.head, othertemp = other.head;
		while (thistemp != null && othertemp != null) {
			if (thistemp.data < othertemp.data) {
				rv.addLast(thistemp.data);
				thistemp = thistemp.next;
			} else {
				rv.addLast(othertemp.data);
				othertemp = othertemp.next;
			}
		}

		while (thistemp != null) {
			rv.addLast(thistemp.data);
			thistemp = thistemp.next;
		}

		while (othertemp != null) {
			rv.addLast(othertemp.data);
			othertemp = othertemp.next;
		}

		return rv;
	}

	public void mergeSort()
	{
		Linked_list sorted = MergeSortHelper(this.head, this.tail);
	    this.head=sorted.head;
	    this.tail=sorted.tail;
	    this.size=sorted.size;
	}
	private Linked_list MergeSortHelper(Node low,Node high)
	{
		if (this.size() == 1) {
			return this;
		}
		Node mid = getMidNode();
		Node midNext = mid.next;
		mid.next = null;

		Linked_list list1 = new Linked_list(low, mid, (this.size() + 1) / 2);
		Linked_list list2 = new Linked_list(midNext, high, (this.size()) / 2);

		list1.mergeSort();
		list2.mergeSort();

		return list1.merge(list2);
	
	}
	Linked_list(Node head, Node tail, int size) {
		this.head = head;
		this.tail = tail;
		this.size = size;
	}
	}
