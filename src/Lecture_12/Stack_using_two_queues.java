package Lecture_12;

import Lecture11.DynamicStack;

public class Stack_using_two_queues {
	DynamicStack sPrimary;
	DynamicStack sSecondry;

	Stack_using_two_queues() throws Exception {
		sPrimary = new DynamicStack();
		sSecondry = new DynamicStack();
	}

	public int size() {
		return this.sPrimary.size();
	}

	public boolean isEmpty() {
		if (this.sPrimary.size() == 0) {
			return true;
		}
		return false;
	}

	public void Enqueue(int item) throws Exception {
			this.sPrimary.push(item);

		}
//	public int dequeue() throws Exception
//	{
//		if(this.size()==0){
//			throw new Exception("Queue is empty");
//		}
//		
//		while(!(this.sPrimary.size()==1))
//		{
//			this.sSecondry.push(this.sPrimary.pop());
//	
//		}
//		int rv=this.sPrimary.pop();
//	}
//	public int front() throws Exception
//	{
//		if(isEmpty())
//		{
//			throw new Exception("Stack is empty");
//		}
//		int retVal=this.data[front];
//			return retVal ;	
//	}
}
