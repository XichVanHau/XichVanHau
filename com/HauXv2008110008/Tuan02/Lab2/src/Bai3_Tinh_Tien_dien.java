import java.util.Scanner;

public class Bai3_Tinh_Tien_dien {
	public static void main(String[] args) {
		Scanner xh = new Scanner (System.in);
		
		int so_dien;
		System.out.println("nhập vào số điện: ");
		so_dien = xh.nextInt();
		
		if(so_dien <= 50) {
			System.out.println("tiền điện của bạn là: " + (so_dien *1000));
			
		} else if(so_dien > 50) {
			System.out.println("tiền điện của bạn là: " + (50*1000 + (so_dien - 50)*1200));

		}
	}
}
/**
  Viết chương trình nhập vào số điện sử dụng của tháng và tính tiền điện theo phương pháp lũy tiến 

Nếu số điện sử dụng từ 0 đến 50 thì giá mỗi số điện là 1000 

Nếu số điện sử dụng trên 50 thì giá mỗi số điện vượt hạn mức là 1200 

HƯỚNG DẪN 

Nếu số điện sử dụng < 50: tien = soDien*1000 

Ngược lại: tien = 50*1000 + (soDien - 50)*1200
 */