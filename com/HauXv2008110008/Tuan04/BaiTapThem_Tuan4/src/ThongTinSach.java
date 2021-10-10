
public class ThongTinSach {
	String Tensach;
	double gia;
	String nhaxuatban;
	int namxuatban;
	double giaban;
	int soluong;
	String loai;

	public ThongTinSach(double gia, int soluong, String loai) {
		super();
		this.gia = gia;
		this.soluong = soluong;
		this.loai = loai;
	}

	public void Thongtinsach() {
		System.out.println("thông tin sách của bạn:");
		System.out.println("Tên Sách: " + Tensach);
		System.out.println("Giá: " + gia);
		System.out.println("Nhà Xuất bản: " + nhaxuatban);
		System.out.println("Năm Xuất bản: " + namxuatban);
		System.out.println("Giá Bán: " + giaban);
		System.out.println("Số Lượng: " + soluong);
		System.out.println("Thể Loại: " + loai);
	}

}
