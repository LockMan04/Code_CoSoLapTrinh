package Cau08;

import java.util.Scanner;

public class TongChuSo {
	static Scanner hi = new Scanner(System.in);
	static int n, e = 10;
	private static int TongChuSo(int n) {
		int test = 0;
		do {
			test = test + n % e;
			n = n / e;
		} while (n > 0);
		return test;
	}
	public static void main(String[] args) {
		System.out.println("Nhập số nguyên dương n: ");
		n = hi.nextInt();
		System.out.printf("Tổng các chữ số của %d là: %d", n, TongChuSo(n));
	
	
	}
}
