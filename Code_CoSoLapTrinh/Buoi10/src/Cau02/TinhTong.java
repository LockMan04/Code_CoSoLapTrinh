package Cau02;

import java.util.Scanner;

public class TinhTong {
	static Scanner hi = new Scanner(System.in);
	static int n;
	static float tong = 0, temp = 0;

	private static void TinhTong(int n) {
		for (int i = 1; i <= n; i++) {
			temp = (float) temp + i;
			tong = (float) i / temp + (float) tong;
		}
		System.out.println("Tổng là: " + tong);
	}

	public static void main(String[] args) {
		try {
			do {
				System.out.println("Nhập số nguyên dương n: ");
				n = hi.nextInt();

				if (n < 1 || n > 50)
					System.out.println("N CHỈ TRONG KHOẢNG TỪ 0 ĐẾN 50");
				else
					TinhTong(n);
			} while (n < 1 || n > 50);
		} catch (Exception e) {
			System.out.println("Lỗi Nhập Liệu");
		}
	}
}
