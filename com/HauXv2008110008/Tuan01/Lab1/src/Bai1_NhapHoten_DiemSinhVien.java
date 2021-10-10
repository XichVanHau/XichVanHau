import java.util.Scanner;

/*
 * Viết chương trình cho phép nhập họ và tên sinh viên, điểm trung bình
 * từ bàn phím sau đó xuất ra màn hình với định dạng:
 *  <<họ và tên>> <<điểm>> điểm. 
 */
public class Bai1_NhapHoten_DiemSinhVien {
	public static void main(String[] args) {
		Scanner GDU = new Scanner (System.in);
		
		System.out.println("nhập vào họ và tên: ");
		String hovaten = GDU.nextLine();
		
		System.out.println("nhập điểm của bạn: ");
		float diem = GDU.nextFloat();
		
		System.out.println("họ và tên: " + hovaten);
		System.out.println("điểm của bạn: " + diem);
		
	}
}
