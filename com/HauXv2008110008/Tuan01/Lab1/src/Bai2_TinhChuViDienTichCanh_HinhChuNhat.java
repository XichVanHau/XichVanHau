import java.util.Scanner;

/*
 * Chu vi = (dai + rong)*2 
 * Diện tích = dai * rong 
 * Cạnh nhỏ nhất = Math.min(dai, rong) 
 */
public class Bai2_TinhChuViDienTichCanh_HinhChuNhat {
	public static void main(String[] args) {
		Scanner xh = new Scanner (System.in);
		
		float dai, rong, chuvi, dientich, canhnhonhat;
		
		System.out.println("nhập chiều dài");
		dai = xh.nextFloat();
		
		System.out.println("nhập chiều rộng");
		rong = xh.nextFloat();
		
		chuvi = (dai + rong)*2;
		dientich = dai * rong;
		canhnhonhat = Math.min(dai, rong);
		
		System.out.println("chu vi là: " + chuvi);
		System.out.println("diện tích là: " + dientich);
		System.out.println("cạnh nhỏ nhất là: " + canhnhonhat);

		
	}
}
