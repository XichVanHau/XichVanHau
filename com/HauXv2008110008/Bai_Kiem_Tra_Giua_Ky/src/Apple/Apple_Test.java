package Apple;

import java.util.Scanner;

public class Apple_Test {
	public static void main(String[] args) {
		Kho_Apple ap = new Kho_Apple();
		Scanner Nhap = new Scanner(System.in);
		
		
		Apple ap1 = new Apple("001", "1kg", "Vàng");
		Apple ap2 = new Apple("002", "2kg", "Đỏ");
		Apple ap3 = new Apple("003", "3kg", "Xanh");

		do {
			System.out.println("____________MENU____________");
			System.out.println("1.  Nhập Danh Sách Apple: ");
			System.out.println("2.  Xuất Danh Sách Apple: ");
			System.out.println("3.  Tìm Theo Màu: ");
			System.out.println("4. In Danh Sách Táo: ");
			System.out.println("5.  Kết Thúc.");

			
			System.out.println("Chọn chức năng: ");
			int key = Nhap.nextInt();

			switch (key) {
			case 1:
				ap.nhapVaoDanhSach();
				break;
			case 2:
				ap.xuatDanhSach();
				break;
			case 3:
				ap.timTheoMau();
				break;
			case 4:
				System.out.println("_______táo 1_______");
				ap1.inThongTin();
				System.out.println("_______táo 2_______");
				ap2.inThongTin();
				System.out.println("_______táo 3_______");
				ap3.inThongTin();
				break;
				
			case 5:
				System.out.println("Kết Thúc!");
				System.exit(0);
				break;
			}

			System.out.println("Quay về MENU (yes/no)?: ");
			Nhap.nextLine();

		} while (Nhap.nextLine().equals("yes"));
	}
}