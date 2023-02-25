package Bai02;

import java.util.Scanner;

public class BaiTap01 {
		public static void main(String[] args) {
			String s;
			Scanner hi = new Scanner(System.in);
			s = hi.nextLine();
			System.out.println("So cac tu la: " + count(s));
		}

		public static int count(String s) {
			if (s == null)
				return -1;
			int count = 0;
			boolean notCounted = true;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != ' ' && s.charAt(i) != '\n' && s.charAt(i) != '\t') {
					if (notCounted) {
						notCounted = false;
						count++;
					}
				} else {
					notCounted = true;
				}
			}
			return count;
		}
}
