package lecture_4;

import java.util.Scanner;

public class Sum_in_array {

	public static void main(String[] args) {
		int[] arr = takeinput();

		// int target=50;
		sum(arr);
		// display(arr);

	}

	public static int[] takeinput() {
		Scanner s = new Scanner(System.in);
		int[] arr;
		int n = s.nextInt();
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();

		}
		s.close();
		return arr;
	}

	public static void sum(int[] arr) {
		Scanner s = new Scanner(System.in);
		int target = s.nextInt();
          //int target=50;
		for (int i = 0; i < arr.length; i++) {
			int frst = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				int second = arr[j];
				if ((frst + second) == target) {
					System.out.println(frst + " and " + second);
				}
			}
		}
		s.close();
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
