package Bai02;

import java.util.ArrayList;
import java.util.List;

public class BaiTap03 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 10; i < 201; i++) {
			if ((i % 7 == 0) && (i % 5 != 0)) {
				list.add(i);
			}
		}
		showList(list);
	}

	public static void showList(List<Integer> list) {
		if (list != null && !list.isEmpty()) {
			int size = list.size();
			for (int i = 0; i < size - 1; i++) {
				System.out.print(list.get(i) + ", ");
			}
			System.out.println(list.get(size - 1));
		}
	}
}
