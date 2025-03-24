package bai_1_c;

import java.util.HashMap;
import source.NhanVien;

public class DanhSachSanPham {
	private HashMap<NhanVien, Integer> hm;
	
	public DanhSachSanPham() {
		hm = new HashMap<>();
	}
	
	public void themNV(NhanVien nhanVien) {
//		String ten = nhanVien.tenNV;
		int count = hm.getOrDefault(nhanVien, 0);
		hm.put(nhanVien, count +1);
	}
	
	public String nhanVienPhoBien() {
		int max=0;
		NhanVien temp = null;
		StringBuilder s = new StringBuilder();
		
		for(HashMap.Entry<NhanVien , Integer> x : hm.entrySet()) {
			if(x.getValue()>max) {
				max = x.getValue();
				temp = x.getKey();
			}
		}
		
		s.append("Tên Sản Phẩm: ").append(temp.tenNV);
		return s.toString();
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		for(HashMap.Entry<NhanVien,Integer> x : hm.entrySet()) {
			s.append("Tên nhân viên: ").append(x.getKey().tenNV).append(" id : ").append(x.getKey().id).append("\n");
		}
		return s.toString();
	}
	
}
