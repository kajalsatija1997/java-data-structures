package Lecture10;

public class QueuesUsingArrays {
	protected int[]data;
	protected int front;
	private int size=0;
	public static final int DEFAULT_CAPACITY=10;
	public QueuesUsingArrays() throws Exception
	{
		this(DEFAULT_CAPACITY);
	}
	public QueuesUsingArrays(int capacity) throws Exception
	{
		if(capacity<1)
		{
			throw new Exception("Please enter the valid capacity");
		}
		this.data=new int[capacity];
		this.front=0;
		this.size=0;
	}
	public int size()
	{
		return this.size;
	}
	public boolean isEmpty()
	{
		if(this.size()==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void Enqueue(int item) throws Exception
	{
		if(this.size==this.data.length)
		{
			throw new Exception("Queue is full");
		}
		int ai=(this.size+this.front)%this.data.length;
		this.data[ai]=item;
		this.size++;
	}
	public int dequeue() throws Exception
	{
		if(this.isEmpty())
		{
			throw new Exception("Queue is empty");
		}
		int retVal=this.data[this.front];
		this.data[this.front]=0;
		this.front=(this.front+1)%this.data.length;
		//this.front++;
		this.size--;
		return retVal;
	}
	public int front() throws Exception  
	{
		if(isEmpty())
	{
		throw new Exception("Stack is empty");
	}
	int retVal=this.data[front];
		return retVal ;	
	}
	public void displayfun(){
		for(int i=0;i<=this.size;i++)
		{int ai=(this.front+i)%this.data.length;
			System.out.print(this.data[ai]+" , ");
		}
		System.out.println();}
}
