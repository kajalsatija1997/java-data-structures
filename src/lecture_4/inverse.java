package lecture_4;
import java.util.*;

public class inverse {
 public static void main(String args[]) {
	        Scanner s = new Scanner(System.in);
			int[] arr = takeInput();
			reverse(arr);
			display(arr);
	        
	    }
	    public static int[] takeInput() {
			Scanner s = new Scanner(System.in);
			int[] arr;
			int N = s.nextInt();
			arr = new int[N];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = s.nextInt();
			}
			return arr;

		}
	    public static void reverse(int[] arr) {
	 for(int i=0;i<arr.length-1;i++)
	 {
	     int min_index=i;
	     for(int j=i+1;j<arr.length;j++)
	     {
	         if(arr[j]<arr[j+1])
	         {
	            int temp=arr[j];
	             arr[j]=arr[min_index];
	             arr[min_index]=temp;
	         }
	     }
	 }
	    } 
			public static void display(int[] arr) {
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}

	}
		