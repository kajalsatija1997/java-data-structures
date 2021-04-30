package lecture_3;

import java.util.Scanner;

public class Binary_to_decimal {

	public static void main(String[] args) {
		int bin=100000;
		int decimal=32;
		
		System.out.println("The decimal equivalent of " + bin);
		System.out.println(BinToDec(bin));
		System.out.println("The binary equivalent of: "+decimal);
		System.out.println(DecToBin(bin));
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int power1 = s.nextInt();
		System.out.println(AnyToDec(num,power1));
		s.close();

	}

	public static int BinToDec(int bin) {
		int rem;
		int dec = 0;
		int base = 1;
		while (bin != 0) {
			rem = bin % 10;
			dec = dec + rem * base;
			bin = bin / 10;
			base = base * 2;
		}
		return dec;
	}

	public static int DecToBin(int dec) {
		int rem, bin = 0, base = 1;
		while (dec != 0) {
			rem = dec % 10;
			if (rem == 1) {
			}
			bin = bin + rem * base;
			dec = dec / 10;
			base = base * 10;
		}

		return bin;
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
}
