package Bai_1_a;

import java.util.ArrayList;
import java.util.Random;

import source.NhanVien;

public class DanhSachNV {
	private ArrayList<NhanVien> al;
	
	public DanhSachNV() {
		al = new ArrayList<>();
	}
	
	public void themNV(NhanVien nhanVien) {
		al.add(nhanVien);
	}
	
	public String ranDomNV() {
		int index = new Random().nextInt(al.size());
		return al.stream().skip(index).findFirst().orElse(null).getTenNV();
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		for(NhanVien x: al) {
			s.append("Ten Nhan Vien: ").append(x.tenNV).append(" id: ").append(x.id).append("\n");
		}
		return s.toString();
	}
}
