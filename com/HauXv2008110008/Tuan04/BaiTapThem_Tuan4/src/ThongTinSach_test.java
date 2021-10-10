
public class ThongTinSach_test {
	public static void main(String[] args) {
		
	ThongTinSach [] TTsach = new ThongTinSach[2];
	
	ThongTinSach TTsach1 = new ThongTinSach(2000, 1, "tình yêu");
	ThongTinSach TTsach2 = new ThongTinSach(3500, 1, "trinh thám");
	
	TTsach[0] = TTsach1;
	TTsach[1] = TTsach2;
	TTsach[0].Thongtinsach();
	System.out.println("--------");
	TTsach[1].Thongtinsach();
	

}
}
