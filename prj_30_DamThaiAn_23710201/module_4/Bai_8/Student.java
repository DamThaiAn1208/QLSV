package Bai_8;

public class Student extends Person{
	private int yearMatriculated;
	private String studentID;
	
	
	public Student(String lastName, String firstName, String studentID, int yearMatriculated) {
		super(lastName, firstName);
		setYearMatriculated(yearMatriculated);
		setStudentID(studentID);
	}
	
	public Student() {
		super();
	}


	public String getStudentID() {
		return studentID;
	}
	
	public int getYearMatriculated() {
		return yearMatriculated;
	}
	
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	
	public void setYearMatriculated(int yearMatriculated) {
		this.yearMatriculated = yearMatriculated;
	}
	
	@Override
	public String toString() {
		return String.format("%-10s%-30s%-20s",getStudentID(),super.toString(),getYearMatriculated());
	}
}
