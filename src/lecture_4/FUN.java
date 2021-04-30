package lecture_4;

import java.util.Scanner;

public class FUN {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int[] arr;
			int n = s.nextInt();
			arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = s.nextInt();
			}
			System.out.println(max(arr));
	}
	public static int max(int[] arr) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
