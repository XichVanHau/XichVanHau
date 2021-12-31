import java.util.Date;

public enum Loai {
	Thuc_Pham, Sanh_Su, Dien_May;
}
/*
Xây dựng chương trình Quản lý hàng hóa trong kho của 1 siêu thị. Hàng hóa có các thông tin sau các
	- Loại: thực phẩm, sành sứ, điện máy. 
	- Mã hàng (không được sửa, không được để trống)
		+ giúp phân biệt giữa các hàng hóa với nhau
	- Tên hàng hóa
	- Giá nhập
	- Số lượng tồn kho
	- Ngày nhập kho
Các chức năng của chương trình:
	- Menu: để người dùng lựa chọn chức năng
	- Thêm, xóa, sửa Hàng hóa 
		* nâng cao: theo mã của 1 hàng hóa bất kỳ
		
	- tìm kiếm theo
		+ loại
		+ giá
			* nâng cao: tìm theo khoảng giá từ ... đến ....
		+ ngày nhập
			* nâng cao: tìm theo khoảng từ ngày đến ngày
		
	- sắp xếp theo (tăng dần, giảm dần)
		+ giá nhập
		+ ngày nhập
			* nâng cao: 
				** theo loại và theo ngày nhập
				** theo loại và theo giá
	- thống kê: 
		+ tổng số lượng hàng hóa
		+ tổng giá trị nhập kho
		+ số lượng từng loại hàng
*/