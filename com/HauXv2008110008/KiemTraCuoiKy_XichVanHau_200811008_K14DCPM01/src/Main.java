import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Pattern;

public class Main {
	public static List<HangHoa> H_Hoa;
	public static Scanner sc = new Scanner(System.in);
	public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public static void main(String[] args) {
		H_Hoa = new ArrayList<>();

		// dữ liệu có sẵn
		DuLieuCoSan();

		int luachon;
		do {
			System.out.println("____________MENU____________");
			System.out.println(""
					+ "1. Thêm hàng hóa\n"
					+ "2. sửa hàng hóa\n"
					+ "3. xóa hàng hóa\n"
					+ "4. Tìm kiếm\n"
					+ "5. Sắp xếp\n"
					+ "6. Thống kê\n"
					+ "0. Thoát ");
			System.out.println("____________________________");
			System.out.print("Chọn chức năng: ");
			luachon = sc.nextInt();
			switch (luachon) {
			case 1: // Thêm hàng hóa
				themHangHoa();
				break;
			case 2: // sửa hàng hóa
				sc.nextLine();
				System.out.println("Nhập mã hàng cần sửa: ");
				String mH = sc.nextLine();
				suaHangHoa(mH);
				break;
			case 3: // xóa hàng hóa
				sc.nextLine();
				System.out.println("Nhập mã hàng cần xóa: ");
				String maHang = sc.nextLine();
				xoaHangHoa(maHang);
				break;
			case 4: // tìm kiếm
				int timkiem;
				do {
					System.out.println("___HÃY NHẬP LỰA CHỌN___");
					System.out.println("1. Tìm theo loại");
					System.out.println("2. Tìm theo khoảng giá");
					System.out.println("3. Tìm theo khoảng ngày nhập");
					System.out.println("0. Thoát");
					timkiem = sc.nextInt();
					switch (timkiem) {
					// Tìm kiếm theo loại
					case 1:
						int TT_loai;
						do {
							System.out.println("Chọn loại hàng: ");
							System.out.println("1. Thực Phẩm	2. Sành Sứ	3. Điện Máy	");
							System.out.print("hãy lựa Chọn: ");
							TT_loai = sc.nextInt();
							switch (TT_loai) {
							case 1:
								timKiemTheoLoai(Loai.Thuc_Pham);
								break;
							case 2:
								timKiemTheoLoai(Loai.Sanh_Su);
								break;
							case 3:
								timKiemTheoLoai(Loai.Dien_May);
								break;
							default:
								System.out.println("nhập sai, hãy nhập lại...");
								break;
							}
						} while (TT_loai != 0);
						break;
					// Tìm kiếm theo giá
					case 2:
						System.out.println("_______NHẬP GIÁ_______");
						System.out.print("Giá từ: ");
						double giaTu = sc.nextDouble();
						System.out.print("giá đến: ");
						double giaDen = sc.nextDouble();
						sc.nextLine();
						timKiemTheoKhoangGia(giaTu, giaDen);
						break;
					// Tìm kiếm theo ngày
					case 3:
						sc.nextLine();
						System.out.println("_______NHẬP KHOẢNG NGÀY_______");
						System.out.println("_______Từ ngày: ");
						String tuNgay;
						while (true) {
							System.out.println("Nhập ngày ví dụ: 12/21/2021: ");
							tuNgay = sc.nextLine();
							if (pattern.matcher(tuNgay).matches()) {
								break;
							} else {
								System.out.println("nhập chưa đúng định dạng. Hãy nhập lại");
							}
						}
						LocalDate tu = LocalDate.parse(tuNgay, formatter);
						System.out.println("____________Đến ngày: ");
						String denNgay;
						while (true) {
							System.out.println("Nhập ngày ví dụ: 12/21/2021: : ");
							denNgay = sc.nextLine();
							if (pattern.matcher(denNgay).matches()) {
								break;
							} else {
								System.out.println("nhập chưa đúng định dạng. Hãy nhập lại");
							}
						}
						LocalDate den = LocalDate.parse(denNgay, formatter);
						timKiemTheoKhoangNgay(tu, den);
						break;
					default:
						System.out.println("nhập sai, hãy nhập lại...");
						break;
					}
				} while (timkiem != 0);
				break;
			case 5: // sắp xếp
				int f2;
				int tg = 0; // biến check xem tăng hay giảm
				do {
					System.out.println("_______BẠN CHỌN_______");
					System.out.println("1. Sắp xếp tăng đần		2. Sắp xếp giảm dần");
					System.out.print("Bạn chọn: ");
					f2 = sc.nextInt();
					switch (f2) {
					case 1:
						tg = 1;
						break;
					case 2:
						tg = -1;
						break;
					case 0:
						break;
					default:
						System.out.println("nhập sai, hãy nhập lại...!");
						break;
					}

					if (tg != 0) { // khi đã chọn sắp xếp tăng hoặc giảm thì cho chọn sắp xếp theo giá và ngày
						int f3;
						do {
							System.out.println("___ HÃY CHỌN ___");
							System.out.println("1. Sắp xếp theo giá nhập");
							System.out.println("2. Sắp xếp theo ngày nhập");
							System.out.println("3. Sắp xếp theo loại và ngày nhập");
							System.out.println("4. Sắp xếp theo loại và giá nhập");
							System.out.println("0. Quay lại");
							System.out.print("chọn: ");
							f3 = sc.nextInt();
							sc.nextLine();
							switch (f3) {
							case 1:
								sapXepTheoGia(tg);
								break;
							case 2:
								sapXepTheoNgay(tg);
								break;
							case 3:
								sapXepTheoLoaiVaNgayNhap(tg);
								break;
							case 4:
								sapXepTheoLoaiVaGia(tg);
								break;
							default:
								System.out.println("nhập sai, hãy nhập lại...");
								break;
							}
						} while (f3 < 0 || f3 > 4);
					}
				} while (f2 > 2 || f2 < 0);

				break;
			case 6: // thống kê
				int future4;
				do {
					System.out.println("___HÃY NHẬP LỰA CHỌN___");
					System.out.println("1. Thống kê tổng số lượng hàng hóa");
					System.out.println("2. Thống kê tổng giá trị nhập kho");
					System.out.println("3. Thống kê số lượng từng loại hàng");
					System.out.println("0. Quay lại");
					System.out.print("Chọn: ");
					future4 = sc.nextInt();
					sc.nextLine();
					switch (future4) {
					case 1:
						thongKeTongSLHang();
						break;
					case 2:
						thongKeTongGiaTriKho();
						break;
					case 3:
						thongKeSLTungLoai();
						break;
					case 0:
						break;
					default:
						System.out.println("nhập sai, hãy nhập lại...");
						break;
					}
				} while (future4 < 0 || future4 > 3);
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("nhập sai, hãy nhập lại...");
				break;
			}
		} while (luachon != 0);
	}
	// định dạng ngày tháng năm
		public static Pattern pattern = Pattern.compile("^\\d{1,2}[/]\\d{1,2}[/]\\d{4}$");
	//
	private static void DuLieuCoSan() {
	//thực phẩm
		H_Hoa.add(new HangHoa(Loai.Thuc_Pham, "TP_01", "rau củ quả", 2500, 50, LocalDate.parse("01/01/2010", formatter)));
		H_Hoa.add(new HangHoa(Loai.Thuc_Pham, "TP_02", "thịt cá", 1500, 15, LocalDate.parse("02/02/2012", formatter)));
		H_Hoa.add(new HangHoa(Loai.Thuc_Pham, "TP_03", "thức ăn nhanh", 2000, 60, LocalDate.parse("03/03/2013", formatter)));
	//sành sứ
		H_Hoa.add(new HangHoa(Loai.Sanh_Su, "SS_01", "chén bát", 1200, 3, LocalDate.parse("04/04/2014", formatter)));
		H_Hoa.add(new HangHoa(Loai.Sanh_Su, "SS_02", "chậu cây", 4500, 6, LocalDate.parse("05/05/2015", formatter)));
		H_Hoa.add(new HangHoa(Loai.Sanh_Su, "SS_03", "bình trà các kiểu", 7000, 12, LocalDate.parse("06/06/2016", formatter)));
	//đồ điện
		H_Hoa.add(new HangHoa(Loai.Dien_May, "DM_01", "tủ lạnh", 8000000, 150, LocalDate.parse("07/07/2017", formatter)));
		H_Hoa.add(new HangHoa(Loai.Dien_May, "DM_02", "tivi", 5000000, 25, LocalDate.parse("08/08/2018", formatter)));
		H_Hoa.add(new HangHoa(Loai.Dien_May, "DM_03", "máy giặc", 3500000, 120, LocalDate.parse("09/09/2019", formatter)));
	}
	private static void timKiemTheoKhoangNgay(LocalDate tuNgay, LocalDate denNgay) {
		List<HangHoa> hangs = new ArrayList<>();
		for (int i = 0; i < H_Hoa.size(); i++) {
			if (H_Hoa.get(i).getNgayNhapKho().isAfter(tuNgay) && H_Hoa.get(i).getNgayNhapKho().isBefore(denNgay)) {
				hangs.add(H_Hoa.get(i));
			}
		}
		if (hangs.size() == 0) {
			System.out.println("Không có sản phẩm nào");
		} else {
			xemHang(hangs);
		}
	}

