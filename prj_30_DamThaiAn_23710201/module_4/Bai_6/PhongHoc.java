package Bai_6;

import java.util.Objects;

public abstract class PhongHoc {
	private String maPhong;
	protected String dayNha;
	protected double dienTich;
	protected int bongDen;
	
	
	public PhongHoc() {
		super();
	}
	
	

public PhongHoc(String maPhong, String dayNha, double dienTich, int bongDen) throws Exception {
		super();
		setMaPhong(maPhong);
		setDayNha(dayNha);
		setDienTich(dienTich);
		setBongDen(bongDen);
	}



//getter
	public String getMaPhong() {
		return maPhong;
	}


	public String getDayNha() {
		return dayNha;
	}


	public double getDienTich() {
		return dienTich;
	}


	public int getBongDen() {
		return bongDen;
	}

//setter
	public void setMaPhong(String maPhong)throws Exception {
		if(maPhong.isEmpty()) {
			throw new Exception("Ma phong khong duoc de trong");
		}else {
			this.maPhong = maPhong;
		}
	}


	public void setDayNha(String dayNha) throws Exception{
		if(dayNha.isEmpty()) {
			throw new Exception("Day nha khong duoc trong");
		}else {
			this.dayNha = dayNha;
		}
	}


	public void setDienTich(double dienTich) throws Exception{
		if(dienTich>0) {
			this.dienTich = dienTich;
		}else {
			throw new Exception("Dien tich lon hon 0");
		}
	}


	public void setBongDen(int bongDen) throws Exception {
		if(bongDen > 0 ) {
			this.bongDen = bongDen;
		}else {
			throw new Exception("Bong den lon hon 0");
		}
	}
	
	public boolean datChuanBongDen() {
		return bongDen>(dienTich/10);
	}
	
	public abstract boolean datChuan();
	public abstract String layThongTinPhong();

	@Override
	public int hashCode() {
		return Objects.hash(maPhong);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		PhongHoc other = (PhongHoc) obj;
		return Objects.equals(maPhong, other.maPhong);
	}
	
	@Override
	public String toString() {
		String s ="";
		if(datChuan()) {
			s="x";
		}
		return String.format("%-15s%-10s%-15s%-15s",getMaPhong(),getDayNha(),getDienTich(),getBongDen(),s);
	}
	
	public String getTieuDe() {
		return String.format("%-15s%-10s%-15s%-15s","Mã phòng","Dãy nhà","Diện tích","Số bóng đèn","Đạt chuẩn");
	}
	
	
}
