package lecture5;

import java.util.Scanner;

public class Count_palindrome_substrings {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        countAllPalSS(str);
    }
    public static boolean isPalindrome(String str) {
		int left = 0, right = str.length() - 1;
		boolean flag = true;
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				flag = false;
				break;
			}
			left++;
			right--;
		}
		return flag;
	}
    public static void countAllPalSS(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String tocheck = str.substring(i, j);
				if (isPalindrome(tocheck)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}

