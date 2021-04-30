package Lecture7;

import java.util.Scanner;

public class Recursive_bubble_sort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr;
		int n = s.nextInt();
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		int si=arr.length;
		int[] ans = recursiveBubbleSort(arr,si);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]);
		}
	}
	  public static int[] recursiveBubbleSort(int[] list, int n) {
	        if (n == 1) {
	            return list; //finished sorting
	        }
	        
	        int temp;
	        for (int i = 0; i < n-1; i++) {
	            if (list[i+1] < list[i]) {
	                temp = list[i];
	                list[i] = list[i+1];
	                list[i+1] = temp;
	            }
	        }
	        return recursiveBubbleSort(list, n-1);
	    }
}
