import java.util.Scanner;

public class Bai3_TinhTheTichKhoiChuNhat {
	public static void main(String[] args) {
		Scanner xh = new Scanner (System.in);
		int canh;
		
		System.out.println("nhập cạnh của khối chủ nhật:");
		canh = xh.nextInt();
		
		float TTLP = canh * canh * canh;
		System.out.println("thể  tích hình lập phương: " +  TTLP);

	}
}
/**
Viết chương trình nhập từ bàn phím cạnh của một khối lập phương.
Tính và xuất thể tích của khối chữ nhật 

HƯỚNG DẪN: 
Thể tích lập phương = canh * canh * canh 
Hoặc Math.pow(canh, 3) 
*/