package Cau01;

import java.util.Scanner;

public class BaiTapArray02 {
	public static void main(String[] args) {
		int n, temp, max = 100, k, c, d, l;
		Scanner hi = new Scanner(System.in);

		int Mang[] = new int[max];

		do {
			System.out.println("Nhập số phần tử của mảng: ");
			n = hi.nextInt();

		} while (n <= 0 || n >= max - 1);

		System.out.println("Nhập giá trị cho các phần tử của mảng: ");
		for (int i = 0; i < n; i++) {
			System.out.printf("Mảng thứ %d = \n", i);
			Mang[i] = hi.nextInt();
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (Mang[j] < Mang[i]) {
					temp = Mang[i];
					Mang[i] = Mang[j];
					Mang[j] = temp;
				}
			}
		}

		System.out.println("Nhập số nguyên cần tìm kiếm: ");
		k = hi.nextInt();
		d = 0;
		c = n - 1;
		while (d <= c) {
			l = (d + c) / 2;
			if (Mang[l] == k) {
				System.out.printf("Tìm thấy phần tử %d tại vị trí %d", k, l);
				return;
			} else if (Mang[l] == k) {
				d = l + 1;
			} else {
				c = l - 1;
			}
		}
		System.out.println("Trong mảng không có phần tử nào chứa giá trị cần tìm");
	}
}
