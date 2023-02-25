package Cau01;

import java.util.Scanner;

public class KiemTraSoDuongAm {

	private static Scanner hi;

	public static void main(String[] args) {
		hi = new Scanner(System.in);
		int so;
		
		System.out.println("Nhập số bất kì: ");
		so = hi.nextInt();
		
		if (so >=0)
	{
		System.out.println("Số bạn nhập là số DƯƠNG");
	}
		else 
		{
		System.out.println("Số bạn nhập là số ÂM");	
		}
  }
}