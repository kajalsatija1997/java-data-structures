package lecture5;

public class Characters_string {

	public static void main(String[] args) {
		String s = "Hello";
		//printchars(s);
		//substrings(s);
		//palindrome(s);

	}

	public static void printchars(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}

	public static void substrings(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
		}
	}

//	public static void palindrome(String s) {
//		boolean flag = true;
//		for (int i = 0; i < s.length(); i++) {
//			char k=s.charAt(i);
//		}
//			for (int j = s.length(); j >= 0; j--) {
//				char l=s.charAt(j);
//				}
//			if(k==l)
//			{
//				System.out.println(flag);
//			}
//
//		
//	}
}
