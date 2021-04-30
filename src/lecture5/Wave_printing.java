package lecture5;

import java.util.Scanner;

public class Wave_printing {

	public static void main(String[] args) {
	int [][]arr=takeinput();
	display(arr);
	wave(arr);

	}
	public static int[][] takeinput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no. of rows:");
		int rows=s.nextInt();
		int[][]arr=new int[rows][];
		for(int row=0;row<arr.length;row++)
		{
			System.out.println("Enter the no. of columns for row " +row);
			int cols=s.nextInt();
			arr[row]=new int[cols];
			for(int col=0;col<arr[row].length;col++)
			{
				System.out.println("Enter the data for row "+row+" and col "+col);
				arr[row][col]=s.nextInt();
			}
		}
		return arr;
	}
	public static int[][] wave(int[][]arr) {
		for(int row=0;row<arr.length;row++)
		{
			if(row%2==0)
			{
			for(int col=0;col<arr[row].length;col++)
			{
				System.out.print(arr[row][col]+" ");	
			}
			}
			else
			{
				for(int col=arr[row].length-1;col>=0;col--)
				{
					System.out.print(arr[row][col]+" ");	
				}
			}
		}
		return arr;
	}
				
	public static void display(int[][]arr)
	{
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++)
			{
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	}
}