package Lecture6;

import java.util.Scanner;

public class is_reverse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str=s.next();
		String str2=s.next();
		String str1=isReverse(str);
		System.out.println(check(str1,str2));
	}

	public static String isReverse(String str) {
        if (str.length() < 2) {
            return str;
        }
    return isReverse(str.substring(1)) + str.charAt(0);

    }
	public static boolean check(String str1,String str2) 
	{ if(str1.equals(str2))
	{
		return true;
	}
	else
		return false;
}
}
