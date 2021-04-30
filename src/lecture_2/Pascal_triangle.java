package lecture_2;

import java.util.Scanner;

public class Pascal_triangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i;
		int k;
		int value = 1;
		for(i=0;i<n;i++)
		{
		value=1;
		for(k=0;k<=i;k++)
		{
		System.out.print(value+"\t"); 
		value = value * (i - k) / (k + 1);
		}
		System.out.println(); 
		}
s.close();
	}
}
