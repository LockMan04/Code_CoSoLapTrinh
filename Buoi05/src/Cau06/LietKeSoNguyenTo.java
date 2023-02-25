package Cau06;

import java.util.Scanner;

public class LietKeSoNguyenTo {
	static Scanner hi = new Scanner(System.in);

	private static boolean SNT(int n) {
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
		System.out.println("Nhập n: ");
		int n = hi.nextInt();
		System.out.printf("Tất cả các số nguyên tố nhỏ hơn %d là: \n", n);
		if (n >= 2) {
			System.out.print(2);
		}
		for (int i = 3; i < n; i+=2) {
			if (SNT(i)) {
				System.out.print(" "+ i);
			}
		}
	}
}
