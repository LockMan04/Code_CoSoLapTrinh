package Cau01;

import java.util.Random;

public class SoSanh {

	public static void main(String[] args) {
		Random random = new Random();
		int i = random.nextInt(100);
		int j = random.nextInt(100);
		
		System.out.println("i = " + i);					// Chọn ngẫu nhiên từ 1 - 99
		System.out.println("i = " + j);					// Chọn ngẫu nhiên từ 1 - 99
		System.out.println("i > j is " + (i > j));		// So sánh i lớn hơn j 
		System.out.println("i < j is " + (i < j));		// So sánh i bé hơn
		System.out.println("i >= j is " + (i >= j));	// So sánh i lớn hơn hoặc bằng j
		System.out.println("i <= j is " + (i <= j));	// So sánh i bé hơn hoặc bằng j
		System.out.println("i == j is " + (i == j));	// So sánh i bằng j
		System.out.println("i != j is " + (i != j));	// So sánh i khác j
		
		System.out.println("(i < 10 && (j < 10) is " + ((i <10)&&(j<10)));  	// So sánh i < 10 và j < 10 
		System.out.println("(i < 10 || (j < 10) is " + ((i <10)||(j<10)));		// So sánh i < 10 hoặc j < 10
	}

}
