package Cau01;

import java.util.Scanner;

public class DiemDat {

	private static Scanner hi;

	public static void main(String[] args) {
		hi = new Scanner(System.in);
		int diem;
		
		System.out.println("Nhập điểm trung bình của của học sinh: ");
		diem = hi.nextInt();
		
		if (diem < 0 || diem > 10) 
			System.out.println("Vui lòng nhập điểm hợp lệ");
		else if (diem >= 5)
			System.out.println("ĐẠT");
		else System.out.println("KHÔNG ĐẠT");
	}

}
