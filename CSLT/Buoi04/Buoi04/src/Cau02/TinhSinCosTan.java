package Cau02;

import java.util.Scanner;

public class TinhSinCosTan {

	private static Scanner hi;

	public static void main(String[] args) {
		hi = new Scanner(System.in);
		double a;
		char q;
		
		System.out.println("Nhập số: ");
		a = hi.nextDouble();
		hi.nextLine();
		System.out.println("Nhập s hoặc c hoặc t: ");
		q = hi.next().charAt(0);
			
		switch (q) {
		case 's' : System.out.println("Sin là: "+ (Math.sin(a))); break;
		case 'c' : System.out.println("Cos là: "+ (Math.cos(a))); break;
		case 't' : System.out.println("Tan là: "+ (Math.tan(a))); break;
		default : System.out.println("Vui lòng nhập hợp lệ");
		}
	}

}
