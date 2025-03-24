package Bai_1_e;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.TreeSet;

import source.NhanVien;

public class DanhSachNV {
	private TreeSet<NhanVien> ts;
	
	public DanhSachNV() {
		ts = new TreeSet<NhanVien>();
	}
	
	public void ThemNV(NhanVien nhanVien) {
		ts.add(nhanVien);
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		Locale local = new Locale("vi","vn");
		NumberFormat fmt = NumberFormat.getCurrencyInstance(local);
		for(NhanVien x: ts) {
			s.append("Tên nhân viên: ").append(x.tenNV).append(" Doanh số: ").append(fmt.format(x.doanhSo)).append("\n");
		}
		return s.toString();
	}
	
}
