
public class TaiKhoan {
	String tenchutaikhoan = "Hậu XH";
	long sotaikhoan = 2008110008;
	double sodutrongtaikhoan = 25000000;
	
	public TaiKhoan(String tenchutaikhoan, long sotaikhoan, double sodutrongtaikhoan) {
		super();
		this.tenchutaikhoan = tenchutaikhoan;
		this.sotaikhoan = sotaikhoan;
		this.sodutrongtaikhoan = sodutrongtaikhoan;
	}

	public void taikhoan() {
		System.out.println("tên chủ tài khoản: " + tenchutaikhoan);
		System.out.println("số dư trong tài khoản: " + sodutrongtaikhoan);
		System.out.println("số dư tài khoản: " + sotaikhoan);
	}
}
