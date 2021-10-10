import java.util.Scanner;

/*
 * GIảI P.TRINH: AX + B = 0
 * Neu a = 0:
 * 		1. nếu b = 0: vô số nghiem
 * 		2. nếu b != 0: vô nghiem
 * Nếu a !=0:
 * 		có  nghiem: -b/a
 * 
 * */
public class Bai1_PT_Bac_Nhat {
	public static void main(String[] args) {
		Scanner xh = new Scanner(System.in);
		int a, b;
		float x;
		
		System.out.println("nhập A và B: ");
		a = xh.nextInt();
		b = xh.nextInt();
		
		if(a == 0) {
			
			if(b == 0) {
				System.out.println("phương trình vô số nghiệm");
			}else if(b != 0){
					System.out.println("phương trình vô nghiệm");

				}
		}
		else {
			x = -b/a;
			System.out.println("phương trình có nghiệm: " + x);

		}
	}
}
