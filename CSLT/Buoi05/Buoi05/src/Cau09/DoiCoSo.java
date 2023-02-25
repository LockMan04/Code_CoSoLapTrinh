package Cau09;

import java.util.Scanner;

public class DoiCoSo {
	static Scanner hi = new Scanner(System.in);
	static final char CHAR_55 = 55;
	
	private static String DCS(int n, int b)	 {
		if (n < 0 || b < 2 || b > 16) {
			return " ";
		}
		StringBuffer sb = new StringBuffer();
		int m;
		int test = n;
		
		while (test > 0) {
			if (b > 10) {
				m = test % b;
				if (m >= 10) {
					sb.append((char)(CHAR_55 + m));
				} else {
					sb.append(m);
				}
			} else {
				sb.append(test % b);
			}
			return sb.reverse().toString();
		}
		return null;
	}
	public static void main(String[] args) {
		int n = 15;
		System.out.println("Nhập số hệ thập phân n: ");
		n = hi.nextInt();
		System.out.println("Số "+ n +" trong hệ cơ số 2 = "+ DCS(n, 2));
		System.out.println("Số "+ n +" trong hệ cơ số 8 = "+ DCS(n, 8));
		System.out.println("Số "+ n +" trong hệ cơ số 16 = "+ DCS(n, 16));
	}
}
