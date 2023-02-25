package Cau02;

import java.util.Scanner;

public class TongHieuTichThuong {

	private static Scanner hi;

	public static void main(String[] args) {
		hi = new Scanner(System.in);
		int a, b, pt;
		
		System.out.println("Nhập chữ số thứ nhất: ");
		a = hi.nextInt();
		System.out.println("Nhập chữ số thứ hai: ");
		b = hi.nextInt();
		System.out.println("Nhập các phép toán (+, -, *, /): ");
		pt = hi.next().charAt(0);
		
		switch (pt)
		{ 
		case '+': System.out.println("Tổng = "+ (a + b)); break;
		case '-': System.out.println("Hiệu = "+ (a - b)); break;
		case '*': System.out.println("Tích = "+ (a * b)); break;
		case '/': 
			if (b != 0)
			{
				System.out.println("Thương = "+ ((float) a/b));
			}
			else
			{
				System.out.println("Mẫu phải khác 0");
			}
			break;
		default: System.out.println("Bạn chọn phép toán không đúng");
		}	
	}
}