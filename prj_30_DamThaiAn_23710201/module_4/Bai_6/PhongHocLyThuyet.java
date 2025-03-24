package Bai_6;

public class PhongHocLyThuyet extends PhongHoc{
	protected boolean mayChieu;

	public PhongHocLyThuyet(String maPhong, String dayNha, double dienTich, int bongDen) throws Exception {
		super(maPhong, dayNha, dienTich, bongDen);
	}

	public PhongHocLyThuyet(String maPhong, String dayNha, double dienTich, int bongDen, boolean mayChieu)
			throws Exception {
		super(maPhong, dayNha, dienTich, bongDen);
		setMayChieu(mayChieu);
	}

	public boolean isMayChieu() {
		return mayChieu;
	}

	public void setMayChieu(boolean mayChieu) {
		this.mayChieu = mayChieu;
	}

	@Override
	public boolean datChuan() {
		return super.datChuanBongDen() && isMayChieu();
	}
	
	@Override
	public String getTieuDe() {
		return String.format("%s%-10s",super.getTieuDe(),"Máy Chiếu");
	}
	
	@Override
	public String layThongTinPhong() {
		String s = "";
		if(isMayChieu()) {
			s = "x";
		}
		return String.format("%s%-10s",super.toString(),s);
	}
	
}
