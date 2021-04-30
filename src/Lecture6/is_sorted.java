package Lecture6;

import java.util.Scanner;

public class is_sorted {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr;
		int n = s.nextInt();
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		int si=0;
		System.out.println(isSorted(arr,si));

	}
	public static boolean isSorted(int[] arr, int si) {
		if (si == arr.length - 1) {
			return true;
		}
		if (arr[si] < arr[si + 1]) {
			boolean result = isSorted(arr, si + 1);
			return result;
		} else {
			return false;
		}
	}

}
