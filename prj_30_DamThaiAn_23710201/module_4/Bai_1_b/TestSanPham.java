package Bai_1_b;

import source.NhanVien;

public class TestSanPham {
	public static void main(String[] args) {
		NhanVien NV1 = new NhanVien("Đàm Thái An","a1",300000);
		NhanVien NV2 = new NhanVien("Đỗ Phú Hiệp","a2",300000);
		NhanVien NV3 = new NhanVien("Nguyễn Nhựt Hảo","a3",300000);
		NhanVien NV4 = new NhanVien("Hoàng Phước Thành Công","a4",400000);
		NhanVien NV5 = new NhanVien("Hoàng Phước Thành Công","a5",300000);
		
		DanhSachSanPham l = new DanhSachSanPham();
		
		l.themNhanVien(NV1);
		l.themNhanVien(NV2);
		l.themNhanVien(NV3);
		l.themNhanVien(NV4);
		l.themNhanVien(NV5);
		
		System.out.println(l.toString());
	}
}
