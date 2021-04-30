package lecture_2;

import java.util.Scanner;

public class Pattern_9 {

	public static void main(String[] args) {
		int i, j,k;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (i = 1; i <= n; ++i) {
			for (j = 1; j <= i; ++j) {
				System.out.print(j);
			}
			k=n+1;
			while(k>=1)
			{
				System.out.print("j");
				
			}
			
			k--;
			System.out.println();
		}
		s.close();
	
	 /* for (i = n; i >=1; i--) {
			for (j = 1; j >= n; j++) {
				System.out.print(j);
			}
			System.out.println();*/
		}
	}

