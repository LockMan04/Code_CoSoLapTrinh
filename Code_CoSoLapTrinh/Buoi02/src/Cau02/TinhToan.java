package Cau02;

import java.util.Scanner;

public class TinhToan {

	private static Scanner tinh;

	public static void main(String[] args) {
		tinh = new Scanner(System.in);
		int a, b, tong, hieu, tich, thuong;
		
		System.out.println("Nhập số nguyên a: ");
		a = tinh.nextInt();
		System.out.println("Nhập số nguyên b: ");
		b = tinh.nextInt();
		
		tong = a + b;
		hieu = a - b;
		tich = a * b;
		thuong = a / b;
		
		System.out.println("Tổng của a và b là: " + tong);
		System.out.println("Hiệu của a và b là: " + hieu);
		System.out.println("Tích của a và b là: " + tich);
		System.out.println("Thương của a và b là: " + thuong);
	}

}
