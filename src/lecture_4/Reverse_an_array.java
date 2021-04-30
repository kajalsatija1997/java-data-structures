package lecture_4;

import java.util.Scanner;

public class Reverse_an_array {

	public static void main(String[] args) {
      int[] arr = takeinput();
		boolean flag=true;
		//System.out.println(reverse(arr));
		//System.out.println(arr);
//		for(int i=0;i<arr.length;i++)
//		{	if(arr[i]==mirror_reverse(arr))
//		{
//			System.out.println(flag);
//		}
//		else
//		{
//			System.out.println(!flag);
//		}
//		}
		display(arr);
		//System.out.println(arr);

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
		s.close();
		return arr;
	}
	public static int[] mirror_reverse(int[] arr) 
	{
		
		int left=0;
		int right=arr.length-1;
		while(left<=right)
		{
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		int []arr1= arr;
		return arr1;
	}
	public static void display(int[] arr) 
	{
	for (int i = 0; i < arr.length; i++) 
	{
		System.out.println(arr[i]);
    }
	}
}
