package Bai_8;

import java.util.HashSet;
import java.util.Set;

public class Section {
	private String semester;
	private String sectionNbr;
	private String room;
	private Faculty facultyMember;
	private HashSet<Enrolment> listEnrolls;
	
	public Section(String semester, String sectionNbr, String room,Faculty facultyMember, HashSet<Enrolment> listEnrolls) {
		setSemester(semester);
		setSectionNbr(sectionNbr);
		setRoom(room);
		setFacultyMember(facultyMember);
		setListEnrolls(listEnrolls);
		listEnrolls = new HashSet<Enrolment>();
	}
	
	public Section() {
		super();
	}


	public String getSemester() {
		return semester;
	}
	
	public String getSectionNbr() {
		return sectionNbr;
	}
	
	public String getRoom() {
		return room;
	}
	
	public Faculty getFacultyMember() {
		return facultyMember;
	}
	
	public Set<Enrolment> getListEnrolls() {
		return listEnrolls;
	}
	
	
	public void setSemester(String semester) {
		this.semester = semester;
	}
	
	public void setSectionNbr(String sectionNbr) {
		this.sectionNbr = sectionNbr;
	}
	
	public void setRoom(String room) {
		this.room = room;
	}
	
	public void setFacultyMember(Faculty facultyMember) {
		this.facultyMember = facultyMember;
	}
	
	public void setListEnrolls(Set<Enrolment> listEnrolls) {
		this.listEnrolls = new HashSet<Enrolment>(listEnrolls);
	}
	
	@Override
	public String toString() {
		String s = "Mã học phần: "+ getSectionNbr()+"\n"+"Học kỳ: "+getSemester()+"\n"+"Phòng học: "+getRoom()+"\n"+getFacultyMember().toString()+"\n";
		s+="===============Danh sách sinh viên===============\n";
		s+= String.format("%-10s%-30s%-20s%-10s\n","Mã SV","Họ Tên","Khóa Năm","Điểm");
		for(Enrolment x:listEnrolls) {
			s+=x.toString()+"\n";
		}
		return s;
	}
}
