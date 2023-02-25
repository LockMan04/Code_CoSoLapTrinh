package Bai02;

import java.util.Scanner;

public class BaiTap02 {
	public static void main(String[] args) {
		String s1, s2;
		Scanner hi = new Scanner(System.in);
		System.out.println("Moi nhap xau s1: ");
		s1 = hi.nextLine();
		System.out.println("Moi nhap xau s2: ");
		s2 = hi.nextLine();
		s1 = s1 + s2;
		System.out.println(s1);
	}
}
