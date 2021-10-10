/*
Viết chương trình nhập một số nguyên từ bàn phím và cho biết số đó có phải số nguyên tố hay không
(số nguyên tố là số chỉ chia hết cho 1 và chính nó).
*/

import java.util.Scanner;

public class Bai1_Kiem_Tra_So_Nguyen_To {
	public static void main(String[] args) {
		Scanner Xh = new Scanner(System.in);

		System.out.println("Nhập vào một số nguyên: ");
		int x = Xh.nextInt();
		boolean kt = true;

		for (int i = 2; i < x - 1; i++) {
			if (x % i == 0) {
				kt = false;
				break;
			}
		}

		if (kt == true)
			System.out.println(x + " là số nguyên tố");
		else
			System.out.println(x + " không phải là số nguyên tố");
		Xh.close();
	}

}
