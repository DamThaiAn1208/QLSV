package source;

import java.util.Objects;

public class NhanVien implements Comparable<NhanVien>{
	public String tenNV;
	public String id;
	public double doanhSo;
	
	public NhanVien(String tenNV,String id,double doanhSo) {
		super();
		this.tenNV = tenNV;
		this.id=id;
		this.doanhSo = doanhSo;
	}
	public NhanVien() {
		super();
	}
	
	public String getTenNV() {
		return tenNV;
	}
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	
	@Override
	public String toString() {
		return "NhanVien " + tenNV+" " +id;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(tenNV);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhanVien other = (NhanVien) obj;
		return Objects.equals(tenNV, other.tenNV);
	}

	@Override
	public int compareTo(NhanVien nhanVien) {
		return Double.compare(this.doanhSo, nhanVien.doanhSo);
	}
}
