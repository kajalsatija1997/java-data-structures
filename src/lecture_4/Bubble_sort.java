package lecture_4;

import java.util.Scanner;

public class Bubble_sort {

	public static void main(String[] args) {
		int[] arr = takeinput();
		bubblesort(arr);
		display(arr);

	}

	public static int[] takeinput() {
		Scanner s = new Scanner(System.in);
		int[] arr;
		//System.out.println("Enter the size of he array: ");
		int n = s.nextInt();
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			//System.out.println("Please enter the value at " + i + "th index");
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static int[] bubblesort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j ];
					arr[j] = arr[j+1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;

	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
