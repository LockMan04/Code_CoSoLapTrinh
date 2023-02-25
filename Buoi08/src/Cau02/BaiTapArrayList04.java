package Cau02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BaiTapArrayList04 {
	public static void main(String[] args) {
		String str;
		int number;
		Scanner hi = new Scanner(System.in);

		ArrayList<String> MangStr = new ArrayList<>();
		ArrayList<Integer> MangInt = new ArrayList<>();

		System.out.println("Nhập các phần tử cho mảng chuỗi: ");
		for (int i = 0; i < 5; i++) {
			System.out.printf("Nhập phần tử thứ %d: ", i);
			str = hi.nextLine();
			MangStr.add(str);
		}

		System.out.println("Nhập các phần tử cho mảng chữ: ");
		for (int i = 0; i < 5; i++) {
			System.out.printf("Nhập phần tử thứ %d: ", i);
			number = Integer.parseInt(hi.nextLine());
			MangInt.add(number);
		}

		Iterator<String> IterA = MangStr.iterator();
		System.out.println("Các phần tử của mảng chuỗi là: ");
		while (IterA.hasNext()) {
			System.out.print(IterA.next() + "\t");
		}

		Iterator<Integer> IterB = MangInt.iterator();
		System.out.println("\nCác phần tử của mảng chữ là: ");
		while (IterB.hasNext()) {
			System.out.print(IterB.next() + "\t");
		}
		
		System.out.println("\nNhập phần tử cần tìm: ");
		String StrSearch = hi.nextLine();
		if(MangStr.contains(StrSearch)) {
			int FirstPosition = MangStr.indexOf(StrSearch);
			int LastPosition = MangStr.lastIndexOf(StrSearch);
			System.out.printf("Vị trí xuất hiện đầu tiên và cuối cùng của %d là: %d và %d", StrSearch, FirstPosition, LastPosition);
		} else {
			System.out.println("Không tìm thấy phần tử "+ StrSearch);
		}
		
		List<Integer> SubList = MangInt.subList(3, MangInt.size());
		System.out.println("Các phần tử có trong SubList là: "+SubList);
		
		Collections.reverse(MangStr);
		System.out.println("Các phần tử trong Mảng String sau khi đảo ngược: "+ MangStr);
		Collections.reverse(MangInt);
		System.out.println("Các phần tử trong Mảng Integer sau khi đảo ngược là: "+ MangInt);
		
		Collections.shuffle(MangInt);
		System.out.println("Các phần tử trong Mảng Integer sau khi xáo trộn: "+ MangInt);
		
		Object[] array = MangInt.toArray();
		System.out.println("Các phần tử của mảng Array là: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ "\t");
		}
	}

}
