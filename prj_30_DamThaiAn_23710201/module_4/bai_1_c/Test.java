package bai_1_c;

import source.NhanVien;

public class Test {
	public static void main(String[] args) {
		NhanVien NV1 = new NhanVien("Đàm Thái An","a1",300000);
		NhanVien NV2 = new NhanVien("Đỗ Phú Hiệp","a2",300000);
		NhanVien NV3 = new NhanVien("Nguyễn Nhựt Hảo","a3",300000);
		NhanVien NV4 = new NhanVien("Hoàng Phước Thành Công","a5",300000);
		NhanVien NV5 = new NhanVien("Hoàng Phước Thành Công","a5",300000);
		NhanVien NV6 = new NhanVien("Hoàng Phước Thành Công","a3",300000);
		
		DanhSachSanPham hm = new DanhSachSanPham();
		hm.themNV(NV1);
		hm.themNV(NV2);
		hm.themNV(NV3);
		hm.themNV(NV4);
		hm.themNV(NV5);
		hm.themNV(NV6);
		
		System.out.println(hm.nhanVienPhoBien());
		
		System.out.println(hm.toString());
	}
}
