package Cau07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThuaSoNguyenTo {
	static Scanner hi = new Scanner(System.in);
	static int n;

	private static List<Integer> PhanTichSoNguyen(int n) {
		int i = 2;
		List<Integer> ListNum = new ArrayList<Integer>();
		while (n > 1) {
			if (n % i == 0) {
				n = n / i;
				ListNum.add(i);
			} else {
				i++;
			}
		}
		if (ListNum.isEmpty()) {
			ListNum.add(n);
		}
		return ListNum;
	}

	public static void main(String[] args) {
		System.out.println("Nhập số nguyên dương: ");
		n = hi.nextInt();

		List<Integer> ListNum = PhanTichSoNguyen(n);

		System.out.printf("Kết quả là: %d = ", n);
		int size = ListNum.size();
		for (int i = 0; i < size - 1; i++) {
			System.out.print(ListNum.get(i) + " x ");
		}
		System.out.print(ListNum.get(size - 1));
	}

}
