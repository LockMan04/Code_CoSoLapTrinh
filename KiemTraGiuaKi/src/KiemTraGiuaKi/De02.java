package KiemTraGiuaKi;

import java.util.Scanner;

public class De02 {
	static Scanner hi = new Scanner(System.in);
	static int n, sum = 0, thang, nam, nhap, tb = 0;

	private static void TrungBinhSo() {
		try {
			do {
				System.out.println("Nhập só nguyên n: ");
				n = hi.nextInt();
				if (n < 1 || n > 20)
					System.out.println("Vui lòng nhập số trong khoảng từ 1 đến 20");
				for (int i = 1; i <= n; i++) {
					if (i % 2 == 0 && i % 4 != 0) {
						sum += i;
						tb++;
					}
				}
				if (n > 0 && n <= 20) {
					System.out.println("Trung bình cộng các số là: " + (float) sum / tb);
				}
			} while (n < 1 || n > 20);
		} catch (Exception e) {
			System.out.println("Lỗi nhập liệu");
		}
	}

	private static void TinhSoNgay() {
		try {
			do {
				System.out.println("Nhập tháng: ");
				thang = hi.nextInt();
				System.out.println("Nhập năm: ");
				nam = hi.nextInt();
				if (thang > 12 || thang < 1 || nam < 1900 || nam > 3200)
					System.out.println("Nhập không hợp lệ hãy nhập lại");
			} while (thang < 0 || thang > 12 || nam < 1900 || nam > 3200);

			switch (thang) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.printf("Tháng %d năm %d có 31 ngày", thang, nam);
				break;

			case 4:
			case 6:
			case 9:
			case 11:
				System.out.printf("Tháng %d có 30 ngày", thang);
				break;

			case 2:
				if (nam % 4 == 0) {
					System.out.printf("Tháng %d năm %d là năm nhuận nên có 29 ngày", thang, nam);
				} else {
					System.out.printf("Tháng %d năm %d là năm không nhuận nên có 28 ngày", thang, nam);
				}
			}
		} catch (Exception e) {
			System.out.println("Lỗi Nhập Liệu");
		}
	}

	public static void main(String[] args) {
		do {
			System.out.println("*****************************");
			System.out.println("*1. Tính Trung Bình Số      *");
			System.out.println("*2. Tính Số Ngày            *");
			System.out.println("*3. Kết Thúc Chương Trình   *");
			System.out.println("*****************************");
			try {
				nhap = hi.nextInt();
			
			switch (nhap) {
			case 1:
				TrungBinhSo();
				break;
			case 2:
				TinhSoNgay();
				break;
			case 3:
				System.out.println("Chương Trình Đã Kết Thúc");
				break;
			}
			} catch (Exception e) {
				System.out.println("Lỗi Nhập Liệu Vui Lòng Nhập Lại");
			}

			
			if (nhap !=3) {
				hi.nextLine();
				System.out.println("\nTap Enter To Continue");
				String test = hi.nextLine();
			}
		} while (nhap != 3);
	}
}
