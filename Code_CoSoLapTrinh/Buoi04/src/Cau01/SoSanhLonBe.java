package Cau01;

import java.util.Scanner;

public class SoSanhLonBe {

	private static Scanner hi;

	public static void main(String[] args) {
		hi = new Scanner(System.in);
		int so1, so2, so3, solon;
		
		System.out.println("Nhập số thứ nhất: ");
		so1 = hi.nextInt();
		System.out.println("Nhập số thứ hai: ");
		so2 = hi.nextInt();
		System.out.println("Nhập số thứ ba: ");
		so3 = hi.nextInt();
		
		solon = so1;
		if (solon < so2) solon = so2;
		if (solon < so3) solon = so3;
		
		System.out.println("Số lớn nhất trong ba số là: "+ solon);
}
}