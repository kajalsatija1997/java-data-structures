package lecture_4;

import java.util.Scanner;

public class Selection_sort {

	public static void main(String[] args) {
		int[] arr = takeinput();
		selectionsort(arr);
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

	public static int[] selectionsort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min_index=i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] <arr[min_index]) {
					int temp = arr[j ];
					arr[j] = arr[min_index];
					arr[min_index] = temp;
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
