public class SanPham {

    String tenSanPham;
    double donGia;
    double giamGia;
    float thueNhapKhau;

    //hàm tạo

    // in thông tin
    //hàm
    SanPham(){//hàm mặc định

    }
    

    public SanPham(String tenSanPham, double donGia, double giamGia, float thueNhapKhau) {
        this.tenSanPham = tenSanPham;
        this.donGia = donGia;
        this.giamGia = giamGia;
        this.thueNhapKhau = thueNhapKhau;
    }


    void inThongTin(){
        System.out.println("=============================");
        System.out.print("Tên SP: "+tenSanPham);
        System.out.print(" Đơn giá: "+donGia);
        System.out.print(" Giảm giá: "+giamGia);
        System.out.println(" Thuế nhập khẩu "+thueNhapKhau);
        
    }
    
}