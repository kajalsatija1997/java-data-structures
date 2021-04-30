package lecture_3;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		int hcf, temp, lcm;
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		hcf = n1;
		temp = n2;
		while (hcf != temp) {
			if (hcf > temp)
				hcf -= temp;
			else
				temp -= hcf;
		}

		lcm = (n1 * n2) / hcf;

		System.out.println(lcm);
		s.close();
	}

}
