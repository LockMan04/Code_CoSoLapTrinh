package Cau02;

import java.util.Scanner;

public class DoiSangGiay {

	private static Scanner time;

	public static void main(String[] args) {
		time = new Scanner(System.in);
		int gio, phut, giay;
		
		System.out.println("Nhập giờ: ");
		gio = time.nextInt();
		System.out.println("Nhập phút: ");
		phut = time.nextInt();
		System.out.println("Nhập giây: ");
		giay = time.nextInt();
		
		giay = gio*3600 + phut*60 + giay;
		
		System.out.println("Số giây là: " + giay );
	}

}
