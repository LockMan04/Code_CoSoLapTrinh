package Cau02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EpKieu {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		Double ngay, thang, thu;

		System.out.println("Nhập ngày: ");
		ngay = input.nextDouble();
		System.out.println("Nhập tháng: ");
		thang = input.nextDouble();
		System.out.println("Nhập năm: ");
		input.nextDouble();
		
		DecimalFormat doi = new DecimalFormat("0");
		thu = (double)(30.42 * (thang -1 )) + ngay;
		System.out.print("Đó là ngày thứ " + doi.format(thu)); System.out.println(" trong năm");
	}

}
