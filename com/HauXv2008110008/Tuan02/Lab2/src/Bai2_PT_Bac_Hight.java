import java.util.Scanner;

public class Bai2_PT_Bac_Hight {
	public static void main(String[] args) {
		// Phuong trinh bac 2: ax^2 + bx + c = 0
		// Các biến cần có: a, b, c, x1, x2, delta
		/*
		 * Nếu a == 0 thì báo lỗi. B1. delta = b^2 - 4ac B2. Kiem tra delta 2.1. delta
		 * <0 => Phương trình vô nghiệm 2.2. delta ==0 => Phương trình có nghiệm kép
		 * x1=x2=-b/2a 2.3. delta>0 => Phuong trình có 2 nghiệm x1 =
		 * (-b-sqrt(delta))/(2a) x2 = (-b+sqrt(delta))/(2a)
		 */
		double a, b, c, x1, x2, delta;
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhập vào a = ");
		a = sc.nextDouble();
		System.out.println("Nhập vào b = ");
		b = sc.nextDouble();
		System.out.println("Nhập vào c = ");
		c = sc.nextDouble();

		delta = Math.pow(b, 2) - 4 * a * c;

		if (a == 0) {
			System.out.println("Nhập dữ liệu sai!");
		} else {
			if (delta < 0) {
				// Tinh huong delta<0
				System.out.println("Phương trình vô nghiệm!");
			} else if (delta == 0) {
				// Tinh huong delta==0
				x1 = -b / (2 * a);
				System.out.println("Phương trình có nghiệm kép x1=x2=" + x1);
			} else {
				// Tinh huong delta>0
				x1 = (-b - Math.sqrt(delta)) / (2 * a);
				x2 = (-b + Math.sqrt(delta)) / (2 * a);
				System.out.println("Phương trình có nghiệm");
				System.out.println("x1=" + x1);
				System.out.println("x2=" + x2);
			}
		}
	}
}


     