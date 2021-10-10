import java.util.Scanner;
/*
 * 
 */
public class Bai4_Tinh_Delta {
	public static void main(String[] args) {
		Scanner xh = new Scanner (System.in);
		
		int a, b, c;
		double delta;
		System.out.println("nhập a: ");
		a = xh.nextInt();

		System.out.println("nhập b: ");
		b = xh.nextInt();
		
		System.out.println("nhập c: ");
		c = xh.nextInt();
		
		delta = Math.pow(b, 2) - 4 * a * c;
		
		System.out.println("DELTA là: " + delta);

	}
}
/*Viết chương trình nhập các hệ số của phương trình bậc 2.
 * Tính delta và xuất căn delta ra màn hình.

HƯỚNG DẪN: 

Delta = Math.pow(b, 2) – 4 * a * c 

Sử dụng Math.sqrt(delta) để tính căn delta 
*/