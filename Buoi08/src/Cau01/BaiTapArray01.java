package Cau01;

import java.util.Scanner;

public class BaiTapArray01 {
	static int[] A;
	static int n;
	static Scanner hi = new Scanner(System.in);

	private static void Nhap(int A[], int n) {
		System.out.println("Mời nhập mảng: ");
		{
			for (int i = 0; i < n; i++) {
				System.out.printf("Phần tử thứ %d là: \n", i);
				A[i] = hi.nextInt();
			}
		}
	}

	private static void Xuat(int A[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(A[i] + " ");
			System.out.println("");
		}
	}

	private static int Min(int A[], int n) {
		int Min = A[0];
		for (int i = 1; i < n; i++) {
			if (A[i] < Min)
				Min = A[i];
		}
		return Min;
	}

	private static int Max(int A[], int n) {
		int Max = A[0];
		for (int i = 1; i < n; i++) {
			if (A[i] > Max)
				Max = A[i];
		}
		return Max;
	}

	private static boolean Check(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++)
			if (n % i == 0)
				return false;
		return true;
	}
	
	private static void SapXep(int A[], int n) {
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n - 1; j++){
				if( A[j] > A[j+1]){
					int temp = A[i];
					A[j] = A[i];
					A[i] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		System.out.println("Nhập N: ");
		n = hi.nextInt();

		A = new int[n];
		Nhap(A, n);
		Xuat(A, n);
		
		System.out.println("Min"+ Min(A, n));
		System.out.println("Max"+ Max(A, n));
		
		System.out.println("Các số nguyên tố là: ");
		for(int i = 0; i < n; i++){
			if (Check(A[i]))
				System.out.print(A[i]+ " ");
		}
		System.out.println(" ");
		
		SapXep(A, n);
		Xuat(A, n);
	}
}
