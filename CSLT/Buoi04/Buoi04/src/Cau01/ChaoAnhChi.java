package Cau01;

import java.util.Scanner;

public class ChaoAnhChi {

	private static Scanner hi;

	public static void main(String[] args) {
		hi = new Scanner(System.in);
		String ten, gioitinh;
		
		System.out.println("Nhập họ và tên: ");
		ten = hi.nextLine();
		System.out.println("Nhập giới tính: ");
		gioitinh = hi.nextLine();
		
		if (gioitinh.equalsIgnoreCase("Nam")) 
			System.out.printf("Chào anh %s", ten);
		else if (gioitinh.equalsIgnoreCase("Nu")) 
			System.out.printf("Chào chị %s", ten);
		else if (gioitinh.equalsIgnoreCase("Nữ")) 
			System.out.printf("Chào chị %s", ten);
		else 
			System.out.println("Vui lòng nhập đúng giới tính");
	}

}
