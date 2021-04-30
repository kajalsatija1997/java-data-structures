package lecture_2;

import java.util.Scanner;

public class fibonacci_pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		int col = 1;
		int a = 0;
		int b = 1;
		int next = 0;
		while (row <= n) {
			col=1;
			while (col <= row) {
				System.out.print(a+"\t");
				next = a + b;
				a = b;
				b = next;
				col++;
			}
			row++;
			System.out.println();
		}
		s.close();
		}

	}

