import java.util.Scanner;

public class Menu_Cac_Chuc_Nang {
	public static void main(String[] args) {
		Scanner xh = new Scanner(System.in);

		int nhap;
		System.out.println("hãy chọn chức năng: ");
		System.out.println("1. Giải PT bậc nhất: ");
		System.out.println("2. Giải PT bậc hai: ");
		System.out.println("3. Tính tiền điện: ");
		System.out.println("4. kết thúc chương trình: ");
		System.out.println("---------------------------");
		System.out.println("hãy chọn chức năng: ");

		nhap = xh.nextInt();
		switch (nhap) {
		case 1:
			int a, b;
			float x;
			System.out.println("---Giải PT bậc nhất--- ");
			System.out.println("nhập A và B: ");
			a = xh.nextInt();
			b = xh.nextInt();

			if (a == 0) {

				if (b == 0) {
					System.out.println("phương trình vô số nghiệm");
				} else if (b != 0) {
					System.out.println("phương trình vô nghiệm");

				}
			} else {
				x = -b / a;
				System.out.println("phương trình có nghiệm: " + x);

			}
			break;
		case 2:
			double a1, b1, c, x1, x2, delta;
			Scanner sc = new Scanner(System.in);
			System.out.println("---Giải PT bậc hai---");
			System.out.println("Nhập vào a = ");
			a1 = sc.nextDouble();
			System.out.println("Nhập vào b = ");
			b1 = sc.nextDouble();
			System.out.println("Nhập vào c = ");
			c = sc.nextDouble();

			delta = Math.pow(b1, 2) - 4 * a1 * c;

			if (a1 == 0) {
				System.out.println("Nhập dữ liệu sai!");
			} else {
				if (delta < 0) {
					// Tinh huong delta<0
					System.out.println("Phương trình vô nghiệm!");
				} else if (delta == 0) {
					// Tinh huong delta==0
					x1 = -b1 / (2 * a1);
					System.out.println("Phương trình có nghiệm kép x1=x2=" + x1);
				} else {
					// Tinh huong delta>0
					x1 = (-b1 - Math.sqrt(delta)) / (2 * a1);
					x2 = (-b1 + Math.sqrt(delta)) / (2 * a1);
					System.out.println("Phương trình có nghiệm");
					System.out.println("x1=" + x1);
					System.out.println("x2=" + x2);
				}
			}

			break;
		case 3:
			int so_dien;
			System.out.println("nhập vào số điện: ");
			so_dien = xh.nextInt();
			
			if(so_dien <= 50) {
				System.out.println("tiền điện của bạn là: " + (so_dien *1000));
				
			} else if(so_dien > 50) {
				System.out.println("tiền điện của bạn là: " + (50*1000 + (so_dien - 50)*1200));

			}
			break;
		default:
			System.out.println("kết thúc chương trình: ");
			break;
		}
	}
}
