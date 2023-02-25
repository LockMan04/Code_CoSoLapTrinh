package Cau02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BaiTapArrayList02 {
	public static void main(String[] args) {
		int n;
		int number;
		ArrayList<Integer> MangInteger = new ArrayList<>();
		Scanner hi = new Scanner(System.in);
		
		System.out.println("Nhập vào số phần tử của ArrayList: ");
		n = hi.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Nhập phần tử thứ %d: ", i);
			number = hi.nextInt();
			MangInteger.add(number);
		}
		ArrayList<Integer> MangNew = new ArrayList<>(MangInteger.size());
		System.out.println("Nhập vào số phần tử của ArrayList New: ");
		n = hi.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Nhập phần tử thứ %d: ", i);
			number = hi.nextInt();
			MangNew.add(number);
		}
		
		for(int str : MangInteger) {
			if(!MangNew.contains(str)) {
				MangNew.add(str);
			}
		}
		System.out.println("Các phần tử có trong Mảng Integer là: ");
		System.out.println(MangInteger);
		System.out.print("\nCác phần tử có trong Mảng Mới là: ");
		System.out.println(MangNew);
	}
}
