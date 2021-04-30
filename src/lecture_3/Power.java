package lecture_3;

public class Power {

	public static void main(String[] args) {
		System.out.println(power(2,5));
		System.out.println(log(32,2));
		
}
	public static int power(int x,int n)
	{
		int mul=1;
        while(n!=0)
        {
        	mul=mul*x;
        	n--;
        }
		return mul;
		
	}
	public static int log(int x,int n)
	{
		int counter=0;
		while(x!=1)
		{
    		counter=counter+1;
			x=x/n;
		}
		return counter;
		
	}
}
