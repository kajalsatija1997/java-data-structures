package lecture_3;

import java.util.Scanner;

public class Basic_calculator {
	public static void main(String[] args) {
		int n1,n2,res;
		char ch;
		Scanner reader = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		do {
			ch = reader.next().trim().charAt(0);
			switch (ch) {
			case '+':
				 n1 = s.nextInt();
				 n2 = s.nextInt();
				 res = n1 + n2;
				//System.out.println(res);
				break;
			case '-':
				n1 = s.nextInt();
				n2 = s.nextInt();
			    res = n1 - n2;
				//System.out.println(res);
				break;
			case '*':
			    n1 = s.nextInt();
				n2 = s.nextInt();
				res = n1 * n2;
				//System.out.println(res);
				break;
			case '/':
				n1 = s.nextInt();
				n2 = s.nextInt();
				res = n1 / n2;
				//System.out.println(res);
				break;
			case '%':
				n1 = s.nextInt();
				n2 = s.nextInt();
				res = n1 % n2;
				//System.out.println(res);
				break;
			case 'x':System.exit(0);
				break;
			case 'X':System.exit(0);
				break;
			default:
				System.out.println("Invalid operation.\tTry again");
				break;
			}
		} while (ch != 'X');
	}

}
