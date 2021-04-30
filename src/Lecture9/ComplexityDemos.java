package Lecture9;

public class ComplexityDemos {
	public static long start = 0;
	public static long end = 0;

	public static void startAlgo() {
		start = System.currentTimeMillis();
	}

	public static long endAlgo() {
		end = System.currentTimeMillis();
		return end - start;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] one = { 5, 9, 13, 14 };
		// int[] two = { 3, 4, 12 };
		// int[] retVal = merge(one, two);
		// int[] arr = { 5, 2, 7, 18, 10, 20 };
		// int[] sorted = mergeSort(arr, 0, arr.length - 1);
		// display(sorted);
		// quicksort(arr, 0, arr.length - 1);
		// display(arr);

		// int N = 1000000;
		// int[] arr = new int[N];
		// for (int i = 0; i < N; i++) {
		// arr[i] = N - i;
		// }
		// startAlgo();
		// int[] sorted = mergeSort(arr, 0, arr.length - 1);
		// System.out.println("The merge sort took time " + endAlgo() + "
		// milliseconds");
		//
		// for (int i = 0; i < N; i++) {
		// arr[i] = N - i;
		// }
		// startAlgo();
		// bubbleSort(arr);
		// System.out.println("The bubble sort took time " + endAlgo() + "
		// milliseconds");

		// System.out.println(powerBtr(2, 5));

		// int N = 1000000;
		// startAlgo();
		// SOE(N);
		// System.out.println("The seive took time " + endAlgo() + "
		// milliseconds");

		// startAlgo();
		// printPrimes(N);
		// System.out.println("The print prime took time " + endAlgo() + "
		// milliseconds");

		System.out.println(getConcatenatedValues(100));
	}

	public static int[] mergeSort(int[] arr, int low, int high) {
		if (low == high) {
			int[] baseResult = new int[1];
			baseResult[0] = arr[low];
			return baseResult;
		}
		int mid = (low + high) / 2;
		int[] fhalf = mergeSort(arr, low, mid);
		int[] shalf = mergeSort(arr, mid + 1, high);
		int[] sorted = merge(fhalf, shalf);
		return sorted;
	}

	public static int[] merge(int[] one, int[] two) {
		int[] retVal = new int[one.length + two.length];
		int i = 0, j = 0, k = 0;
		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				retVal[k] = one[i];
				i++;
				k++;
			} else {
				retVal[k] = two[j];
				j++;
				k++;
			}
		}

		while (i < one.length) {
			retVal[k] = one[i];
			i++;
			k++;
		}
		while (j < two.length) {
			retVal[k] = two[j];
			j++;
			k++;
		}

		return retVal;
	}

	public static void quicksort(int[] arr, int lo, int high) {
		if (lo >= high) {
			return;
		}
		int left = lo, right = high;
		int mid = (left + right) / 2;
		int pivot = arr[mid];
		while (left <= right) {
			while (arr[left] < pivot) {
				left++;
			}
			while (arr[right] > pivot) {
				right--;
			}
			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		quicksort(arr, lo, right);
		quicksort(arr, left, high);
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void bubbleSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static int powerBtr(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int power = 1;
		if (n % 2 == 0) {
			int powernb2 = powerBtr(x, n / 2);
			power = powernb2 * powernb2;
		} else {
			int powernb2 = powerBtr(x, n / 2);
			power = powernb2 * powernb2 * x;
		}
		return power;
	}

	public static void SOE(int N) {
		boolean[] primes = new boolean[N + 1];
		for (int i = 0; i < primes.length; i++) {
			primes[i] = true;
		}
		int n2test = 2;
		while (n2test * n2test <= N) {
			if (primes[n2test]) {
				for (int multiplier = 2; n2test * multiplier <= N; multiplier++) {
					primes[n2test * multiplier] = false;
				}
			}
			n2test++;
		}

		for (int i = 2; i < primes.length; i++) {
			if (primes[i]) {
				// System.out.println(i);
			}
		}
	}

	public static void printPrimes(int N) {
		int start = 2;
		int end = N;

		boolean flag = true;
		while (start <= end) {
			int divisor = 2;
			flag = true;

			while (divisor < start) {
				if (start % divisor == 0) {
					flag = false;
					break;
				}
				divisor++;
			}

			if (flag == true) {
				// System.out.println(start);
			}
			start++;
		}

	}

	public static String getConcatenatedValues(int N) {
		String retVal = "";

		for (int i = 0; i <= N; i++) {
			retVal = retVal + i + "\n";
		}

		return retVal;
	}

	public static String getConcatenatedValuesBtr(int N) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i <= N; i++) {
			sb.append(i + "\n");
		}

		return sb.toString();
	}

	// For space complexity
	public static int getFactIterative(int n) {
		int rv = 1;

		while (n != 0) {
			rv *= n;
			n--;
		}

		return rv;
	}

	// For space complexity
	public static int getFactRecursive(int n) {
		if (n == 1) {
			return 1;
		}

		int factnm1 = getFactRecursive(n - 1);
		int factn = factnm1 * n;

		return factn;
	}

}
