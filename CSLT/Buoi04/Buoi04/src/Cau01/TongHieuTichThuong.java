package Cau01;

import java.util.Scanner;

public class TongHieuTichThuong {

	private static Scanner hi;

	public static void main(String[] args) {
		hi = new Scanner(System.in);
		int a, b, tong, hieu, tich;
		float thuong;

		System.out.println("Nhập số thứ nhất: ");
		a = hi.nextInt();
		System.out.println("Nhập số thứ hai: ");
		b = hi.nextInt();
		
		tong = a + b;
		hieu = a - b;
		tich = a * b;
		
		System.out.println("Tổng là "+ tong);
		System.out.println("Hiệu là "+ hieu);
		System.out.println("Tích là "+ tich);
			if (b != 0);
		{
			thuong = (float) a/b;
			System.out.println("Thương là "+ thuong);
		}	
		
	}

}
