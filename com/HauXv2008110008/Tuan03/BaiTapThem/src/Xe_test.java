
public class Xe_test {
	public static void main(String[] args) {
		
		Xe xh = new Xe("honda", "tay ga", "5 lít");
		
		xh.tenchuxe = "nguyễn văn A";
		xh.hangsanxuat = "HONDA";	//TOYOTA
		xh.dong = "tay ga";
		xh.giayphep = "có giấy phép";
		xh.dungtichxang = "4 lít";
		
		xh.xetoyota();
		System.out.println("----------");
		xh.thongtinxe();
	}
}
