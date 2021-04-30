package Lecture_16;


public class ClientBT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 18 true 64 true 91 false false true 34 false false true 39 true 11 false false false
		Binary_tree tree = new Binary_tree();
		tree.display();
		System.out.println(tree.size2());
		System.out.println(tree.max());
		System.out.println(tree.height());
		
		System.out.println(tree.find(39));
		tree.preOrderIterative();
		System.out.println(tree.lca(91, 64));
		
		System.out.println(tree.isBST());
	}
	

}
