package Cau02;

import java.util.Scanner;

public class DoiTSoToTien {

	private static Scanner hi;

	public static void main(String[] args) {
		hi = new Scanner(System.in);
		int tien, doi100, doi50, doi20, doi10, doi5, doi2, doi1;
		
		System.out.println("Nhập số tiền cần đổi: ");
		tien = hi.nextInt();
		
		doi100 = tien / 100;
		doi50 = tien % 100 / 50;
		doi20 = tien % 100 % 50 / 20;
		doi10 = tien % 100 % 50 % 20 / 10;
		doi5 = tien % 100 % 50 % 20 % 10 / 5;
		doi2 = tien % 100 % 50 % 20 % 10 % 5 / 2;
		doi1 = tien % 100 % 50 % 20 % 10 % 5 % 2;

		System.out.println("Số tờ 100	: " + doi100);
		System.out.println("Số tờ 50	: " + doi50);
		System.out.println("Số tờ 20	: " + doi20);
		System.out.println("Số tờ 10	: " + doi10);
		System.out.println("Số tờ 5		: " + doi5);
		System.out.println("Số tờ 2		: " + doi2);
		System.out.println("Số tờ 1		: " + doi1);
	
	}

}
