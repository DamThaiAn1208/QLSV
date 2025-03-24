package Bai_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//import java.util.Iterator;
import java.util.List;

import OnTap.Employee;

public class DanhSachPhongHoc {
	private List<PhongHoc> l;

	public DanhSachPhongHoc() {
		super();
		l = new ArrayList<PhongHoc>();
	}
	
	public boolean addPhongHoc(PhongHoc x) {
		if(l.contains(x)) {
			return false;
		}else {
			l.add(x);
			return true;
		}
	}
	
	
	@Override
	public String toString() {
		String s = "";
		String temp ="";
		s+=String.format("%-15s%-10s%-15s%-15s%-20s%-10s\n","Mã phòng","Dãy nhà","Diện tích","Số bóng đèn","Phòng","Tình trạng");
		for(PhongHoc x: l) {
			if(x.datChuan())
				temp ="x";
			else
				temp ="";
			s+=String.format("%s%-20s%-10s\n",x.toString(),x.getClass().getSimpleName(),temp);
		}
		return s.toString();
	}
	
	public String layThongTinTheoMaPhong(String k) {
		String s="";
		for(PhongHoc x:l) {
			if(x.getMaPhong().compareToIgnoreCase(k)==0) {
				if(x instanceof PhongHocLyThuyet) {
					s+=x.getTieuDe()+"\n";
					s+=x.layThongTinPhong();
				}else if(x instanceof PhongMayTinh) {
					s+=x.getTieuDe()+"\n";
					s+=x.layThongTinPhong();
				}else {
					s+=x.getTieuDe()+"\n";
					s+=x.layThongTinPhong();
				}
			}
		}
		return s;
	}
	
	public void sapXepTangTheoDayNha() {
		Collections.sort(l, new Comparator<PhongHoc>(){
			@Override
	        public int compare(PhongHoc o1, PhongHoc o2) {
	            return o1.getDayNha().compareTo(o2.getDayNha());
	        }
		});
	}
	
	public void sapXepGiamTheoDienTich() {
		Collections.sort(l,new Comparator<PhongHoc>() {
			@Override
			public int compare(PhongHoc o1,PhongHoc o2) {
				return Double.compare(o2.getDienTich(), o1.getDienTich());
			}
		});
	}
	
	public void sapXepDanhSachTangDanTheoSoBongDen() {
		Collections.sort(l,new Comparator<PhongHoc>() {
			@Override
			public int compare(PhongHoc o1,PhongHoc o2) {
				return Integer.compare(o1.getBongDen(),o2.getBongDen());
			}
		});
	}
	
	
	public boolean capNhatSoMayTinh(String k,int n) {
		for(PhongHoc x:l) {
			if(x.getMaPhong().compareToIgnoreCase(k)==0) {
				if(x instanceof PhongMayTinh) {
					((PhongMayTinh) x).setMayTinh(n);
					return true;
				}
			}
		}
		return false;
	}
	
//	public boolean xoaPhongHocTheoMaPhong(String k) {
//		Iterator<PhongHoc> i = l.iterator();
//		while(i.hasNext()) {
//			PhongHoc x = i.next();
//			if(x.getMaPhong().compareToIgnoreCase(k)==0) {
//				i.remove();
//				return true;
//			}
//		}
//		return false;
//	}
	
	public boolean xoaPhongHocTheoMaPhong(String k) {
		return l.removeIf(x->x.getMaPhong().compareToIgnoreCase(k)==0);
	}
	
	public int tongSoPhongHoc() {
		return l.size();
	}
	
	public String layDanhSachCacPhongMayCo60May() {
		String s="";
		for(PhongHoc x:l) {
			if(x instanceof PhongMayTinh) {
				if(((PhongMayTinh) x).getMayTinh()==60) {
					s+=x.getTieuDe()+"\n"+x.layThongTinPhong()+"\n";
					
				}
			}
		}
		return s;
	}
}