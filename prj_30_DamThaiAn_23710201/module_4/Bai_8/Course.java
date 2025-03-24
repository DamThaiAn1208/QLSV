package Bai_8;

import java.util.HashSet;

public class Course{
	private String courseNbr;
	private String courseTitle;
	private int credits;
	private HashSet<Section> sections = new HashSet<>();
	
	
	public Course(String courseNbr,String courseTitle, int credits) {
		setCourseNbr(courseNbr);
		setCourseTitle(courseTitle);
		setCredits(credits);
	}
	
	public Course() {
		super();
	}


	public String getCourseNbr() {
		return courseNbr;
	}
	
	public String getCourseTitle() {
		return courseTitle;
	}
	
	public int getCredits() {
		return credits;
	}
	
	public void setCourseNbr(String courseNbr) {
		this.courseNbr = courseNbr;
	}
	
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	
	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	public void addSection(String sectionNbr, String semester, String room, Faculty faculty, HashSet<Enrolment> enrolments) {
		Section section = new Section(sectionNbr,semester,room,faculty,enrolments);
		sections.add(section);
	}
	
	@Override
	public String toString() {
		String s = String.format("Khóa học:[%-5s - %-5s(%dTC)]\n",getCourseNbr(),getCourseTitle(),getCredits());
		s+="===============Thông tin học phần===============\n";
		for(Section x:sections) {
			s+= x.toString()+"\n";
		}
		return s;
	}
	
}
