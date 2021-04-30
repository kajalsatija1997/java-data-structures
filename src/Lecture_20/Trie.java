package Lecture_20;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Trie {
	private class Node {
		Character data;
		HashMap<Character, Node> children;
		boolean isTerminal;

		Node(Character data, boolean isTerminal) {
			this.data = data;
			this.isTerminal = isTerminal;
			this.children = new HashMap<>();
		}
	}

	private Node root;
	private int numWords;

	Trie() {
		this.root = new Node('\0', false);
		this.numWords = 0;
	}

	public int getNumWords() {
		return this.numWords;
	}

	public boolean isEmpty() {
		return this.getNumWords() == 0;
	}

	public void addWord(String word) {
		this.addWord(this.root, word);
	}

	private void addWord(Node parent, String word) {
		if (word.length() == 0) 
		{
			if (parent.isTerminal) 
			{

			} 
			else 
			{
				parent.isTerminal = true;
				this.numWords++;
			}
			return;
		}
		char cc = word.charAt(0);
		String ros = word.substring(1);
		Node child = parent.children.get(cc);
		if (child == null) 
		{
			child = new Node(cc, false);
			parent.children.put(cc, child);
		}

		this.addWord(child, ros);
	}

	public void display() 
	{
		this.display(this.root, "");
	}

	private void display(Node node, String osf) 
	{
		if (node.isTerminal) 
		{
			String toPrint = osf.substring(1) + node.data;
			System.out.println(toPrint);
		}
		Set<Map.Entry<Character, Node>> entries = node.children.entrySet();
		for (Map.Entry<Character, Node> entry : entries) 
		{
			this.display(entry.getValue(), osf + node.data);
		}
	}

	public boolean search(String word) 
	{
		return this.search(this.root, word);
	}

	private boolean search(Node parent, String word) 
	{
		if (word.length() == 0) 
		{
			if (parent.isTerminal)
			{
				return true;
			} 
			else
			{
				return false;
			}
		}

		char cc = word.charAt(0);
		String ros = word.substring(1);
		Node child = parent.children.get(cc);
		if (child == null) 
		{
			return false;
		}

		return this.search(child, ros);

	}

	public void remove(String word) 
	{
		this.remove(this.root, word);
	}

	private void remove(Node parent, String word)
	{
		if (word.length() == 0) 
		{
			if (parent.isTerminal) 
			{
				parent.isTerminal = false;
				this.numWords--;
			} 
			else 
			{

			}
			return;
		}
		char cc = word.charAt(0);
		String ros = word.substring(1);
		Node child = parent.children.get(cc);
		if (child == null) {
			return;
		}
		this.remove(child, ros);
		if (!child.isTerminal && child.children.size() == 0) {
			parent.children.remove(cc);
		}
	}

	public void displayAstree() {
		this.displayAstree(this.root);
	}

	private void displayAstree(Node node) {
		String str = "";
		str += node.data + "=>";
		Set<Map.Entry<Character, Node>> entries = node.children.entrySet();
		for (Map.Entry<Character, Node> entry : entries) {
			str += entry.getKey() + ",";
		}
		str += "END";
		System.out.println(str);
		// Set<Map.Entry<Character,Node>> entries=node.children.entrySet();
		for (Map.Entry<Character, Node> entry : entries) {
			this.displayAstree(entry.getValue());
		}
	}

}
