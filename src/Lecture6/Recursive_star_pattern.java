package Lecture6;

public class Recursive_star_pattern {

	public static void main(String[] args) {
		Recursive_pattern(5,0,0);
	}
	public static void Recursive_pattern(int N,int row,int col)
	{
		if(row>N)
		{
			return;
		}
		Recursive_pattern(N,row+1,col+1);
		row++;
		col++;
	}

}
