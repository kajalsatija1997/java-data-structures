package Lecture_16;

import java.util.LinkedList;
import java.util.Scanner;

public class Binary_tree {
	private class Node {
		int data;
		Node left;
		Node right;

		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	private Node root;
	private int size = 0;

	public int size() {
		return this.size;
	}

	Binary_tree() {
		Scanner s = new Scanner(System.in);
		this.root = takeInput(s, null, false);
	}

	private Node takeInput(Scanner s, Node parent, boolean isleftorright) {
		if (parent == null) {
			System.out.println("Enter data for the root node");
		} else {
			if (isleftorright) {
				System.out.println("Enter data for the left child of " + parent.data);
			} else {
				System.out.println("Enter data for the right child of " + parent.data);

			}
		}

		int nodeData = s.nextInt();
		Node node = new Node(nodeData, null, null);
		this.size++;

		boolean choice = false;
		System.out.println("Do you have left child for " + node.data);
		choice = s.nextBoolean();
		if (choice) {
			node.left = takeInput(s, node, true);
		}

		System.out.println("Do you have right child for " + node.data);
		choice = s.nextBoolean();
		if (choice) {
			node.right = takeInput(s, node, false);
		}

		return node;

	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		if (node.left != null) {
			System.out.print(node.left.data + "=>");
		} else {
			System.out.print("END=>");
		}
		System.out.print(node.data);
		if (node.right != null) {
			System.out.print("<=" + node.right.data);
		} else {
			System.out.print("<=END");
		}

		System.out.println();
		if (node.left != null) {
			this.display(node.left);
		}
		if (node.right != null) {
			this.display(node.right);
		}
	}

	public int size2() {
		return this.size2(this.root);
	}

	private int size2(Node node) {
		if (node == null) {
			return 0;
		}
		int rv = 0;
		int lsize = this.size2(node.left);
		int rsize = this.size2(node.right);
		rv = lsize + rsize + 1;

		return rv;
	}

	public int max() {
		return this.max(this.root);
	}

	private int max(Node node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int rv = node.data;
		int lmax = this.max(node.left);
		int rmax = this.max(node.right);

		rv = Math.max(rv, Math.max(lmax, rmax));

		return rv;
	}

	public int height() {
		return this.height(this.root);
	}

	private int height(Node node) {
		if (node == null) {
			return -1;
		}
		int lh = this.height(node.left);
		int rh = this.height(node.right);

		int h = Math.max(lh, rh);

		return h + 1;

	}

	public boolean find(int data) {
		return this.find(this.root, data);
	}

	private boolean find(Node node, int data) {
		if (node == null) {
			return false;
		}
		if (node.data == data) {
			return true;
		} else if (this.find(node.left, data)) {
			return true;
		} else if (this.find(node.right, data)) {
			return true;
		} else {
			return false;
		}
	}

	public void preOrder() {
		this.preOrder(this.root);
	}

	private void preOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.println(node.data);
		this.preOrder(node.left);
		this.preOrder(node.right);
	}

	public void postOrder() {
		this.postOrder(this.root);
	}

	private void postOrder(Node node) {
		if (node == null) {
			return;
		}

		this.postOrder(node.left);
		this.postOrder(node.right);
		System.out.println(node.data);
	}

	public void inOrder() {
		this.inOrder(this.root);
	}

	private void inOrder(Node node) {
		if (node == null) {
			return;
		}

		this.inOrder(node.left);
		System.out.println(node.data);
		this.inOrder(node.right);

	}

	public void preOrderIterative() {
		LinkedList<Node> stack = new LinkedList<>();
		stack.addFirst(this.root);
		while (!stack.isEmpty()) {
			Node node = stack.removeFirst();
			System.out.print(node.data + " ");

			if (node.right != null) {
				stack.addFirst(node.right);
			}

			if (node.left != null) {
				stack.addFirst(node.left);
			}
		}

		System.out.println("END");
	}

	public int lca(int d1, int d2) {
		return this.lca(d1, d2, this.root).data;
	}

	private Node lca(int d1, int d2, Node node) {
		if (node == null) {
			return null;
		}
		if (node.data == d1 || node.data == d2) {
			return node;
		}
		Node llca = this.lca(d1, d2, node.left);
		Node rlca = this.lca(d1, d2, node.right);
		if (llca != null && rlca != null) {
			return node;
		} else if (llca != null) {
			return llca;
		} else if (rlca != null) {
			return rlca;
		} else {
			return null;
		}

	}

	public boolean isBST() {
		return isBST(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean isBST(Node node, int min, int max) {
		if (node == null) {
			return true;
		}
		if (node.data < min || node.data > max) {
			return false;
		}
		if (!isBST(node.left, min, node.data)) {
			return false;
		}
		if (!isBST(node.right, node.data, max)) {
			return false;
		}

		return true;

	}

}
