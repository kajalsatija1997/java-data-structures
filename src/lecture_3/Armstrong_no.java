package lecture_3;

import java.util.Scanner;

public class Armstrong_no {

	public static void main(String[] args) {
		int num,c,n,r,sum;
		Scanner s = new Scanner(System.in);
		int n1= s.nextInt();
		int n2 = s.nextInt();
		for(num=n1;num<=n2;num++)
		{
		n=num;
		sum=0;
		while(n>0)
		{
		r=n%10;
		c=r*r*r;
		sum=sum+c;
		n=n/10;}
		if(num==sum)
	    System.out.println(num);
	 	}
		s.close();
	}

}
