package Lecture6;

import java.util.Scanner;

public class Contained_in_an_array {

	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		int[] arr;
		int n = s.nextInt();
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		num=s.nextInt();
		int si=0;
		System.out.println(contains(arr, si,num));
		}
	public static boolean contains(int[] arr, int si,int num) 
	{
		if (si == arr.length) {
			return false;
		}
		if (arr[si] == num) {
			return true;
		} else {
			return contains(arr, si + 1, num);
		}
	}
}
