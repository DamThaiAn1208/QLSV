package OnTap;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Employee {
	private String employeeID;
	private String name;
	private boolean sex;
	private LocalDate birthDay;
	private double basicSalary;
	private String note;
	
	
	public Employee() {
		super();
	}
	public Employee(String employeeID, String name, boolean sex, LocalDate birthDay, double basicSalary, String note) throws Exception {
		super();
		setEmployeeID(employeeID);
		setName(name);
		setSex(sex);
		setBirthDay(birthDay);
		setBasicSalary(basicSalary);
		setNote(note);
	}


	//getter
	public String getEmployeeID() {
		return employeeID;
	}
	public String getName() {
		return name;
	}
	public boolean isSex() {
		return sex;
	}
	public LocalDate getBirthDay() {
		return birthDay;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public String getNote() {
		return note;
	}
	
	//setter
	public void setEmployeeID(String employeeID) throws Exception {
		if(employeeID != null) {
			this.employeeID = employeeID;
		}else {
			throw new Exception("employee ID khong duoc de trong");
		}
	}
	public void setName(String name) throws Exception{
		if(name != null && name.length() <= 30 ) {
			this.name = name;
		}else {
			throw new Exception("sai cau truc cua name");
		}
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	//methods
		public abstract double salary();
	
	//to String
	@Override
	public String toString() {
		String temp="";
		if(isSex()) {
			temp = "Nam";
		}else {
			temp = "Nu";
		}
		return String.format("%-10s%-30s%-5s%-12s%-30f%-50s",getEmployeeID(),getName(),temp,getBirthDay(),salary(),getNote());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(employeeID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(employeeID, other.employeeID);
	}
	
	
	
}
