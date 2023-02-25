package Cau03;

import java.util.Scanner;

public class KiemTraSoNguyenTo {

	private static Scanner hi;

	public static void main(String[] args) {
		hi = new Scanner(System.in);
		int n, du, i;

		
		System.out.println("Nhập một số nguyên dương: ");
		n = hi.nextInt();
		
		if ( n > 1 && n < 4)
			System.out.printf("%d là số nguyên tố", n);
		else if (n <= 0)
			System.out.println("Hãy nhập số nguyên dương");
		else {
		i = 2; du = 0;
		while (i <= n / 2)
		{
			du = n % i;
			if (du == 0) break;
		i++;
		}
		if (du == 0)
			System.out.printf("%d không phải là số nguyên tố", n);
		else 
			System.out.printf("%d là số nguyên tố", n);
	}
	}
}
