package lecture_3;

public class Anytoany {

	public static void main(String[] args) {
	
	}
	public static int AnyToDec(int num,int sb) 
	{
		int rem;
		int dec = 0;
		int base = 1;
		while (num != 0) 
		{
			rem = num % 10;
			dec = dec + rem * base;
			num = num/ 10;
			base = base * sb;
		}
		return dec;
	}
	public static int DecToAny(int num1,int db) {
		int rem, bin = 0, base = 1;
		while (num1 != 0) {
			rem = num1 % 2;
//			if (rem == 1) {
//				count++;
//			}
			bin = bin + rem * base;
			num1 = num1 / 2;
			base = base * db;
		}

		return bin;
	}
//	public static int AnyToAny() {
//		AnytoDec(num,sb)
//	}
	
}

