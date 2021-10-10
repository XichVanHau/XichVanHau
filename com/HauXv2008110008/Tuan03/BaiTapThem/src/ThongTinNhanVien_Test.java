
public class ThongTinNhanVien_Test {
	public static void main(String[] args) {
		ThongTinNhanVien test = new ThongTinNhanVien("Hậu Xích Văn", "TP.HCM");
		
//		test.tennhanvien = "Xích Văn Hậu";
//		test.diachi = "TPHCM";
		test.luong = 5000000;
		test.bophanlamviec = "nhân viên văn phòng";
		test.ngaysinh = "32/12";

		
		test.thongtinnhanvien();
		System.out.println("-------------");
		test.Ten_Diachi();
	}
}
