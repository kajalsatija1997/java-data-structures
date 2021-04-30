package Lecture10;

public class QueuesUsingArraysClient {

	public static void main(String[] args) throws Exception {
		QueuesUsingArrays queue=new QueuesUsingArrays(5);
		for(int i=1;i<=5;i++){
		 queue.Enqueue(i);
			display(queue);
		}
		while(!queue.isEmpty())
		{
			display(queue);
			queue.dequeue();
		}
		queue.dequeue();
	}
public static void display(QueuesUsingArrays q)throws Exception
{
System.out.println("************************************");	
q.displayfun();
System.out.println(q.front());
System.out.println(q.size());
System.out.println("************************************");	
}
}
