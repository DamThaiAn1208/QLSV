package Bai_8;

public class Enrolment{
	private String status;
	private String grade;
	private double numGrade;
	private Student student;
	

	public Enrolment(Student student,String status,String grade, double numGrade) {
		setGrade(grade);
		setStatus(status);
		setNumGrade(numGrade);
		setStudent(student);
	}
	
	public Enrolment() {
		super();
	}


	public String getStatus() {
		return status;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public double getNumGrade() {
		return numGrade;
	}
	
	public Student getStudent() {
		return student;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public void setNumGrade(double numGrade) {
		this.numGrade = numGrade;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return String.format("%s%f",getStudent().toString(),getNumGrade());
	}
	

}
