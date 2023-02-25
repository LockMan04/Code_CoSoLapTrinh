package Cau02;

import java.util.Scanner;

public class GiayDoiSang {

	private static Scanner time;

	public static void main(String[] args) {
		time = new Scanner(System.in);
		int giay, phut, gio;
		
		System.out.println("Nhập thời gian của công việc: ");
		giay = time.nextInt();
		
		gio = giay/3600;
		phut = giay%3600/60;
		giay = giay%3600%60;
		
		System.out.println("Số giờ là: " + gio);
		System.out.println("Số phút là: " + phut);
		System.out.println("Số giây là: " + giay);
	}

}
