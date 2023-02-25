package Cau01;

import java.util.Scanner;

public class XepLoaiHocLuc {

	private static Scanner hi;

	public static void main(String[] args) {
		hi = new Scanner(System.in);
		int diem;

		System.out.println("Nhập điểm trung bình của học sinh: ");
		diem = hi.nextInt();
		
		if (diem < 0 || diem > 10)
			System.out.println("Vui lòng nhập điểm hợp lệ");
		else if (diem >= 0 && diem < 5) 
			System.out.println("YẾU");
		else if (diem >= 5 && diem < 7)
			System.out.println("TRUNG BÌNH");
		else if (diem >= 7 && diem < 8)
			System.out.println("KHÁ");
		else if (diem >= 8 && diem < 10)
			System.out.println("GIỎI");
		else if (diem <= 10)
			System.out.println("XUẤT SẮC");
	
	}

}
