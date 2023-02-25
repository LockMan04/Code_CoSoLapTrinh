package KiemTraGiuaKi;

import java.util.Scanner;

public class De01 {
	static Scanner sc = new Scanner(System.in);
	static int n, x1, x2, y2, y1, sum = 0, tb = 0, A;
	static float khoangcach;

	private static void TrungBinhSoLe() {
		try {
			do {
				System.out.println("Hãy nhập một số nguyên trong khoảng 2 - 20: ");
				A = sc.nextInt();
				if (A <= 1 || A > 20)
					System.out.println("Không nằm trong giới hạn, xin thử lại");
			} while (A <= 1 || A > 20);
			for (int i = 1; i <= 2 * A + 1; i++) {
				if (i % 2 != 0) {
					sum = sum + i;
					tb++;
				}
			}
			if (A > 1 && A <= 20)
				System.out.println("Trung bình cộng số lẻ là: " + (float) sum / tb);
		} catch (Exception e) {
			System.out.println("Lỗi Nhập Liệu");
		}
	}

	private static void TinhKhoangCach() {
		try {
			System.out.println("Nhập x1 =");
			x1 = sc.nextInt();
			System.out.println("Nhập y1 =");
			y1 = sc.nextInt();
			System.out.println("Nhập x2 =");
			x2 = sc.nextInt();
			System.out.println("Nhập y2 =");
			y2 = sc.nextInt();

			khoangcach = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
			System.out.println("Khoảng cách: " + khoangcach);
		} catch (Exception e) {
			System.out.println("Lỗi khi nhập dữ liệu");
		}
	}

	public static void main(String[] args) {
		do {
			try {
				System.out.println("*********************************");
				System.out.println("*1. Tính Trung Bình Cộng Số Lẻ  *");
				System.out.println("*2. Tính Khoảng Cách            *");
				System.out.println("*3. Kết Thúc Chương Trình       *");
				System.out.println("*********************************");
				n = sc.nextInt();

				switch (n) {
				case 1:
					TrungBinhSoLe();
					break;
				case 2:
					TinhKhoangCach();
					break;
				case 3:
					System.out.println("Chương Trình Đã Kết Thúc");
				}
			} catch (Exception e) {
				System.out.println("Lỗi, chỉ được nhập từ 1 - 3");
			} 
			if (n !=3) {
				sc.nextLine();
			System.out.println("Tap Enter To Continue");
			String hi = sc.nextLine();
			}
		} while (n != 3);
	}
}
