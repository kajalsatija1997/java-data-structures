package lecture_2;

import java.util.Scanner;

public class Print_prime {

	public static void main(String[] args) {
		Scanner sh = new Scanner(System.in);
		int n = sh.nextInt();	
		int i=2;
		boolean flag=true;
		while(i<=n/2)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
			i++;
		}          
	if(flag)
	{
		System.out.println("Prime");
	}
	else
	{
		System.out.println("Non prime");
	}
	sh.close();
	}

}
