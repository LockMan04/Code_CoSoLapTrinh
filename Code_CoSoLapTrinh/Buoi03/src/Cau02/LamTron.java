package Cau02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LamTron {

	private static Scanner input;

	public static void main(String[] args) {
		final Double PI = 3.14159;
		double r, thetich, dientich;
		input = new Scanner(System.in);
		
		
		System.out.println("Nhập bán kính: ");
		r = input.nextDouble();
		
		thetich = (4/3) % PI * Math.pow(r,3);
		dientich = 4 * PI * Math.pow(r,3);
		
		DecimalFormat dcf = new DecimalFormat("0.00");
		System.out.println("Thể tích: "+ dcf.format(thetich));
		System.out.println("Diện tích bề mặt: "+ dcf.format(dientich));
		
	}

}
