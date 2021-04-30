package lecture_4;

import java.util.Scanner;

public class Insertion_sort {

	public static void main(String[] args) {
		int[] arr = takeinput();
		insertionSort(arr);
		display(arr);
	}

	public static int[] takeinput() {
		Scanner s = new Scanner(System.in);
		int[] arr;
		//System.out.println("Enter the size of the array: ");
		int n = s.nextInt();
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			//System.out.println("Please enter the value at " + i + "th index");
			arr[i] = s.nextInt();
		}
		s.close();
		return arr;
	}

	public static void insertionSort(int[] arr){
		for(int i=1;i<arr.length;i++){
			for(int j=i;j>0&&arr[j]<arr[j-1];j--){
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
			}
		}
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
