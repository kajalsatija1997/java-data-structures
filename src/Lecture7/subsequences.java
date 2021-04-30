package Lecture7;

import java.util.ArrayList;
import java.util.Scanner;

public class subsequences {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        String str = s.nextLine();
	        System.out.println(getSS(str));
	        printSS(str," ");
	        countSS(str," ");
	}
	public static void countSS(String str, String result) {
		if (str.length() == 0) {
			int count=0;
			count++;;
			System.out.println(count);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);

		countSS(ros, result);
		countSS(ros, result + cc);
	}
	public static ArrayList<String> getSS(String str) {
		if (str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> recResult = getSS(ros);
		ArrayList<String> myResult = new ArrayList<>();
		for (int i = 0; i < recResult.size(); i++) {
			myResult.add(recResult.get(i));
			myResult.add(cc + recResult.get(i));
		}

		return myResult;
	}
	public static void printSS(String str, String result) {
		if (str.length() == 0) {
			System.out.print(result);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);

		printSS(ros, result);
		printSS(ros, result + cc);
	}
}
