package Cau02;

import java.util.Scanner;

public class GiaiThuaDeQuy {
	static Scanner hi = new Scanner(System.in);
	static int n; 
	public static long TinhGiaiThua(int n) {
		if (n > 0) {
			return n * TinhGiaiThua(n - 1);
		} else {
			return 1;
		}
	}
	public static void main(String[] args) {
		System.out.println("Nhập số cần tính giai thừa: ");
		n = hi.nextInt();
		
		System.out.printf("Giai thừa của %d là: %d", n, (TinhGiaiThua(n)));
	}

}
