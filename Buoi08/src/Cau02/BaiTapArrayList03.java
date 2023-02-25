package Cau02;

import java.util.ArrayList;
import java.util.Scanner;

public class BaiTapArrayList03 {
	public static void main(String[] args) {
		int number;
		ArrayList<Integer> MangInteger = new ArrayList<>();
		Scanner hi = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("Nhập phần tử thứ %d: ", i);
			number = hi.nextInt();
			MangInteger.add(number);
		}
		ArrayList<Integer> ArrTemp = new ArrayList<>();
		
		for(int i = 0; i < MangInteger.size(); i++) {
			if(!ArrTemp.contains(MangInteger.get(i))) {
				ArrTemp.add(MangInteger.get(i));
			}
		}
		MangInteger.clear();
		
		MangInteger.addAll(ArrTemp);
		
		System.out.println("Các phần tử có trong Mảng Integer là:");
		System.out.println(MangInteger);
	}
}