	private static void timKiemTheoKhoangGia(double giaTu, double giaDen) {
		List<HangHoa> hangs = new ArrayList<>();
		for (int i = 0; i < H_Hoa.size(); i++) {
			if (H_Hoa.get(i).getGiaNhap() > giaTu && H_Hoa.get(i).getGiaNhap() < giaDen) {
				hangs.add(H_Hoa.get(i));
			}
		}
		if (hangs.size() == 0) {
			System.out.println("Không có sản phẩm nào");
		} else {
			xemHang(hangs);
		}
	}

	private static void timKiemTheoLoai(Loai thucpham) {
		List<HangHoa> hangs = new ArrayList<>();
		for (int i = 0; i < H_Hoa.size(); i++) {
			if (H_Hoa.get(i).getLoai() == thucpham) {
				hangs.add(H_Hoa.get(i));
			}
		}
		if (hangs.size() == 0) {
			System.out.println("Không có sản phẩm nào");
		} else {
			xemHang(hangs);
		}
	}
	private static void thongKeSLTungLoai() {
		int sDienMay = 0, sSanhSu = 0, sThucPham = 0;
		for (HangHoa h : H_Hoa) {
			if (h.getLoai().compareTo(Loai.Sanh_Su) == 0) {
				sSanhSu += h.getSlTonKho();
			} else if (h.getLoai().compareTo(Loai.Thuc_Pham) == 0) {
				sThucPham += h.getSlTonKho();
			} else {
				sDienMay += h.getSlTonKho();
			}
		}
		System.out.println("____THỐNG KÊ SỐ LƯỢNG TỪNG LOẠI____");
		System.out.printf("%20s%20s%20s%20s\n", "Loại", "ĐIỆN MÁY", "SÀNH SỨ", "THỰC PHẨM");
		System.out.printf("%20s%20s%20s%20s\n", "Số lượng", sDienMay + "", sSanhSu + "", sThucPham + "");
	}

