
public class ThongTinMayTinh {
	String nhasanxuat;
	int namsanxuat;
	String hedieuhanh;
	String RAM;
	double gia;
	int nambaohanh;

	public ThongTinMayTinh(String nhasanxuat, int namsanxuat, String hedieuhanh, int nambaohanh) {
		this.nhasanxuat = nhasanxuat;
		this.namsanxuat = namsanxuat;
		this.hedieuhanh = hedieuhanh;
		this.nambaohanh = nambaohanh;
	}

	public void thongtinmaytinh() {
		System.out.println("nhà sản xuất: " + nhasanxuat);
		System.out.println("năm sản xuất: " + namsanxuat);
		System.out.println("hệ điều hành: " + hedieuhanh);
		System.out.println("RAM: " + RAM);
		System.out.println("CPU: ");
		System.out.println("giá: " + gia);
		System.out.println("năm bảo hành: " + nambaohanh);
	}

}
/**
 * Máy tính Nhà sản xuất Năm sản xuất Hệ điều hành Ram CPU Giá Năm bảo hành
 */
