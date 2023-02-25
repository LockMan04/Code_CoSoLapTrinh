package Cau02;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class NhapXuatTinhMang {
	static Scanner hi = new Scanner(System.in);
	static int n, test = 1, l, c;

	private static void NhapMang(int[] A) {
		System.out.println("Nhập các phần tử cho mảng: ");
		for (int i = 0; i < A.length; i++) {
			System.out.printf("Phần tử thứ %d: ", i);
			A[i] = hi.nextInt();
		}
	}

	private static void XuatMang(int[] A) {
		System.out.println("Mảng của bạn là: ");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + "\t");
		}
		System.out.println(" ");
	}

	private static void KiemTra(int[] A) {
		for (int i = 0; i < A.length / 2; i++) {
			if (A[i] != A[A.length - i - 1]) {
				test = 0;
				break;
			}
		}

		if (test == 0) {
			System.out.println("Đó không phải là mảng đối xứng");
		} else {
			System.out.println("Đó là mảng đối xứng");
		}
	}

	private static void SoLuongChanLe(int[] A) {
		int sole = 0, sochan = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0) {
				sochan++;
			} else {
				sole++;
			}
		}
		System.out.printf("Có %d số lẻ trong mảng \n", sole);
		System.out.printf("Có %d số chẵn trong mảng \n", sochan);
	}

	private static void TachSoChanLe(int[] A) {
		System.out.println("Số Chẵn là: ");
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0)
				System.out.print(A[i] + "\t");
		}
		System.out.println("\nSố lẻ là: ");
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 1)
				System.out.print(A[i] + "\t");
		}
		System.out.println("");
	}

	private static void TachMang(int[] A) {
		int[] MangDau = Arrays.copyOfRange(A, 0, n / 2);
		int[] MangSau = Arrays.copyOfRange(A, n / 2, n);
		System.out.println("Nửa mảng đầu là: " + Arrays.toString(MangDau));
		System.out.println("Nửa mảng sau là: " + Arrays.toString(MangSau));
	}

	private static void Chia5(int[] A) {
		System.out.println("Các phần tử chia hết cho 5 là: ");
		for (int i = 0; i < n; i++) {
			if (A[i] % 5 == 0)
				System.out.print(A[i] + "\t");
		}
		System.out.println("");
	}

	private static void DemSoLanLapLai(int[] A) {
		int Dem = 0;
		System.out.println("Nhập số cần đếm: ");
		int SoDem = hi.nextInt();
		for (int i = 0; i < n; i++) {
			if (A[i] == SoDem) {
				Dem++;
			}
		}
		System.out.printf("Phần tử %d được lặp lại %d lần", SoDem, Dem);
	}

	public static void main(String[] args) {

		try {
			do {
				System.out.println("Nhập số phần tử của mảng: ");
				n = hi.nextInt();

				if (n <= 0)
					System.out.println("Vui lòng nhập số lớn hơn 0");
			} while (n <= 0);
		} catch (Exception e) {
			System.out.println("Lỗi khi nhập liệu");
		}

		int A[] = new int[n];
		NhapMang(A);
		XuatMang(A);
		KiemTra(A);
		SoLuongChanLe(A);
		TachSoChanLe(A);
		TachMang(A);
		Chia5(A);
		DemSoLanLapLai(A);
	}
}