	private static void thongKeTongGiaTriKho() {
		long K = 0;
		for (HangHoa h : H_Hoa) {
			K += h.getGiaNhap();
		}
		System.out.println("Tổng giá trị trong kho: " + K);
	}

	private static void thongKeTongSLHang() {
		int s = 0;
		for (HangHoa h : H_Hoa) {
			s += h.getSlTonKho();
		}
		System.out.println("Tổng số hàng trong kho là: " + s);
	}

	private static void sapXepTheoLoaiVaGia(int flag) {
		Collections.sort(H_Hoa, new Comparator<HangHoa>() {
			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				if (o1.getLoai().compareTo(o2.getLoai()) != 0) {
					return flag * o1.getLoai().compareTo(o2.getLoai());
				} else {
					double result = flag * (o1.getGiaNhap() - o2.getGiaNhap());
					if (result > 0)
						return 1;
					else if (result < 0)
						return -1;
					else
						return 0;
				}
			}
		});
		xemHang(H_Hoa);
	}

	private static void sapXepTheoLoaiVaNgayNhap(int flag) {
		Collections.sort(H_Hoa, new Comparator<HangHoa>() {
			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				if (o1.getLoai().compareTo(o2.getLoai()) != 0) {
					return flag * o1.getLoai().compareTo(o2.getLoai());
				} else {
					if (flag == 1) {
						if (o1.getNgayNhapKho().isBefore(o2.getNgayNhapKho())) {
							return -1;
						} else {
							return 1;
						}
					} else {
						if (o1.getNgayNhapKho().isBefore(o2.getNgayNhapKho())) {
							return 1;
						} else {
							return -1;
						}
					}
				}
			}
		});
		xemHang(H_Hoa);
	}

	private static void sapXepTheoNgay(int flag) {
		Collections.sort(H_Hoa, new Comparator<HangHoa>() {
			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				if (flag == 1) {
					if (o1.getNgayNhapKho().isBefore(o2.getNgayNhapKho())) {
						return -1;
					} else {
						return 1;
					}
				} else {
					if (o1.getNgayNhapKho().isBefore(o2.getNgayNhapKho())) {
						return 1;
					} else {
						return -1;
					}
				}
			}
		});
		xemHang(H_Hoa);
	}

	private static void sapXepTheoGia(int flag) {
		Collections.sort(H_Hoa, new Comparator<HangHoa>() {
			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				double result = flag * (o1.getGiaNhap() - o2.getGiaNhap());
				if (result > 0)
					return 1;
				else if (result < 0)
					return -1;
				else
					return 0;
			}
		});
		System.out.println("____DANH SÁCH HÀNG HÓA SẮP XẾP THEO GIÁ____");
		xemHang(H_Hoa);
	}

	private static void xemHang(List<HangHoa> hangs) {
		System.out.printf("%20s%20s%20s%20s%20s%20s\n", "Loại Hàng", "Mã Hàng", "Tên Hàng", "Giá Nhập", "SL Tồn Kho",
				"Ngày Nhập Kho");
		for (HangHoa ha : hangs) {
			System.out.printf("%20s%20s%20s%20s%20s%20s\n", ha.getLoai(), ha.getMaHang(), ha.getTenHang(),
					ha.getGiaNhap() + "", ha.getSlTonKho() + "", ha.getNgayNhapKho());
		}
	}
	private static void themHangHoa() {
		sc.nextLine();
		Loai loai = Loai.Thuc_Pham;
		int ch;
		do {
			System.out.println("Chọn loại hàng: ");
			System.out.println("1. THỰC PHẨM	2. SÀNH SỨ	3. ĐIỆN MÁY");
			System.out.print("Chọn: ");
			ch = sc.nextInt();
			sc.nextLine();
			switch (ch) {
			case 1:
				loai = Loai.Thuc_Pham;
				break;
			case 2:
				loai = Loai.Sanh_Su;
				break;
			case 3:
				loai = Loai.Dien_May;
				break;
			default:
				System.out.println("Loại hàng không tồn tại. Hãy chọn lại");
			}
		} while (ch > 3 || ch < 1);

		String maHang;
		int check = 0;
		do {
			System.out.println("Nhập mã hàng: ");
			maHang = sc.nextLine();
			if (maHang.compareTo("") == 0) {
				System.out.println("Mã hàng không được để trống. Hãy nhập lại!");
			} else {
				maHang = loai + maHang;
				check = kiemTraMaHangTonTai(0, H_Hoa.size() - 1, maHang);
				if (check != -1) {
					System.out.println("Mã hàng đã tồn tại. Hãy nhập lại");
				}
			}

		} while (maHang.compareTo("") == 0 || check != -1);

		System.out.println("Nhập tên hàng: ");
		String tenHang = sc.nextLine();

		System.out.println("Nhập giá nhập: ");
		double giaNhap = sc.nextDouble();

		System.out.println("Nhập số lượng tồn kho: ");
		int slTonKho = sc.nextInt();
		sc.nextLine();
		String date;
		while (true) {
			System.out.println("Nhập ngày ví dụ: 12/21/2021: ");
			date = sc.nextLine();
			if (pattern.matcher(date).matches()) {
				break;
			} else {
				System.out.println("nhâp chưa đúng định dạng. Hãy nhập lại");
			}
		}
		LocalDate ngayNhap = LocalDate.parse(date, formatter);
		HangHoa hangHoa = new HangHoa(loai, maHang, tenHang, giaNhap, slTonKho, ngayNhap);
		H_Hoa.add(hangHoa);
		System.out.println("*** Đã Thêm thành ***");
	}
	private static void suaHangHoa(String maHang) {
		int i = kiemTraMaHangTonTai(0, H_Hoa.size() - 1, maHang);
		if (i != -1) {
			System.out.println("___NHẬP LẠI THÔNG TIN HÀNG: " + maHang + " ____");

			System.out.println("Nhập tên hàng: ");
			H_Hoa.get(i).setTenHang(sc.nextLine());

			System.out.println("Nhập giá nhập: ");
			H_Hoa.get(i).setGiaNhap(sc.nextDouble());

			System.out.println("Nhập số lượng tồn kho: ");
			H_Hoa.get(i).setSlTonKho(sc.nextInt());
			sc.nextLine();
			String date;
			while (true) {
				System.out.println("Nhập ngày ví dụ: 12/21/2021: ");
				date = sc.nextLine();
				if (pattern.matcher(date).matches()) {
					break;
				} else {
					System.out.println("nhập chưa đúng định dạng. Hãy nhập lại");
				}
			}
			LocalDate ngayNhap = LocalDate.parse(date, formatter);
			H_Hoa.get(i).setNgayNhapKho(ngayNhap);
			System.out.println("=== SỬA HÀNG THÀNH CÔNG ===");
		} else {
			System.out.println("Mã hàng không tồn tại");
		}
	}
	private static void xoaHangHoa(String maHang) {
		int i = kiemTraMaHangTonTai(0, H_Hoa.size() - 1, maHang);
		if (i != -1) {
			H_Hoa.remove(i);
			System.out.println("Xóa hàng " + maHang + " thành công");
		} else {
			System.out.println("Mã hàng không tồn tại");
		}
	}
	// tìm kiếm nhị phân
	private static int kiemTraMaHangTonTai(int l, int r, String maHang) {
		Collections.sort(H_Hoa, new Comparator<HangHoa>() {
			@Override //ghi đề P.T
			public int compare(HangHoa _HH1, HangHoa _HH2) {
				return _HH1.getMaHang().compareTo(_HH2.getMaHang());
			}});
		if (r >= l) {
			int mid = l + (r - l) / 2;
			// if 1 P.tử center
			if (H_Hoa.get(mid).getMaHang().compareTo(maHang) == 0)	return mid;
			// if P.tử < center -> left side
			if (H_Hoa.get(mid).getMaHang().compareTo(maHang) > 0)	return kiemTraMaHangTonTai(l, mid - 1, maHang);
			// else -> right
			return kiemTraMaHangTonTai(mid + 1, r, maHang);
		}
		// TH: zero
		return -1;
	}
}