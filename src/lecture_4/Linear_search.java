package lecture_4;

import java.util.Scanner;

public class Linear_search {

	public static void main(String[] args) {
		int[] arr = takeinput();
		search(arr);
		//display(arr);

	}

	public static int[] takeinput() {
		Scanner s = new Scanner(System.in);
		int[] arr;
		//System.out.println("Enter the size of he array: ");
		int n = s.nextInt();
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			//System.out.println("Please enter the value at" + i + "th index");
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void search(int[] arr) {
		Scanner s = new Scanner(System.in);
		//System.out.println("Enter the item to be searched : ");
		int src = s.nextInt();
		int temp=-1;
		for (int i = 0; i < arr.length; i++)
		{
			
			if (src == arr[i])
			{
				temp = i;
			} 
			
		}
		
		System.out.println(temp);
	}

//	public static void display(int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//	}
	
}
