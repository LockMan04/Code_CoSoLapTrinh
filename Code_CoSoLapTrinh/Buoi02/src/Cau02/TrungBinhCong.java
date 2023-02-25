package Cau02;

import java.util.Scanner;

public class TrungBinhCong {

	private static Scanner so;

	public static void main(String[] args) {
		so = new Scanner(System.in);
		int a, b, c, d, tbCong;
		
		System.out.println("Nhập số nguyên a: ");
		a = so.nextInt();
		System.out.println("Nhập số nguyên b: ");
		b = so.nextInt();
		System.out.println("Nhập số nguyên c: ");
		c = so.nextInt();
		System.out.println("Nhập số nguyên d: ");
		d = so.nextInt();
		
		tbCong = (a+b+c+d)/4;
					
		System.out.println("Trung bình cộng của 4 số là: " + tbCong);
	}

}
