
public class ThongTinMayTinh_test {
	public static void main(String[] args) {

		ThongTinMayTinh xh = new ThongTinMayTinh("apple", 2021, "ios", 2);

//		xh.nhasanxuat = "APPLE";
//		xh.namsanxuat = 2019;
//		xh.hedieuhanh = "IOS";
		xh.RAM = "4G";
		xh.gia = 40000;
//		xh.nambaohanh = 2024;

		xh.thongtinmaytinh();
		System.out.println("---------");
		xh.MayTinh();
	}
}
