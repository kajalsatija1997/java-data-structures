package lecture_2;

public class diamond_pattern {

	public static void main(String[] args) {
		int n=4;
		int row=1;
		int col =1;
		int value;
		while(row!=0){
			col=1;
			while(col<=n-row)
			{
				System.out.print(" ");
				 col++;
			}
			col=1;	
			value=row;
			while(col<=row)
			{
				System.out.print(value);
				value++;
				col++;
			}
			col=1;
			value=value-2;
			while(col<row)
			{
				System.out.print(value);
				value--;
				col++;
			}
			System.out.println();
			row++;
			}

	}

}
