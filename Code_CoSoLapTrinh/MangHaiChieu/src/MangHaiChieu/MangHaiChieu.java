package MangHaiChieu;

import java.util.Scanner;

public class MangHaiChieu {
	static Scanner hi = new Scanner(System.in);
	static int n, sodong, socot;
	static int[][] A;

	public static void main(String[] args) {
		System.out.println("Nhập số dòng của mảng hai chiều: ");
		sodong = hi.nextInt();
		System.out.println("Nhập số cột của mảng hai chiều: ");
		socot = hi.nextInt();

		int A[][] = new int[sodong][socot];
		for (int i = 0; i < sodong; i++) {
			for (int j = 0; j < socot; j++) {
				System.out.printf("Phần tử thứ [%d,%d] là: ", i, j);
				A[i][j] = hi.nextInt();
			}
		}
		System.out.println("Mảng hai chiều của bạn là: ");
		for (int i = 0; i < sodong; i++) {
			for (int j = 0; j < socot; j++) {
				System.out.print(A[i][j] + "\t");
			}
			System.out.println(" ");
		}

		int tich = 1;
		if (sodong != socot)
			System.out.println("Không thể tính tích đường chéo chính");
		else {
			for (int i = 0; i < sodong; i++) {
				tich = tich * A[i][i];
			}
			System.out.println("Tích đường chéo chính là: " + tich);
		}

		System.out.print("Nhập số cần đếm: ");
		n = hi.nextInt();

		int dem = 0;
		for (int i = 0; i < sodong; i++) {
			for (int j = 0; j < socot; j++) {
				if (n == A[i][j])
					dem++;
			}
		}
		System.out.printf("Số %d lặp lại %d lần\n", n, dem);

		if (sodong != socot)
			System.out.println("Không thể liệt kê các phần tử trên đường chéo chính");
		else {
			System.out.print("Các phần tử trên đường chéo chính là: ");
			for (int i = 0; i < sodong; i++) {
				System.out.print(A[i][i] + "\t");
			}
			System.out.println("");
		}
		
		int tong = 0;
		for (int i = 0; i < sodong; i++) {
			for (int j = 0; j < socot; j++) {
				if (A[i][j] % 4 == 0)
					tong = tong + A[i][j];
			}
		}
		System.out.println("Tổng các số chẵn chia hết cho 4 là: "+ tong);
	}
}
