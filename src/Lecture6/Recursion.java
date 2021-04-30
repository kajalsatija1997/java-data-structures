package Lecture6;

public class Recursion {

	public static void main(String[] args) {
		// PD(5);
		// PI(5);
		// PDI(5);
		// PDISkip(5);
		// System.out.println(fact(5));
		// System.out.println(fib(5));
		// System.out.println(power(2, 5));

	//	int[] arr = { 8, 7, 1, 7, 7 };
		// System.out.println(isSorted(arr, 0));
		// System.out.println(contains(arr, 0, 5));
		// System.out.println(firstIndex(arr, 0, 3));
//		int[] ans = allIndices(arr, 0, 1, 0);
//		for (int i = 0; i < ans.length; i++) {
//			System.out.println(ans[i]);
//		}
		printPattern(5, 1, 1);

	}
	public static void PD(int num) {
		if (num == 0) {
			return;
		}
		System.out.println(num);
		PD(num - 1);
	}

	public static void PI(int num) {
		if (num == 0) {
			return;
		}

		PI(num - 1);
		System.out.println(num);
	}

	public static void PDI(int num) {
		if (num == 0) {
			return;
		}
		System.out.println(num);
		PDI(num - 1);
		System.out.println(num);
	}

	public static void PDISkip(int num) {
		if (num == 0) {
			return;
		}
		if (num % 2 != 0) {
			System.out.println(num);
		}
		PDISkip(num - 1);

		if (num % 2 == 0) {
			System.out.println(num);
		}
	}

	public static int fact(int num) {
		if (num == 0) {
			return 1;
		}
		int fnm1 = fact(num - 1);
		int fn = num * fnm1;

		return fn;
	}

	public static int fib(int num) {
		if (num == 0 || num == 1) {
			return num;
		}
		int fibnm1 = fib(num - 1);
		int fibnm2 = fib(num - 2);
		int fibn = fibnm1 + fibnm2;
		return fibn;
	}

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}

		int pnm1 = power(x, n - 1);
		int pwn = x * pnm1;
		return pwn;
	}

	public static boolean isSorted(int[] arr, int si) {
		if (si == arr.length - 1) {
			return true;
		}
		if (arr[si] < arr[si + 1]) {
			boolean result = isSorted(arr, si + 1);
			return result;
		} else {
			return false;
		}
	}

	public static int contains(int[] arr, int si, int num) {
		if (si == arr.length) {
			return -1;
		}
		if (arr[si] == num) {
			return si;
		} else {
			return contains(arr, si + 1, num);
		}
	}

	public static int firstIndex(int[] arr, int si, int num) {
		if (si == arr.length) {
			return -1;
		}

		if (arr[si] == num) {
			return si;
		} else {
			return firstIndex(arr, si + 1, num);
		}
	}

	public static int lastindex(int[] arr, int si, int num) {
		if (si == arr.length) {
			return -1;
		}
		int index = lastindex(arr, si + 1, num);
		if (index != -1) {
			return index;
		} else {
			if (arr[si] == num) {
				return si;
			} else {
				return -1;
			}
		}
	}

	public static int[] allIndices(int[] arr, int si, int num, int count) {
		if (si == arr.length) {
			return new int[count];
		}
		int[] indices = null;
		if (arr[si] == num) {
			indices = allIndices(arr, si + 1, num, count + 1);
		} else {
			indices = allIndices(arr, si + 1, num, count);
		}

		if (arr[si] == num) {
			indices[count] = si;
		}
		return indices;

	}

	public static void printPattern(int N, int row, int col) {
		if(row>N){
			return;
		}
		
		if(col>row){
			System.out.println();
			printPattern(N, row+1, 1);
			return;
		}
		System.out.print("*\t");
		printPattern(N, row, col+1);
	}

}
