import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SanphamTestDrive {
    public static void main(String[] args) {
        List<SanPham> dsSanPham;
        dsSanPham = new ArrayList<>();

        dsSanPham.add(new SanPham("Mì Hảo", 2000, 0,0.1f));
        dsSanPham.add(new SanPham("Nước tương Chínu", 20000,10000, 0.2f));
        dsSanPham.add(new SanPham("Bánh ngọt", 1000, 3, 0));
        inDSSanPham(dsSanPham);

        sapxepTangDanTheoGia(dsSanPham);
        System.out.println("Sau khi sắp xếp: ");
        inDSSanPham(dsSanPham);
     SanPham sanPham = timSanPhamTheoTen("Mì Hảo", dsSanPham);
     if(sanPham != null){
         sanPham.inThongTin();
     }else{
         System.out.println("Không tìm thấy cái gì hết á...");
     }
    }
    void nhapDSSanPham(){
        //xử lý việc nhập
    }
    static void inDSSanPham(List<SanPham> dsSanPham){
        //xử lý in
        for (SanPham sanPham : dsSanPham) {
            sanPham.inThongTin();
        }

    }
   static void sapxepTangDanTheoGia(List<SanPham> dsSanPham){
        Comparator<SanPham> comp;
        comp = new Comparator<SanPham>(){

            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o1.donGia, o2.donGia);
            }
            
        };
        
        Collections.sort(dsSanPham,comp);

    }
     static SanPham timSanPhamTheoTen(String tenSP, List<SanPham> dsSanPham){
        SanPham result = null;
        for (SanPham sanPham : dsSanPham) {
            if(sanPham.tenSanPham.equals(tenSP)){
                result = sanPham;
            }
        }
        return result;
     }

        
 }