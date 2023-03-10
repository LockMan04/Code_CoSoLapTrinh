package Cau04;

public class FibonacciKhongDeQuy {
	public static int fibonacci(int n) {
		int f0 = 1;
		int f1 = 1;
		int fn = 1;

		if (n < 0) {
			return -1;
		} else if (n == 0 || n == 1) {
			return n;
		} else {
			for (int i = 2; i < n; i++) {
				f0 = f1;
				f1 = fn;
				fn = f0 + f1;
			}
		}
		return fn;
	}

	public static void main(String[] args) {
		System.out.println("10 số đầu tiên của dãy Fibonacci là: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(fibonacci(i) + " ");
		}

	}

}
