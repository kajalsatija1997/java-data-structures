package Lecture_15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Lecture_13.Linked_list;

public class GenericTree {
	private class Node {
		int data;
		ArrayList<Node> children; // Arraylist used coz of O(1) than O(n)

		Node(int data) {
			this.data = data;
			children = new ArrayList<>();
		}
	}

	Node root;
	int size = 0;

	GenericTree() {
		Scanner s = new Scanner(System.in);
		this.root = takeInput(s, null, 0);

	}

	private Node takeInput(Scanner s, Node parent, int ithchild) {
		if (parent == null) {
			System.out.println("Enter data for root node: ");
		} else {
			System.out.println("Enter data for " + ithchild + " th child of " + parent.data);
		}
		int nodeData = s.nextInt();
		Node node = new Node(nodeData);
		this.size++;
		System.out.println("Enter no. of children for " + node.data);
		int numChild = s.nextInt();
		for (int i = 0; i < numChild; i++) {
			Node child = this.takeInput(s, node, i);
			node.children.add(child);
		}
		return node;
	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		System.out.print(node.data + " =>");
		for (int i = 0; i < node.children.size(); i++) {
			System.out.print(node.children.get(i).data + " ,");
		}
		System.out.println("END");
		for (int i = 0; i < node.children.size(); i++) {
			this.display(node.children.get(i));
		}
	}

	public int size2() {
		return this.size2(this.root);
	}

	private int size2(Node node) {
		int rv = 0;
		for (int i = 0; i < node.children.size(); i++) {
			int childSize = this.size2(node.children.get(i));
			rv = rv + childSize;
			// System.out.println(rv);
		}
		rv = rv + 1;
		return rv;
	}

	public int max() {
		return max(root);
	}

	private int max(Node node) {
		int maxchild = node.data;
		for (int i = 0; i < node.children.size(); i++) {
			int maxinchild = this.max(node.children.get(i));
			if (maxinchild > maxchild) {
				maxchild = maxinchild;
			}

		}
		return maxchild;
	}

	public int height() {
		return height(root);
	}

	private int height(Node node) {
		int height = -1;
		for (int i = 0; i < node.children.size(); i++) {
			int heightofChild = this.height(node.children.get(i));
			if (heightofChild > height) {
				height = heightofChild;
			}

		}
		height = height + 1;
		return height;
	}

	public boolean find(int data) {
		return this.find(data, this.root);
	}

	private boolean find(int data, Node node) {
		if (node.data == data) {
			return true;
		}
		for (int i = 0; i < node.children.size(); i++) {
			// boolean isfound(node.children.get(i));
			if (data == node.children.get(i).data) {
				return true;
			}
		}
		return false;
	}

	public void mirror() {
		mirror(root);
	}

	private void mirror(Node node) {
		int left = 0, right = node.children.size() - 1;
		while (left <= right) {
			Node temp = node.children.get(left);
			node.children.set(left, node.children.get(right));
			node.children.set(right, temp);
			left++;
			right--;
		}
		for (int i = 0; i < node.children.size(); i++) {
			this.mirror(node.children.get(i));
		}
	}

	public void printAtlevel(int level) {
         this.printAtlevel(level,root);
	}
	private void printAtlevel(int level,Node node) //print nodes in all the levels of a tree
	{
		if(level==0)
		{
			System.out.println(node.data);
		}
		for(int i=0;i<node.children.size();i++)
		{
			this.printAtlevel(level-1,node.children.get(i));
		}
	}
	public void preOrder()
	{
		this.preOrder(this.root);
	}
	private void preOrder(Node node)
	{
		System.out.println(node.data);
		for(int i=0;i<node.children.size();i++)
		{
			this.preOrder(node.children.get(i));
		}
	}
	public void postOrder()
	{
		this.postOrder(this.root);
	}
	private void postOrder(Node node)
	{
		for(int i=0;i<node.children.size();i++)
		{
			this.postOrder(node.children.get(i));
		}
		System.out.println(node.data);
	}
	public void levelOrder()
	{
		Queue<Node> queue =new LinkedList<>();
		queue.add(this.root);
		while(!queue.isEmpty())
		{
			Node node =queue.remove();
			System.out.println(node.data);
			for(int i=0;i<node.children.size();i++)
			{
				queue.add(node.children.get(i));
			}
		}
	}
}
