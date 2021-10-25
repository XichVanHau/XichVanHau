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

			System.out.println("Nhâòp thêm taìo: (yes/no) ?");
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
		System.out.println("MaÌu câÌn tiÌm laÌ: ");
		for (Apple apple : dsApple) {
			if (Nhap.nextLine().equals(apple.mauSac))
				apple.inThongTin();
		}
	}

}