package Lecture6;

public class Inverted_triangle_pattern {

	public static void main(String[] args) {
		printPattern(5,1,1);

	}
	public static void printPattern(int N, int row, int col) {
		if(row>N){
			return;
		}
		if(col>row){
			System.out.println();
			printPattern(N, row+1, 1);
			return;
		}
		System.out.print("*\t");
		printPattern(N, row, col+1);
	}
}
