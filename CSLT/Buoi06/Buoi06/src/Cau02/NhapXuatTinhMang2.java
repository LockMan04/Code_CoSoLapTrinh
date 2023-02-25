package Cau02;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.DefaultEditorKit.InsertBreakAction;

public class NhapXuatTinhMang2 {
	static Scanner hi = new Scanner(System.in);
	static int n;
	static boolean Check = true;
	static boolean SNT = true;
	static int[] B = new int[n];
	static int Sum = 0;

	private static void NhapMang(int[] A) {
		for (int i = 0; i < n; i++) {
			System.out.printf("Phần tử số %d là: ", i);
			A[i] = hi.nextInt();
		}
	}

	private static void KiemTra(int[] A) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (A[i] == A[j] && i != j) {
					Check = false;
					continue;
				}
			}
		}
		if (Check == false)
			System.out.println("Vui lòng nhập các phần tử khác nhau");
	}

	private static void XuatMang(int[] A) {
		System.out.println("Mảng của bạn là: ");
		for (int i = 0; i < n; i++) {
			System.out.print(A[i] + "\t");
		}
		System.out.println("");
	}

	private static void TinhTongSoChanTichSoLe(int[] A) {
		int SumChan = 0, TichLe = 0;
		for (int i = 0; i < n; i++) {
			if (A[i] % 2 == 0) {
				SumChan += A[i];
			} else {
				TichLe += A[i];
			}
		}
		System.out.println("Tổng số chẵn là: " + SumChan);
		System.out.println("Tích số lẻ là: " + TichLe);
	}

	private static void SoNguyenTo(int[] A) {
		System.out.println("Số nguyên tố có trong mảng là: ");
		for (int i = 0; i < n; i++) {
			for (int j = 2; j <= Math.sqrt(n); j++) {
				if (A[i] == 2) {
					System.out.print(A[i] + "\t");
				} else if (A[i] % j == 0 && A[i] > 2)
					continue;
				{
					System.out.print(A[i] + "\t");
				}
			}
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		do {
			System.out.println("Nhập số phần tử của mảng: ");
			n = hi.nextInt();
			if (n <= 0)
				System.out.println("Vui lòng nhập số nguyên dương");
		} while (n <= 0);

		int A[] = new int[n];

		NhapMang(A);
		KiemTra(A);
		if (Check == true) {
			XuatMang(A);
			TinhTongSoChanTichSoLe(A);
			SoNguyenTo(A);
		}
	}
}
