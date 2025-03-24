package source;

public class Chuoi {
	private String chuoi;

	public Chuoi() {
		super();
	}

	public String getChuoi() {
		return chuoi;
	}

	public void setChuoi(String chuoi) {
		this.chuoi = chuoi;
	}
	

	@Override
	public String toString() {
		return String.format("Chuoi :%s", chuoi);
	}
	
	
}
