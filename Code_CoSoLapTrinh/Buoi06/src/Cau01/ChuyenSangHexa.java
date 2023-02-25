package Cau01;

import java.util.Scanner;

public class ChuyenSangHexa {
	public static void main(String[] args) {
		Scanner hi = new Scanner(System.in);
		Integer intNumber = null;

		try {
			System.out.println("Hãy nhập vào một số nguyên: ");
			String StrNumber = hi.nextLine();
			intNumber = Integer.parseInt(StrNumber);
			System.out.println("Chuyển thành Hexa: " + Integer.toHexString(intNumber));
		} catch (NumberFormatException e) {
			System.out.println("Vui lòng nhập vào số nguyên");

		}
	}
}