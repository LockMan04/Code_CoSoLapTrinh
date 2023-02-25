package Cau02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BaiTapArrayList01 {
	public static void main(String[] args) {
		ArrayList<Integer> MangInteger = new ArrayList<>();
		Scanner hi = new Scanner(System.in);
		int number;
		
		System.out.println("Nhập số phần tử của ArrayList: ");
		int n = hi.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Nhập phần tử thứ %d: ", i);
			number = hi.nextInt();
			MangInteger.add(number);
		}
		
		int max = MangInteger.get(0);
		for (int i = 0; i < MangInteger.size(); i++) {
			if(MangInteger.get(i).compareTo(max) > 0) {
				max = MangInteger.get(i);
			}
		}
		System.out.println("Phần tử lớn nhất trong Mảng Integer là: "+ max);
	}
}
