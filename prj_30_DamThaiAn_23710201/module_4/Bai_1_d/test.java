package Bai_1_d;
import source.NhanVien;

public class test {
	public static void main(String[] args) {
		NhanVien NV1 = new NhanVien("Đàm Thái An","a1",300000);
		NhanVien NV2 = new NhanVien("Đỗ Phú Hiệp","a2",300000);
		NhanVien NV3 = new NhanVien("Nguyễn Nhựt Hảo","a3",300000);
		NhanVien NV4 = new NhanVien("Hoàng Phước Thành Công","a5",300000);
	
		DanhSachNVDiDuLich lk = new DanhSachNVDiDuLich();
		lk.themNV(NV1);
		lk.themNV(NV2);
		lk.themNV(NV3);
		lk.themNV(NV4);
		
		System.out.println(lk.toString());
	}
}
