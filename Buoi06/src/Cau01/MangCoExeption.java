package Cau01;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MangCoExeption {
	public static void main(String[] args) {
		int random[] = new int[10];
		Random hi = new Random();
		for (int i = 0; i < 10; i++) {
			random[i] = hi.nextInt(100);
		}

		try {
			Scanner ho = new Scanner(System.in);
			System.out.println("Bạn muốn in ra phần tử thứ mấy? ");
			int in = ho.nextInt();
			System.out.printf("Ok, phần tử mảng thứ %d mang giá trị là %d \n", in, random[in]);
		} catch (InputMismatchException e) {
			System.out.println("Phần tử mảng chưa hợp lệ, vui lòng nhập số nguyên");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Phần tử mảng chưa hợp lệ, vui lòng nhập giá trị từ 0 đến 9");
		}
	}
}
