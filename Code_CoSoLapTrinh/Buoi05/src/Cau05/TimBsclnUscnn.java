package Cau05;

import java.util.Scanner;

public class TimBsclnUscnn {
	static Scanner hi = new Scanner(System.in);

	public static int USCLN(int a, int b) {
		if (b == 0)
			return a;
		return USCLN(b, a % b);
	}

	public static int BSCNN(int a, int b) {
		return (a * b) / USCLN(a, b);
	}

	public static void main(String[] args) {

		System.out.println("Nhập số nguyên dương thứ nhất: ");
		int a = hi.nextInt();
		System.out.println("Nhập số nguyên dương thứ hai: ");
		int b = hi.nextInt();

		System.out.printf("USCLN của %d và %d là: %d\n", a, b, USCLN(a, b));
		System.out.printf("BSCNN của %d và %d là: %d\n", a, b, BSCNN(a, b));
	}
}
