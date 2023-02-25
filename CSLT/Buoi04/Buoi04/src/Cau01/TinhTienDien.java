package Cau01;

import java.util.Scanner;

public class TinhTienDien {

	private static Scanner hi;

	public static void main(String[] args) {
		hi = new Scanner(System.in);
		int dientruoc, diensau, dien;
		
		System.out.println("Nhập số điện tiêu thụ lúc trước: ");
		dientruoc = hi.nextInt();
		System.out.println("Nhập số điện tiêu thụ lúc sau: ");
		diensau = hi.nextInt();
		
		dien = diensau - dientruoc;
		
		if (dien < 0) 
			System.out.println("Nhập sai dữ liệu");
		else if (dien < 100) 	
			System.out.println("Tiền điện là: "+ dien * 1200);
		else if (dien < 250)
			System.out.println("Tiền điện là: "+ dien * 1500);
		else if (dien < 401)
			System.out.println("Tiền điện là: "+ dien * 2300);
		else 
			System.out.println("Tiền điện là: "+ dien * 3000);
	}

}
