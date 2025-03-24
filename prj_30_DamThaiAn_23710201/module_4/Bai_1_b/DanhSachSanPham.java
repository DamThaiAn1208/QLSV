package Bai_1_b;

import java.util.HashSet;

import source.NhanVien;

public class DanhSachSanPham {
	public HashSet<NhanVien> al;

	public DanhSachSanPham() {
		al = new  HashSet<>();
	}
	
	public void themNhanVien(NhanVien nhanVien) {
        al.add(nhanVien);
    }
	
	@Override
	public String toString(){
		StringBuilder s = new StringBuilder();
		for(NhanVien x : al) {
			s.append("Tên Sản Phẩm: ").append(x.tenNV).append("\n");
		}
		return s.toString();
	}
}
