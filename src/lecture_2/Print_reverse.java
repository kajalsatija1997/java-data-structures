package lecture_2;

import java.util.Scanner;

public class Print_reverse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int rev = 0;
		int rem;
		while (num > 0) {
			rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
		}

		System.out.println("The reverse of a given number is: " + rev);
s.close();
	}

}
