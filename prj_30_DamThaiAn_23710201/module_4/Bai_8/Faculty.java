package Bai_8;

public class Faculty extends Person{
	private String office;
	private String facultyID;
	
	
	public Faculty(String lastName, String firstName, String facultyID, String office) {
		super(lastName, firstName);
		setFacultyID(facultyID);
		setOffice(office);
	}
	
	public Faculty() {
		super();
	}
	
	
	public String getFacultyID() {
		return facultyID;
	}
	
	public String getOffice() {
		return office;
	}
	
	public void setFacultyID(String facultyID) {
		this.facultyID = facultyID;
	}
	
	public void setOffice(String office) {
		this.office = office;
	}
	
	@Override
	public String toString() {
		return String.format("Giảng viên: %-10s ,Mã giảng viên: %s Khoa( %s )",super.toString(),getFacultyID(),getOffice());
	}
}
