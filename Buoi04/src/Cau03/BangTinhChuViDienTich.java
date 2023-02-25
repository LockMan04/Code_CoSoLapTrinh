package Cau03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BangTinhChuViDienTich {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int r, cd, cr, day1, day2, canhb1, canhb2, h;
		final double pi = 3.14;
		int zz = 0;
		
	if (zz >= 0 || zz <= 3)
	do {
		
		System.out.println("*********************************");
		System.out.println("*   Tính Diện Tích -  Chu Vi	*");
		System.out.println("* 1 - Hình Tròn			*");
		System.out.println("* 2 - Hình Chữ Nhật		*");
		System.out.println("* 3 - Hình Thang		*");
		System.out.println("* 4 - Thoát chương trình	*");
		System.out.println("*********************************");
		zz = in.nextInt();
		DecimalFormat tron = new DecimalFormat("0.00");
		
		switch (zz) {
		case 1: System.out.println("Nhập bán kính hình tròn: "); 
				   	 r = in.nextInt();
					 System.out.println("Chu Vi Hình Tròn Là: "+  tron.format(2*pi*r));
					 System.out.println("Diện Tích Hình Tròn Là: "+ tron.format(r*r*pi)); break;
		case 2: do { System.out.println("Nhập chiều dài của hình chữ nhật: ");
					 cd = in.nextInt();
					 System.out.println("Nhập chiều rộng hình chữ nhật: ");
					 cr = in.nextInt();
					 System.out.println("Chu Vi Hình Chữ Nhật Là: "+ ((cd + cr)*2));
					 System.out.println("Diện Tích Hình Chữ Nhật Là: "+ (cd*cr));
				if (cd < cr) System.out.println("Đã nhập sai cạnh vui lòng nhập lại"); }
				while (cd < cr); break;
		case 3: System.out.println("Nhập chiều cao hình thang: ");
					h = in.nextInt();
					System.out.println("Nhập cạnh đáy 1 hình thang: ");
					day1 = in.nextInt();	
					System.out.println("Nhập cạnh đáy 2 hình thang: ");
					day2 = in.nextInt();
					System.out.println("Nhập cạnh bên 1 hình thang: ");
					canhb1 = in.nextInt();
					System.out.println("Nhập cạnh bên 2 hình thang: ");
					canhb2 = in.nextInt();
					System.out.println("Chu Vi Hình Thang Là: "+ (day1 + day2 + canhb1 + canhb2));
					System.out.println("Diện Tích Hình Thang Là: "+ tron.format(h*(day1 + day2)/2)); break;
		case 4: System.out.println("Chương Trình Đã Kết Thúc"); break;
		default: System.out.println("Chỉ Được Chọn Từ 1 - 4");
	} 
	} while (zz != 4 || zz == 0);
	
	}
}
