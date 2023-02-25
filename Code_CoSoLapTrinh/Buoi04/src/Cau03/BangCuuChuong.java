package Cau03;

public class BangCuuChuong {

	public static void main(String[] args) {
		System.out.println("Bảng Cửu Chương Từ 2 Đến 9");
		for(int i=2; i<=9; i++)
		{
			for(int j=2; j<=10; j++)
			{
				System.out.printf("%d x %d = %d \n", i, j, i*j);
			}
			System.out.println("");
		}

	}

}
