package Lecture6;

import java.util.Scanner;

public class is_palindrome_string {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        String str = s.nextLine();
	        System.out.println(isPal(str));
	    }
	public static boolean isPal(String s)
    {  if(s.length() == 0 || s.length() == 1)
            return true; 
        if(s.charAt(0) == s.charAt(s.length()-1))
        return isPal(s.substring(1, s.length()-1));
        return false;
    }
}
