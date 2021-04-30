package lecture_2;

import java.util.Scanner;

public class Inverse {

	public static void main(String[] args) {
		   Scanner s = new Scanner(System.in);
			int num = s.nextInt();
	        int counter=1;
	        int inv=0;
	        while(num!=0)
	        {
	            int rem=num%10;
	            int pow=1;
	            while(rem!=1)
	            {
	                pow=pow*10;
	                rem--;
	            }
	            inv=inv+counter*pow;
	            counter++;
	            num=num/10;;
	            
	        }
	       System.out.println(inv);
s.close();
	}

}
