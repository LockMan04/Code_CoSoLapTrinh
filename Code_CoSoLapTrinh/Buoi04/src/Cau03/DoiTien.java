package Cau03;

import java.util.Scanner;

public class DoiTien {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int tien;
		String ltien, ll = "y";
		
		if (ll.equalsIgnoreCase("y")) 
	do {	
		System.out.println("Nhập số tiền muốn đổi: ");
		tien = in.nextInt();
		in.nextLine();
		System.out.println("Nhập loại tiền muốn đổi dưới đây");
		System.out.println("--- USD --- EUR --- GBP --- JPY ---");
		ltien = in.nextLine();
		
		if (ltien.equalsIgnoreCase("usd")) 
			System.out.printf("%d VNĐ = %d USD\n", tien, tien * 21380);
		else if (ltien.equalsIgnoreCase("eur"))
			System.out.printf("%d VNĐ = %d EUR\n", tien, tien * 23555);
		else if (ltien.equalsIgnoreCase("gbp"))
			System.out.printf("%d VNĐ = %d GBP\n", tien, tien * 32622);
		else if (ltien.equalsIgnoreCase("jpy"))
			System.out.printf("%d VNĐ = %d JPY\n", tien, tien * 178);
		else if (ll.equalsIgnoreCase("y")) 
		System.out.println("Hãy chọn đúng loại tiền muốn đổi");
		System.out.println("\n-------------------------------	");
		System.out.println("  Bạn có muốn đổi tiếp không?		");
		System.out.println("--------Y-------------N--------		");
		ll = in.nextLine();  
	
	} while (ll.equalsIgnoreCase("y"));
		if (ll.equalsIgnoreCase("n"))
		System.out.println("Chương Trình Đã Kết Thúc");
		else 
			System.out.println("Kết Thúc Chương Trình Do Nhập Sai");
	}
}
