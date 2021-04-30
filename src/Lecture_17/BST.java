package Lecture_17;



public class BST {
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

	BST() {
		this.root = null;
		this.size = 0;
	}
    BST(int... sortedArray)
    {
    	this.construct(sortedArray,0,sortedArray.length-1);
    }
    private  Node construct(int[] sortedArray,int si,int li)
    {
    	if(si>li)
    	{return null;
    	}
    	int mid = (si+li)/2;
    	//int midEle=sortedArray[si+li]/2;
    	Node node=new Node(sortedArray[mid],null,null);
    	this.size++;
    	node.left=this.construct(sortedArray,si,mid-1);
    	node.right=this.construct(sortedArray,mid+1,li);
    	return node;		
    }
	public int size() {
		return this.size;
	}

	public void add(int data) {
		if (this.root == null) {
			this.root = new Node(data, null, null);
			this.size++;
		} else {
			this.add(this.root, data);
		}
	}

	private void add(Node node, int data) {
		if (data > node.data) {
			if (node.right != null) {
				add(node.right, data);
			} else {
				node.right = new Node(data, null, null);
				this.size++;
			}
		}
		if (data < node.data) {
			if (node.left != null) {
				add(node.left, data);
			} else {
				node.left = new Node(data, null, null);
				this.size++;
			}
		} else {

		}
	}

	public int max() {
		return this.max(this.root);
	}

	private int max(Node node) {
		int rv = node.data;
		if (node.right != null) {
			rv = this.max(node.right);
		}
		return rv;
	}

	public int min() {
		return this.min(this.root);
	}

	private int min(Node node) {
		int rv = node.data;
		if (node.left != null) {
			rv = this.min(node.left);
		}
		return rv;
	}

	public void remove(int data) {
		this.root=this.remove(this.root, +data);
	}

	private Node remove(Node node, int data) {
		if (node == null) {
			return null;
		}
		if (data < node.data)
		{
			node.left = this.remove(node.left, data);
			return node;
		} else if (data > node.data) {
			node.right = this.remove(node.right, data);
			return node;
		} else {
			if (node.left == null && node.right == null) {
				this.size--;
				return null;

			} else if (node.left == null) {
				this.size--;
				return node.right;
			} else if (node.right == null) {
				this.size--;
				return node.left;
			} else {
				int lmax = this.max(node.left);
				node.data = lmax;
				node.left = this.remove(node.left, lmax);
				return node;
			}
		}
	}

	public void display() {
		this.display(this.root);
	}
	private void display(Node node) {
		if (node.left != null) {
			System.out.print(node.left.data + "=>");
		} else {
			System.out.print("END" + "=>");
		}
		System.out.print(node.data + "<=");
		if (node.right != null) {
			System.out.print(node.right.data + "=>");
		} else {
			System.out.print("END");
		}
		System.out.println();
		if (node.left != null) {
			display(node.left);
		}
		if (node.right != null) {
			display(node.right);
		}
	}
	public boolean  isBST()
	{
		return isBST(this.root,Integer.MIN_VALUE,Integer.MAX_VALUE);	
		}
	private boolean isBST(Node node,int min,int max)
	{
		if(node==null){
			return true;
		}
		if(node.data<min||node.data>max)
		{
			return false;
		}
		if(!isBST(node.left,min,node.data))
		{
			return false;
			
		}
		if(!isBST(node.right,node.data,max))
		{
			return false;
			
		}
		return true;
	}
	
}
