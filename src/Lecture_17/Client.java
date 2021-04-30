package Lecture_17;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   BST tree= new BST();
//   tree.add(50);
//   tree.add(25);
//   tree.add(75);
//   tree.add(12);
//   tree.add(37);
//   tree.add(10);  
//   tree.add(20);
//   tree.add(30);
//   tree.add(62);
//   tree.add(87);
//   tree.add(70);
//   tree.add(85);  
   //tree.display();
 //  System.out.println(tree.max());
   //System.out.println(tree.min());
   //tree.remove(25);
   //tree.display();
   int []sortedArray={1,12,20,25,30,37,50,60,70,75,85,100};
   BST tree1=new BST(sortedArray);
   tree1.display();
	}

}
