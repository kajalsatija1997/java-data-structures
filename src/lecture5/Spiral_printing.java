package lecture5;

import java.util.Scanner;

public class Spiral_printing {

	public static void main(String[] args) {
		

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
	public static void spiral(int[][]arr){
		int top=0;
		int left=0;
		int right=arr.length-1;
		int dir=1;}
//		int bottom=arr[row].length-1;
		//int count=dir;
//		while(left<right&&top<bottom)
//		{
//			if(dir==1)
//			{
//				for(left=0;left<=right;)
//				left++;
//				System.out.println(arr[left][right]);
//			}
//			else if(dir==2)
//			{
//			top++;
//			System.out.println(arr[left]);
//			
//			}
//		}
//	}
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
