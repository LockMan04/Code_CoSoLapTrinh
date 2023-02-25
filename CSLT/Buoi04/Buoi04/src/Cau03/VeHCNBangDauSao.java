package Cau03;

import java.util.Scanner;

public class VeHCNBangDauSao {

	private static Scanner hi;

	public static void main(String[] args) {
		hi = new Scanner(System.in);
		int m, n;
		
		System.out.println("Nhập chiều dài hình chữ nhật: ");
		n = hi.nextInt();
		System.out.println("Nhập chiều rộng hình chữ nhật: ");
		m = hi.nextInt();
		
		if (m > n)
			System.out.println("Nhập sai dữ liệu");
		else { System.out.println("");
		
			for (int x = 1; x <= m; x++)
			{
				for (int y = 1; y <= n; y++) 
					{
					System.out.print("*");
					}
			System.out.println("");
		}
		}
}
}