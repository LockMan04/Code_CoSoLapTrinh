package Cau03;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenSoNhiPhan {

	private static Scanner hi;

	public static void main(String[] args) {
		hi = new Scanner(System.in);
		int n, du;
		Stack<Integer> so = new Stack<Integer>();
		
		System.out.println("Nhập một số nguyên nguyên dương: ");
		n = hi.nextInt();	
		
		if (n > 0) {
			while (n > 0)
			{		
				du = n % 2; 
				so.push(du);
				n /= 2;
			}
			System.out.print("Số nhị phân là: ");
			while (!(so.isEmpty()))	
			{
				System.out.print(so.pop());
			}
		 } else System.out.println("Nhập số nguyên dương");													
	}

}
