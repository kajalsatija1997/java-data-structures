package lecture_2;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int counter=1;
		int a = 0;
		int b = 1;
		int next;
	    System.out.println(a);
		while (counter< N)
		{
			next = a + b;
			a = b;
			b = next;
			counter++;
			System.out.println(a);	
		}
        s.close();
	}

}
