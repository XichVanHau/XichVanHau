
public class ThongTinNhanVien {

	String tennhanvien;
	int luong;
	String diachi;
	String bophanlamviec;
	String ngaysinh;
	
	public ThongTinNhanVien(String tennhanvien, String diachi) {
		this.tennhanvien = tennhanvien;
		this.diachi = diachi;
	}

	public void thongtinnhanvien() {
		System.out.println("tên nhân viên: " + tennhanvien);
		System.out.println("lương: " + luong);
		System.out.println("địa chỉ: " + diachi);
		System.out.println("bộ phận làm việc: " + bophanlamviec);
		System.out.println("ngày sinh: " + ngaysinh);
	}
	public void Ten_Diachi() {
		System.out.println("tên nhân viên: " + tennhanvien);
		System.out.println("địa chỉ: " + diachi);
	}
}
/**Nhân viên
tên nhân viên
lương
địa chỉ
bộ phận làm việt
Ngày sinh (dùng chuỗi)
*/
