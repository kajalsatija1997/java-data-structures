package lecture_2;

import java.util.Scanner;

public class Star_pattern {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
    int n;
    System.out.println("Enter any no.");
    n= scan.nextInt();
    int row=1;
    int col=1;
    while(row<=n)
    {
    	col=1;
    	while(col<=n-row)
    	{
    		System.out.print("\t");
    		col++;
    	}
    	col=1;
    	while(col<=row)
    	{
    		System.out.print("* \t");
    		col++;
    	}
    	col=1;
    	while(col<row)
    	{
    		System.out.print("* \t");
    		col++;
    	}
    	row++;
    	System.out.println();
    }
    scan.close();
	}

}
