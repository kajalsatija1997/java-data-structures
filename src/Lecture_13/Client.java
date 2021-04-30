package Lecture_13;
//import Lecture_13.Linked_list;
public class Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Linked_list list = new Linked_list();
		list.addFirst(50);
		// list.addAt(20, 1);
		list.addLast(40);
		list.addLast(30);
		list.addLast(20);
		list.addLast(10);
		// list.addLast(60);
		// list.addLast(70);

		// list.addAt(25, 2);
		// list.display();
		//
		// System.out.println(list.getFirst());
		// System.out.println(list.getLast());
		// System.out.println(list.getAt(2));
		//
		// list.removeFirst();
		// list.display();
		//
		// list.removeLast();
		// list.display();
		//
		// list.removeAt(2);
		// list.display();

		// list.removeAt(0);
		// list.display();
		//
		// list.removeAt(3);
		// list.display();

		// list.reverseDR();
		// list.display();
		//
		// System.out.println(list.mid());
		//
		// System.out.println(list.KthFromEnd(4));

//		LinkedList other = new LinkedList();
//		other.addLast(25);
//		other.addLast(35);
//		other.addLast(45);
//
//		list.merge(other).display();
		//list.display();
		
		list.mergeSort();
		list.display();
	}

}
