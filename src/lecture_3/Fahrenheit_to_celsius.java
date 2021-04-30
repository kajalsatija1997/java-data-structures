package lecture_3;

public class Fahrenheit_to_celsius {

	public static void main(String[] args) {
		int F = 0;
		int C;
		for (F = 0; F <= 100; F += 20) {
			C =(int) (5.0 / 9 * (F - 32));
			if(C<0)
			{
				C=-C;
			}
			System.out.println(F+"\t"+C);
		}

	}

}
