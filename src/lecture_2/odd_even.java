package lecture_2;

public class odd_even {

	public static void main(String[] args) {
		int n = 76251;
		int i = 1;
		int r;
		int sum = 0;
		int sum1 = 0;
		while (n != 0) {
			r = n % 10;
			if (i % 2 !=0) {
				sum = sum + r;
			} 
			else {
				sum1 = sum1 + r;
			}
			n = n / 10;
			i++;
		}
		System.out.println(sum);
		System.out.println(sum1);

	}

}
