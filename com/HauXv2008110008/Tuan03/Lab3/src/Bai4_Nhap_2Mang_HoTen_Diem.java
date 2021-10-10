import java.util.Scanner;

public class Bai4_Nhap_2Mang_HoTen_Diem {
    public static void main(String[] args) {
        Scanner bienNhap = new Scanner(System.in);
        System.out.print("Nhập số sinh viên cần nhập thông tin: ");
        int n = bienNhap.nextInt();
        double diem[] = new double[n];
        String hoTen[] = new String[n];
        for(int i = 0;i < n;i++){
            bienNhap.nextLine();
            System.out.printf(">>Nhập họ tên sinh viên thứ %d: ", i+1);
            hoTen[i] = bienNhap.nextLine();
            System.out.printf("Nhập điểm sinh viên thứ %d: ", i+1);
            diem[i] = bienNhap.nextDouble();
        }
        for(int i = 0;i < n - 1;i++){
            for(int j = i + 1;j < n;j++){
                if(diem[i] > diem[j]){
                    double tam = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tam;
                    String temp = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = temp;
                }
            }
        }
        for(int i = 0;i < n;i++){
            if(diem[i] >= 9){
                System.out.printf("\nSinh viên thứ %d: ", i+1);
                System.out.printf("%s - %f điểm - Học lực xuất sắc!", hoTen[i], diem[i]);
            }
            else if(diem[i] >= 7.5){
                System.out.printf("\nSinh viên thứ %d: ", i+1);
                System.out.printf("%s - %f điểm - Học lực giỏi!", hoTen[i], diem[i]);
            }
            else if(diem[i] >= 6.5){
                System.out.printf("\nSinh viên thứ %d: ", i+1);
                System.out.printf("%s - %f điểm - Học lực khá!", hoTen[i], diem[i]);
            }
            else if(diem[i] >= 5){
                System.out.printf("\nSinh viên thứ %d: ", i+1);
                System.out.printf("%s - %f điểm - Học lực trung bình!", hoTen[i], diem[i]);
            }
            else{
                System.out.printf("\nSinh viên thứ %d: ", i+1);
                System.out.printf("%s - %f điểm - Học lực yếu!", hoTen[i], diem[i]);
            }   
        }
        bienNhap.close();
    }
}
/*
Viết chương trình nhập 2 mảng họ tên và điểm của sinh viên.
Xuất 2 mảng đã nhập, mỗi sinh viên có thêm học lực 
	Yếu: điểm < 5 
	Trung bình: 5 <= điểm < 6.5 
	Khá: 6.5 <= điểm < 7.5 
	Giỏi: 7.5<= điểm < 9 
	Xuất sắc: điểm >= 9 
	Sắp xếp danh sách sinh viên đã nhập tăng dần theo điểm 
*/