package Cau02;

import java.util.Scanner;

abstract class TinhChuViDienTich {

	private static Scanner tinh;

	public static void main(String[] args) {
		tinh = new Scanner(System.in);
		Double c1, c2, c3, cvtg, ncv, dttg, canhhv, cvhv, dthv, cd, cr, dthcn, cvhcn, r, cvht, dtht;
	
		System.out.println("Nhập 3 cạnh hình tam giác: ");
		c1 = tinh.nextDouble();
		c2 = tinh.nextDouble();
		c3 = tinh.nextDouble();
			cvtg = c1+c2+c3;
			ncv = cvtg /2;
			dttg = (Double) Math.sqrt(ncv*((ncv-c1)*(ncv-c2)*(ncv-c3)));
		System.out.println("Chu vi hình tam giác là: " + cvtg);
		System.out.println("Diện tích hình tam giác là: " + dttg);
		System.out.println("---------------------------");
		
		System.out.println("Nhập cạnh của hình vuông");
		canhhv = tinh.nextDouble();
			cvhv = canhhv*4;
			dthv = canhhv*canhhv;
		System.out.println("Chu vi hình vuông là: " + cvhv);
		System.out.println("Diện tích hình vuông là: " + dthv);
		System.out.println("---------------------------");
		
		System.out.println("Nhập chiều dài hình chữ nhật: ");
		cd = tinh.nextDouble();
		System.out.println("Nhập chiều rộng hình chữ nhật: ");
		cr = tinh.nextDouble();
			cvhcn = (cd+cr)/2;
			dthcn = cd*cr;
		System.out.println("Chu vi của hình chữ nhật là: " + cvhcn);
		System.out.println("Diện tích của hình chữ nhật là: " + dthcn);
		System.out.println("---------------------------");
		
		System.out.println("Nhập bán kính hình tròn: ");	
		r = tinh.nextDouble();
			cvht = 2*r*(Double)3.14;
			dtht = r*r*(Double)3.14;
		System.out.println("Chu vi hình tròn là: " + cvht);
		System.out.println("Diện tích hình tròn là: " + dtht);		
	}

}
