
public class ThongTinNhanVien_test {
	public static void main(String[] args) {
		
	ThongTinNhanVien [] TTNV = new ThongTinNhanVien[2];
	
	ThongTinNhanVien NV1 = new ThongTinNhanVien("nguyễn A", "TP.HCM");
	ThongTinNhanVien NV2 = new ThongTinNhanVien("nguyễn thị B", "TP. Vũng Tàu");
			
	TTNV [0] = NV1;
	TTNV [1] = NV2;
	
	TTNV [0].thongtinnhanvien();
	System.out.println("--------");
	TTNV [1].thongtinnhanvien();
	
	}
}
