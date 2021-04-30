package Lecture_12;

import Lecture11.DynamicStack;

public class ReverseStack {

	public static void main(String[] args) throws Exception {
		DynamicStack stack = new DynamicStack(8);
		//DynamicStack helper = new DynamicStack(5);
//		for (int i = 1; i <= 5; i++) {
//			stack.push(i);
//		}
		//stack.display();
		//reverseStack(stack, helper, 0);
		//stack.display();
	System.out.println(isbalanced("{([a+b])}",stack));
	    
	}

	public static void reverseStack(DynamicStack stack, DynamicStack helper, int idx) throws Exception {
		if (stack.isEmpty()) {
return;
		}
		int item = stack.pop();
		reverseStack(stack, helper, idx + 1);
		helper.push(item);
		if (idx == 0) {
			while (!helper.isEmpty()) {
				stack.push(helper.pop());
			}
		}
	}
	public static boolean isbalanced(String str,DynamicStack stack) throws Exception
	{
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='{'||ch=='('||ch=='[')
			{
				stack.push(ch);
			}
			else if(ch=='}')
			{
				if (stack.isEmpty())
				{
					return false;
				}
				else
				{
					char tc=(char)stack.pop();
					if(tc=='{')
					{
						stack.pop();
					}
					else
					{
						return false;
					}
				}
			}
			else if(ch==')')
			{
				if (stack.isEmpty())
				{
					return false;
				}
				else
				{
					char tc=(char)stack.pop();
					if(tc=='(')
					{
						stack.pop();
					}
					else
					{
						return false;
					}
				}
			}	
		else if(ch==']')
		{
			if (stack.isEmpty())
			{
				return false;
			}
			else
			{
				char tc=(char)stack.pop();
				if(tc=='[')
				{
					stack.pop();
				}
				else
				{
					return false;
				}
			}
		}	
		
	}
		if(stack.isEmpty())
		{
			return true;
		}
		else
		{
			
			return false;
		}
}

}