package Lecture6;

import java.util.Scanner;

public class Selection_sort_with_recursion {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr;
		int n = s.nextInt();
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		int si=0;
		int[] ans = selectionSort(arr,si);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}

	}
	public static int[] selectionSort(int[] arr, int si)
	{
  if (si>= arr.length - 1 )
	  return new int[si];
	    int minIndex = si;
	    for ( int index = si + 1; index < arr.length; index++ )
	    {
	        if (arr[index] < arr[minIndex] )
	            minIndex = index;
	    }
	    int temp = arr[si];
	    arr[si] = arr[minIndex];
	    arr[minIndex] = temp;
	    selectionSort(arr, si + 1);
	    return arr;
	}
}
