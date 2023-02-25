package Cau03;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
	static Scanner hi = new Scanner(System.in);

	public static boolean SNT(int n) {
		if (n < 2) {
			return false;
		}
		int SR = (int) Math.sqrt(n);
		for (int i = 2; i <= SR; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Các số nguyên tố nhỏ hơn 100 là: ");
		for (int i = 0; i < 100; i++) {
			if (SNT(i)) {
				System.out.print(i + " ");
			}
		}
	}

}
