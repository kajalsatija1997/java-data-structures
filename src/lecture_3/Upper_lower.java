package lecture_3;

import java.util.Scanner;

public class Upper_lower {

	public static void main(String[] args) {
		 char ch;
         Scanner reader = new Scanner(System.in);
         ch = reader.next().trim().charAt(0);
		   if(ch>=65&&ch<=90)
		   {
			   System.out.println("U");
		   }
		   else
			   {
			   if(ch>=97&&ch<=122)
			   {
				   System.out.println("L");
			   }
			   else
			   {
				   System.out.println("I");
			   }
			   }
		   reader.close();
		   
		// TODO Auto-generated method stub

	}

}
