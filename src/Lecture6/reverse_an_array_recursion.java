package Lecture6;

import java.util.Scanner;

public class reverse_an_array_recursion {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr;
		int n = s.nextInt();
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		int[] ans = reverse(arr, 0, arr.length -1);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}
	public static int[] reverse(int[] arr, int i, int j){
	    if(i<j){//Swap
	       int temp = arr[i];
	       arr[i] = arr[j];
	       arr[j] = temp;
	       reverse(arr, ++i, --j);//Recursive
	    }
	    return arr;
	}
}
