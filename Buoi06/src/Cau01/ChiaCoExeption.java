package Cau01;

import java.util.Scanner;

public class ChiaCoExeption {
	public static void main(String[] args) {
		Scanner hi = new Scanner(System.in);
		int a, b;
		
		try {
			System.out.println("Nhập số chia a = ");
			a = hi.nextInt();
			System.out.println("Nhập số chi b = ");
			b = hi.nextInt();
			System.out.println("Kết quả phép chia: "+ (a / b));
		}
		catch (Exception e) {
			System.out.println("Xảy ra lỗi");
		}
		
	}
}
