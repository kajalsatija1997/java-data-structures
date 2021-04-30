package lecture_4;

import java.util.Scanner;

public class Intersectioion_of_two_arrays {

	public static void main(String[] args) {
		int []arr1=takeInput();
		int m=arr1.length;
		int []arr2=takeInput1(m);
		//int n=arr2.length;
		intersection(arr1,arr2,m);
	}

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int[] arr1;
		int N = s.nextInt();
		arr1 = new int[N];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = s.nextInt();
		}

		return arr1;
	}

	public static int[] takeInput1(int m) {
		Scanner s = new Scanner(System.in);
		int[] arr2;
		//int M = s.nextInt();
		arr2 = new int[m];
		for (int j = 0; j < arr2.length; j++) {
			arr2[j] = s.nextInt();
		}
		return arr2;
	}
	public static void intersection(int arr1[],int arr2[],int m)
	{
		int i = 0, j = 0;
		  while (i < m && j < m)
		  {
		    if (arr1[i] < arr2[j])
		      i++;
		    else if (arr2[j] < arr1[i])
		      j++;
		    else 
		    {
		    	 System.out.print(arr2[j++]+" ");
		      i++;
		    }
		  }
	}
}
