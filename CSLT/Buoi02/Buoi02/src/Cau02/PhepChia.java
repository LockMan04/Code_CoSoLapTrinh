package Cau02;

import java.util.Scanner;

public class PhepChia {

	private static Scanner hihi;

	public static void main(String[] args) {
		hihi = new Scanner(System.in);
		int soChia, soBiChia, phanNguyen, phanDu;
		
		System.out.println("Số chia:");
		soChia = hihi.nextInt();
		System.out.println("Số bị chia:");
		soBiChia = hihi.nextInt();

		phanNguyen = soChia / soBiChia;
		phanDu = soChia % soBiChia;
		
		System.out.println("Phần nguyên là: " + phanNguyen);
		System.out.println("Phần dư là: " + phanDu);
		
	}

}
