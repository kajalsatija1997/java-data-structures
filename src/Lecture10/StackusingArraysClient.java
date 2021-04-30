package Lecture10;

public class StackusingArraysClient {

	public static void main(String[] args) throws Exception {
		StacksWithArrays stack=new StacksWithArrays(5);
		for(int i=1;i<=5;i++){
			stack.push(i);
			displayStackInfo(stack);
		}
		while(!stack.isEmpty())
		{
			displayStackInfo(stack);
			stack.pop();
		}
		stack.pop();
	}
public static void displayStackInfo(StacksWithArrays s)throws Exception
{
System.out.println("************************************");	
s.display();
System.out.println(s.TOP());
System.out.println(s.size());
System.out.println("************************************");	
}
}

