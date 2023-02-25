package Cau02;

import java.util.Scanner;

public class GiaiThuaKhongDeQuy {
	static Scanner hi = new Scanner(System.in);
	static long giaithua = 1;
	static int n;
	public static long TinhGiaiThua(int n) {
		 if (n == 0 || n == 1) {
			 return giaithua;
		 } else {
			 for (int i = 2; i <= n; i++) {
				 giaithua *=i;
			 }
			 return giaithua;
		 }
	}
	public static void main(String[] args) {
	System.out.println("Nhập số cần tính giai thừa: ");	
	n = hi.nextInt();
	
	System.out.printf("Giai thừa của %d là: %d", n, (TinhGiaiThua(n)));
	}
}
