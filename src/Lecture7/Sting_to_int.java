package Lecture7;

import java.util.Scanner;

public class Sting_to_int {

	public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        System.out.println(recursive(s));

	}
	public static int recursive(String s) {
		int x = 0;
	     int counter = 0;
        if (s.length() == 1) {
            x = (x * 10) + Integer.parseInt(s.substring(0, 1));
            return x;
        } else {
            x = (x * 10) + Integer.parseInt(s.substring(0, 1));
            counter++;
            return recursive(s.substring(1, s.length()));

        }

    }
}
