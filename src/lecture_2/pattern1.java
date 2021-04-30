package lecture_2;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int row=1;
		int col =1;
		int value;
		while(row<=n){
			col=1;
			while(col<=n-row)
			{
				System.out.print("\t");
				 col++;
			}
			col=1;	
			value=row;
			while(col<=row)
			{
				System.out.print(value+"\t");
				value++;
				col++;
			}
			col=1;
			value=value-2;
			while(col<row)
			{
				System.out.print(value+"\t");
				value--;
				col++;
			}
			System.out.println();
			row++;
			}
		
s.close();
	}

}
