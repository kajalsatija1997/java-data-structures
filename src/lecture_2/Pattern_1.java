package lecture_2;

import java.util.Scanner;

public class Pattern_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		int col;
		int value = 1;
		while (row <= n) {
			col=1;
			while (col <= row) {
				System.out.print(value+"\t");
				value++;
				col++;
			}
			row++;
			System.out.println();
		}
s.close();
	}

}
