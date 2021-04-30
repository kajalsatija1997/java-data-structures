package lecture_2;

import java.util.Scanner;

public class mirror_star {

	public static void main(String[] args) {
        int i, j, space = 1;
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		 space = n - 1;
		 if(n%2!=0)
		 {
	        for (j = 1; j <= n; j++) 
	        {
	            for (i = 1; i <= space; i++) 
	            {
	                System.out.print(" ");
	            }
	            space--;
	            for (i = 1; i <= 2 * j - 1; i++) 
	            {
	                System.out.print("*");                
	            }
	            System.out.println("\t");
	        }
	        space = 1;
	        for (j = 1; j <= n - 1; j++) 
	        {
	            for (i = 1; i <= space; i++) 
	            {
	                System.out.print(" ");
	            }
	            space++;
	            for (i = 1; i <= 2 * (n - j) - 1; i++) 
	            {
	                System.out.print("*");
	            }
	            System.out.println("\t");
	        }

	}
s.close();
}
}