package Bai_1_d;

import java.util.LinkedList;
import source.NhanVien;

public class DanhSachNVDiDuLich {
	private LinkedList<NhanVien> lk;
	
	public DanhSachNVDiDuLich() {
		lk = new LinkedList<>();
	}
	
	public void themNV(NhanVien nhanVien) {
		lk.addLast(nhanVien);
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("Danh sách nhân viên đăng kí đi du lịch\n");
		for(NhanVien x : lk) {
			s.append("Tên nhân viên: ").append(x.tenNV).append(" id: ").append(x.id).append("\n");
		}
		
		return s.toString();
	}
}
