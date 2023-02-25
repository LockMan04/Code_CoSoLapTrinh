package Cau02;

import java.util.Scanner;

public class TongChuaSo {

	private static Scanner huhu;

	public static void main(String[] args) {
		huhu = new Scanner(System.in);
		int soNguyen, phanNguyen, phanDu, tong;
		
		System.out.println("Số Nguyên N:");
		soNguyen = huhu.nextInt();
		
		phanNguyen = soNguyen/10;
		phanDu = soNguyen%10;
		tong = phanNguyen + phanDu;
		
		System.out.println("Tổng của số nguyên N là: "+ tong);
		
		
	}

}
