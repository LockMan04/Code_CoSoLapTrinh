package Cau01;

import java.util.Scanner;

public class GiaiPhuongTrinhBacHai {
	static Scanner hi = new Scanner(System.in);
	static float a, b, c, D;
	public static void GiaiPTBacHai(float a, float b, float c) {
		if (a == 0) {
			if (b == 0) {
				System.out.println("PT vô nghiệm");
			} else {
				System.out.printf("PT có một nghiệm là x = %f", (- c / b));
			} 
			return;
		}
		D = b*b - 4*a*c;
		float x1;
		float x2;
		if (D < 0) {
			System.out.println("PT vô nghiệm");
		} else if (D == 0) {
			System.out.printf("PT có nghiệm kép x1 = x2 = %f", (-b / 2*a));
		}
		else {
			x1 = (float) ((-b + Math.sqrt(D)) / (2*a));
			x2 = (float) ((-b - Math.sqrt(D)) / (2*a));
			System.out.printf("PT có 2 nghiệm phân biệt x1 = %f, x2 = %f", x1, x2);
	}
		}
	
	public static void main(String[] args) {
		
		System.out.println("Nhập hệ số bậc 2:  ");
		a = hi.nextFloat();
		System.out.println("Nhập hệ số bậc 1: ");
		b = hi.nextFloat();
		System.out.println("Nhập hệ số tự do: ");
		c = hi.nextFloat();
		GiaiPTBacHai(a, b, c);
		
	}

}
