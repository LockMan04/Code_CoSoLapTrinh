package Cau01;

import java.util.Scanner;

public class TinhTong {
	static Scanner hi = new Scanner(System.in);
	static int n;
	static float tong = 0, a;

	private static void TinhTong(int n, float a) {
		for (int i = 1; i <= n; i++) {
			tong = (float) (1 / Math.pow(a, i)) + (float) tong;
		}
		System.out.println("Tổng là: " + tong);
	}

	public static void main(String[] args) {
		try {
			do {
				System.out.println("Nhập số nguyên dương n: ");
				n = hi.nextInt();
				System.out.println("Nhập số thực a > 0");
				a = hi.nextFloat();

				if (n < 1 || n > 10)
					System.out.println("N CHỈ TRONG KHOẢNG TỪ 0 ĐẾN 10");
				if (a < 0)
					System.out.println("A LÀ SỐ THỰC LỚN HƠN 0");
			} while (n < 1 || n > 10 || a < 0);
			TinhTong(n, a);
		} catch (Exception e) {
			System.out.println("Lỗi Nhập Liệu");
		}
	}
}
