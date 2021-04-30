package lecture_4;

import java.util.Scanner;

public class Binary_search {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr;
		int n = s.nextInt();
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();

		}
		//display(arr);
		System.out.println(binary(arr));
	}
//	public static int[] takeinput() {
//		Scanner s = new Scanner(System.in);
//		int[] arr;
//		3int n = s.nextInt();
//		arr = new int[n];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = s.nextInt();
//
//		}
//		s.close();
//		return arr;
//	}
	public static int binary(int[] arr) {
		Scanner s = new Scanner(System.in);
		int src = s.nextInt();
		int left=0;
		int right=arr.length-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(arr[mid]==src)
			{
				return mid;
			}
			else if(arr[mid]<src)
			{
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		return -1;
	}
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
