package Cau01;

import java.util.Random;

public class ToanTu {
	
	
	public static void printInt(String s, int i) {
			System.out.println(s + " = " + i);

	}
	
	public static void printFloat(String s, Float f) {
		System.out.println(s + " = " + f);

}
	public static void main(String[] args) {
		Random random = new Random();
		int i, j, k;
		
		j = random.nextInt(100) + 1;		
		k = random.nextInt(100) + 1;
		printInt("j", j);					// j = 34 Lấy ngẫu nhiên từ 1 - 100
		printInt("k", k);					// k = 25 Lấy ngẫu nhiên từ 1 - 100
		i = j + k; printInt("j + k", i);	// j + k = 59 Tổng của j và k
		i = j - k; printInt("j - k", i);	// j - k = 9 Hiệu của j và k
		i = j * k; printInt("j * k", i);	// j * k = 850 Tích của j và k
		i = j / k; printInt("j / k", i);	// j / k = 1 Phần nguyên của thương j và k
		i = j % k; printInt("j % k", i);	// j % k = 9 Phần dư của thương j và k
		j %= k; printInt("j %= k", j);		// j %= k =9 Phần dư của thương j và k
		
		float u, v, w; 
		v =  random.nextFloat();
		w =  random.nextFloat();
		printFloat("v", v);					// Lấy một số thực v ngẫu nhiên
		printFloat("w", w);					// Lấy một số thực w ngẫu nhiên
		u = v + w; printFloat("v + w", u);	// Tổng của v và w
		u = v - w; printFloat("v - w", u);	// Hiệu của v và w
		u = v * w; printFloat("v * w", u);	// Tích của v và w
		u = v / w; printFloat("v / w", u);	// Thương của v và w
		
		u += v; printFloat("u += v", u);	// Tổng của u và v
		u -= v; printFloat("u -= v", u);	// Hiệu của u và v
		u *= v; printFloat("u *= v", u);	// Tích của u và v
		u /= v; printFloat("u /= v", u);	// Thương của u và v
			
	}}