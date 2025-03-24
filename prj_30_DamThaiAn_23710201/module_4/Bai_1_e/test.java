package Bai_1_e;

import source.NhanVien;

public class test {
	public static void main(String[] args) {
		NhanVien NV1 = new NhanVien("Đàm Thái An","a1",100000);
		NhanVien NV2 = new NhanVien("Đỗ Phú Hiệp","a2",500000);
		NhanVien NV3 = new NhanVien("Nguyễn Nhựt Hảo","a3",300000);
		NhanVien NV4 = new NhanVien("Hoàng Phước Thành Công","a5",400000);
		
		DanhSachNV l = new DanhSachNV();
		l.ThemNV(NV1);
		l.ThemNV(NV2);
		l.ThemNV(NV3);
		l.ThemNV(NV4);
		
		System.out.println(l.toString());
	}
}
