package Apple;

import java.util.Scanner;

public class Apple {

	private String id;
	private String khoiluong;
	String mauSac;
	
	

	public Apple(String id, String khoiluong, String mauSac) {
		super();
		this.id = id;
		this.khoiluong = khoiluong;
		this.mauSac = mauSac;
	}

	static Scanner sc = new Scanner(System.in);

	Apple() {
	}

	public void inThongTin() {
		System.out.println("Mã id: " + this.id);
		System.err.println("Khối Lượng: " + this.khoiluong);
		System.out.println("Màu sắc: " + this.mauSac);
	}

	public void nhapThongTin() {
		System.out.println("Mã id: ");
		id = sc.nextLine();
		System.err.println("Khối Lượng: ");
		khoiluong = sc.nextLine();
		System.out.println("Màu sắc: ");
		mauSac = sc.nextLine();
	}

}