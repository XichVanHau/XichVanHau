package Apple;

import java.util.ArrayList;
import java.util.Scanner;

public class Kho_Apple {

	static ArrayList<Apple> dsApple = new ArrayList<>();
	static Scanner Nhap = new Scanner(System.in);

	public void nhapVaoDanhSach() {
		while (true) {

			Apple apple = new Apple();
			apple.nhapThongTin();

			Nhap.nextLine();
			dsApple.add(apple);

			System.out.println("Nh��p th�m ta�o: (yes/no) ?");
			if (Nhap.nextLine().equals("n"))
				break;
		}
	}

	public void xuatDanhSach() {
		for (Apple apple : dsApple) {
			apple.inThongTin();
		}
	}

	public void timTheoMau() {
		System.out.println("Ma�u c��n ti�m la�: ");
		for (Apple apple : dsApple) {
			if (Nhap.nextLine().equals(apple.mauSac))
				apple.inThongTin();
		}
	}

}