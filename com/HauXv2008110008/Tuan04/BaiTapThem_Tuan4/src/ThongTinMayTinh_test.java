
public class ThongTinMayTinh_test {
	public static void main(String[] args) {

		ThongTinMayTinh [] DSMayTinh = new ThongTinMayTinh[2];
		
		ThongTinMayTinh MT1 = new ThongTinMayTinh("microsorft", 2021, "ios", 2024);
		ThongTinMayTinh MT2 = new ThongTinMayTinh("apple", 2022, "ios", 2025);

		DSMayTinh[0] = MT1;
		DSMayTinh[1] = MT2;
		
		DSMayTinh[0].thongtinmaytinh();
		System.out.println("-----------");
		DSMayTinh[1].thongtinmaytinh();
	}
}
