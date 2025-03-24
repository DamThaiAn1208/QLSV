package Bai_6;

public class PhongThiNghiem extends PhongHoc{
	protected String chuyenNganh;
	protected int sucChua;
	protected boolean bonRua;
	
	public PhongThiNghiem(String maPhong, String dayNha, double dienTich, int bongDen) throws Exception {
		super(maPhong, dayNha, dienTich, bongDen);
	}

	public PhongThiNghiem(String maPhong, String dayNha, double dienTich, int bongDen, String chuyenNganh, int sucChua,
			boolean bonRua) throws Exception {
		super(maPhong, dayNha, dienTich, bongDen);
		setChuyenNganh(chuyenNganh);
		setSucChua(sucChua);
		setBonRua(bonRua);
	}

	//getter
	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public int getSucChua() {
		return sucChua;
	}

	public boolean isBonRua() {
		return bonRua;
	}

	//setter
	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}

	public void setBonRua(boolean bonRua) {
		this.bonRua = bonRua;
	}
	
	@Override
	public boolean datChuan() {
		return super.datChuanBongDen() && isBonRua();
	}
	
	@Override 
	public String getTieuDe() {
		return String.format("%s%-15s%-10s%-10s",super.getTieuDe(),"Chuyên ngành","Sức chứa","Bồn rửa");
	}
	
	@Override
	public String layThongTinPhong() {
		String s = "";
		if(isBonRua()) {
			s="x";
		}
		return String.format("%s%-15s%-10s%-10s",super.toString(),getChuyenNganh(),getSucChua(),s);
	}
	
}
