package Cau02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HamMath {

	private static Scanner moi;

	public static void main(String[] args) {
		moi = new Scanner(System.in);
		Double xA, yA, xB, yB, khoangcach;
		
		System.out.println("Nhập tọa độ x của A: ");
		System.out.println("Nhập tọa độ y của A: ");
		xA = moi.nextDouble();
		yA = moi.nextDouble();
		System.out.println("Nhập tọa độ x của B: ");
		System.out.println("Nhập tọa độ y của B: ");

		xB = moi.nextDouble();
		yB = moi.nextDouble();
		
		DecimalFormat abc = new DecimalFormat("0.00");
		khoangcach = Math.sqrt(Math.pow((xB - xA),2)+ Math.pow((yB - yA),2));
		System.out.println("Khoảng cách của AB là: " + abc.format(khoangcach));
	}

}
