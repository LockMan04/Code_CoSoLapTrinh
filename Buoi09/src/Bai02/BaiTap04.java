package Bai02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BaiTap04 {
	public static void main(String[] args) {
		String str;
		int number;
		Scanner hi = new Scanner(System.in);
		
		ArrayList<String> arrListA = new ArrayList<>();
		ArrayList<Integer> arrListB = new ArrayList<>();
		
		System.out.println("Nhập phần tử là các chuỗi cho ArrayList 1: ");
		for (int i = 0; i < 5; i++) {
			System.out.print("Nhập phần tử thứ " + i + ": ");
			str = hi.nextLine();
			arrListA.add(str);
		}
		System.out.println("Nhập phần tử là các số nguyên cho ArrayList 2: ");
		for (int i = 0; i < 5; i++) {
			System.out.print("Nhập phần tử thứ " + i + ": ");
			number = Integer.parseInt(hi.nextLine());
			arrListB.add(number);
		}
		
		Iterator<String> iteratorA = arrListA.iterator();
		System.out.println("Các phần tử của arrListA là: ");
		while (iteratorA.hasNext()) {
			System.out.print(iteratorA.next() + "\t");
		}
		Iterator<Integer> iteratorB = arrListB.iterator();
		System.out.println("\nCác phần tử của arrListB là: ");
		while (iteratorB.hasNext()) {
			System.out.print(iteratorB.next() + "\t");
		}
		
		System.out.println("\nNhập phần tử cần tìm: ");
		String strSearch = hi.nextLine();
		if (arrListA.contains(strSearch)) {
			int firstPosition = arrListA.indexOf(strSearch);
			int lastPosition = arrListA.lastIndexOf(strSearch);
			System.out.println("Vị trí xuất hiện đầu tiên và cuối cùng của " + strSearch + " là " + firstPosition
					+ " và " + lastPosition);
		} else {
			System.out.println("Không tìm thấy phần tử " + strSearch);
		}

		List<Integer> subList = arrListB.subList(3, arrListB.size());


		Collections.reverse(arrListA);
		System.out.println("Các phần tử trong arrListA sau khi đảo ngược: " + arrListA);
		Collections.reverse(arrListB);
		System.out.println("Các phần tử trong arrListB sau khi đảo ngược: " + arrListB);

		Collections.shuffle(arrListA);
		System.out.println("Các phần tử trong arrListA sau khi xáo trộn: " + arrListA);

		Object[] array = arrListB.toArray();
		System.out.println("Các phần tử của mảng array là: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}
}
