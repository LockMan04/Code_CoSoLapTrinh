package Cau02;

import java.util.Scanner;

public class TinhThoiGian {

	private static Scanner hi;

	public static void main(String[] args) {
		hi = new Scanner(System.in);
		double vantoc, quangduong, thoigian;
		
		System.out.println("Nhập vận tốc (Km/h) của xe: ");
		vantoc = hi.nextDouble();
		System.out.println("Nhập quãng đường (Km) của xe: ");
		quangduong = hi.nextDouble();
		
		thoigian = quangduong / vantoc;
		
		System.out.println("Thời gian (h) đi của xe là: " + thoigian);
				
		
	}

}
