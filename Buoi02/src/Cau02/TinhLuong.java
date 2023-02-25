package Cau02;

import java.util.Scanner;

public class TinhLuong {

	private static Scanner hehe;

	public static void main(String[] args) {
		hehe = new Scanner(System.in);
		int luongNgay, ngayCong, luongThang;
		
		System.out.println("Lương ngày:");
		luongNgay = hehe.nextInt();
		
		System.out.println("Ngày công:");
		ngayCong = hehe.nextInt();
		
		luongThang = luongNgay * ngayCong;
		
		System.out.println("Lương tháng là:" + luongThang);
	}

}