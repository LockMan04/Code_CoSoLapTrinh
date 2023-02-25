package Cau04;

public class FibonacciDeQuy {
	public static int Fibonacci(int n) {
		if (n < 0) {
			return -1;
		} else if (n == 0 || n == 1) {
			return n;
		}
		else {
			return Fibonacci(n - 1) + Fibonacci(n - 2);
		}
	}

	public static void main(String[] args) {
		System.out.println("10 số đầu tiên của dãy Fibonacci là: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(Fibonacci(i) + " ");
		}
	}

}
