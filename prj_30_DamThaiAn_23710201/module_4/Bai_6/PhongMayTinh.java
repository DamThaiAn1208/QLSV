package Bai_6;

public class PhongMayTinh extends PhongHoc{
	protected int mayTinh;

	public PhongMayTinh(String maPhong, String dayNha, double dienTich, int bongDen, int mayTinh) throws Exception {
		super(maPhong, dayNha, dienTich, bongDen);
		setMayTinh(mayTinh);
	}

	public PhongMayTinh(String maPhong, String dayNha, double dienTich, int bongDen) throws Exception {
		super(maPhong, dayNha, dienTich, bongDen);
	}

	public int getMayTinh() {
		return mayTinh;
	}

	public void setMayTinh(int mayTinh) {
		this.mayTinh = mayTinh;
	}
	
	public boolean datChuan() {
		return super.datChuanBongDen()&&(dienTich/mayTinh>1.5);
	}
	
	@Override
	public String getTieuDe() {
		return String.format("%s%-10s",super.getTieuDe(),"Số máy tính");
	}
	
	@Override
	public String layThongTinPhong() {
		return String.format("%s%-10s",super.toString(),getMayTinh());
	}
	
}
