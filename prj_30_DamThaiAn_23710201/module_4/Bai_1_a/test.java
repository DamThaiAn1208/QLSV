package Bai_1_a;

import source.NhanVien;

public class test {
	public static void main(String[] args) {
		NhanVien NV1 = new NhanVien("Đàm Thái An","a1",300000);
		NhanVien NV2 = new NhanVien("Đỗ Phú Hiệp","a2",300000);
		NhanVien NV3 = new NhanVien("Nguyễn Nhựt Hảo","a3",300000);
		NhanVien NV4 = new NhanVien("Hoàng Phước Thành Công","a5",300000);
		
		DanhSachNV l = new DanhSachNV();
		l.themNV(NV1);
		l.themNV(NV2);
		l.themNV(NV3);
		l.themNV(NV4);
		
		System.out.println("Nhân viên được nhận quà tặng: "+l.ranDomNV());
		
		System.out.println(l.toString());
	}
}
