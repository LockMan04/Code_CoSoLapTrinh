package Cau01;

import java.util.Scanner;

public class KiemTraSoChanLe {

	private static Scanner hi;

	public static void main(String[] args) {
		hi = new Scanner(System.in);
		int n;
		
		System.out.println("Nhập một số bất kì: ");
		n = hi.nextInt();
		
		if (n == 0)
		{
			System.out.println("Số 0 không là số chẵn cũng không là số lẻ");
		}
		else if (n % 2 == 0)	 	
		 		System.out.println("Đây là số chẳn");	 	
		 	else 
		 		System.out.println("Đây là số lẻ");		
		 	
	}
}
