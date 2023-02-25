package Cau02;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class NhapXuatTinhMang1 {
	static Scanner hi = new Scanner(System.in);

	private static void NhapMang(int[] A) {
		System.out.println("Nhập các phần tử cho mảng: ");
		for (int i = 0; i < A.length; i++) {
			System.out.printf("Nhập phần tử thứ %d: ", i);
			A[i] = hi.nextInt();
		}

	}

	private static void XuatMang(int[] A) {
		System.out.println("\nMảng ban đầu: ");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + "\t");
		}
		System.out.println("");
	}

	private static void TinhPhanTu(int[] A) {
		int max = A[0];
		int min = A[0];

		for (int i = 0; i < A.length; i++) {
			if (A[i] < min) {
				min = A[i];
			}
			if (A[i] > max) {
				max = A[i];
			}
		}
		System.out.printf("\nPhần tử lớn nhất trong mảng là: %d", max);
		System.out.printf("\nPhần tử nhỏ nhất trong mảng là: %d", min);
	}

	private static void DemPTChan(int[] A) {
		int SoPhanTuChan = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0) {
				SoPhanTuChan++;
			}
		}
		System.out.printf("\nSố phần tử chẵn có trong mảng là %d", SoPhanTuChan);
	}

	public static void main(String[] args) {
		int n;

		do {
			System.out.println("Nhập vào số phần tử của mảng: ");
			n = hi.nextInt();
		} while (n < 0);

		int A[] = new int[n];
		NhapMang(A);
		XuatMang(A);
		TinhPhanTu(A);
		DemPTChan(A);
		Arrays.sort(A);
		XuatMang(A);

	}
}
