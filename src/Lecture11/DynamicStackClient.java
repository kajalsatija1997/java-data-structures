package Lecture11;

import Lecture10.StacksWithArrays;

public class DynamicStackClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StacksWithArrays stack = new DynamicStack(5);
		for (int i = 1; i <= 5; i++) {
			stack.push(i);
			displayStackInfo(stack);
		}
		for (int i = 1; i <= 5; i++) {
			stack.push(i*10);
			displayStackInfo(stack);
		}
		stack.push(60);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		displayStackInfo(stack);

		while (!stack.isEmpty()) {
			displayStackInfo(stack);
			stack.pop();
		}
		
		//stack.pop();
	}

	public static void displayStackInfo(StacksWithArrays s) throws Exception {
		System.out.println("****************************************");
		s.display();
		System.out.println(s.TOP());
		System.out.println(s.size());
		System.out.println("****************************************");
	}

}
