
public class Xe_test {
	public static void main(String[] args) {
		
		Xe [] DSxe = new Xe[2];
		
		Xe xe1 = new Xe("honda", "tay ga", "4 lít");
		Xe xe2 = new Xe("yamaha", "tay côn", "5 lít");
		
		DSxe[0] = xe1;
		DSxe[1] = xe2;
		
		DSxe[0].xetoyota();
		DSxe[1].xetoyota();
		
	}
}
