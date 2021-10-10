
public class ThongTinSach_Test {
	public static void main(String[] args) {
		ThongTinSach test = new ThongTinSach(150, 2, "trinh thám");
		
		test.Tensach = "lập trình java";
		test.nhaxuatban = "NXB thanh niên";
		test.namxuatban = 2016;
		test.giaban = 200;
		
		test.Thongtinsach();
		System.out.println("------------");
		test.Sach();
	}
}
