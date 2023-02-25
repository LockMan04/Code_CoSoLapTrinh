package Cau02;

import java.util.Scanner;

public class TinhSoNgayTrongThang {

	private static Scanner hi;

	public static void main(String[] args) {
		hi = new Scanner(System.in);
		int thang, nam;
		
		System.out.println("Nhập tháng trong năm: ");
		thang = hi.nextInt();
		System.out.println("Nhập năm: ");
		nam = hi.nextInt();
		
		switch (thang) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: System.out.printf("Năm %d tháng %d có 31 ngày", nam, thang); break;
		
		case 4:
		case 6:
		case 9:
		case 11: System.out.printf("Năm %d tháng %d có 30 ngày", nam, thang); break;
		
		case 2:
			if (nam % 4 == 0 && nam % 100 ==0) {
				System.out.printf("Năm %d tháng 2 có 29 ngày", nam);
			}
			else {
				System.out.printf("Năm %d tháng 2 có 28 ngày", nam);
			}
			break;
		default: System.out.println("Nhập tháng không hợp lệ");
		}
		
	}

}
