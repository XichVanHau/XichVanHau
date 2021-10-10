
public class Xe {
	String tenchuxe = "nguyễn văn A";
	String hangsanxuat = "TOYOTA";
	String dong = "tay ga";
	String giayphep = "có giấy phép";
	String dungtichxang = "20 lít";

	public Xe(String hangsanxuat, String dong, String dungtichxang) {
		this.hangsanxuat = hangsanxuat;
		this.dong = dong;
		this.dungtichxang = dungtichxang;
	}

	public void xetoyota() {
		System.out.println("tên chủ xe: " + tenchuxe);
		System.out.println("hãng sản xuất: " + hangsanxuat);
		System.out.println("dòng: " + dong);
		System.out.println("giấy phép: " + giayphep);
		System.out.println("dung tích xăng: " + dungtichxang);

	}

}
/**
 * Xe Tên chủ xe Hảng sản xuất Dòng Giấy phép Dung tích xăng
 */