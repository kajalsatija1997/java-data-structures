package Lecture_14;

public class StackUsingLLClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackUsingLinkedList list = new StackUsingLinkedList ();
		list.push(10);
		list.push(20);
		list.push(30);
		list.push(40);
		list.push(50);
		
		list.display();
		list.pop();
		list.display();
	}



}
