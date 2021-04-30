package lecture_2;

import java.util.Scanner;

public class Count_digits {

	public static void main(String[] args) {
		int n, i = 0;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		while (n > 0) {
			n = n / 10;
			int rem = n % 10;
				i++;
		}
		System.out.println(i);
		s.close();
	}

}
