package Lecture6;

import java.util.Scanner;

public class Is_palindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr;
		int n = s.nextInt();
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		int start=0;
		int end =arr.length-1;
		System.out.println(isPalindrome(arr,start,end));

	}
	public static boolean isPalindrome(int[] array, int start, int end)
	{
	    if(array.length == 0 || array.length == 1)
	        return true;

	    if(start >= end)
	        return true;

	    if(array[start] != array[end])
	        return false;

	    return isPalindrome(array, start + 1, end -1);
	}
}
