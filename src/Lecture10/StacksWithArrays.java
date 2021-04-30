package Lecture10;

public class StacksWithArrays {
protected int[]data;
protected int tos;
public static final int DEFAULT_CAPACITY=10;
public StacksWithArrays() throws Exception
{
	this(DEFAULT_CAPACITY);
}
public StacksWithArrays(int capacity) throws Exception
{
	if(capacity<1)
	{
		throw new Exception("Please enter the valid capacity");
	}
	this.data=new int[capacity];
	this.tos=-1;
}
public int size()
{
	return this.tos+1;
}
public boolean isEmpty()
{
	if(this.size()==0)
	{
		return true;
	}
		return false;
	
}
	public void push(int item) throws Exception
	{
		if(this.tos==this.data.length-1)
			
		{
			throw new Exception("Stack Overflow");
		}
		this.tos++;
		this.data[this.tos]=item;
	}
	public int pop() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Stack is empty");
		}
		int retVal=this.data[this.tos];
		this.data[this.tos]=0;
		this.tos--;
		
		return retVal;
	}
public int TOP() throws Exception
{
	if(isEmpty())
	{
		throw new Exception("Stack is empty");
	}
	int retVal=this.data[tos];
	return retVal ;	
}
public void display(){
	for(int i=this.tos;i>=0;i--)
	{
		System.out.print(this.data[i]+" , ");
	}
	System.out.println("END");
	//System.out.println();
}
}
