package OnTap;

import java.time.LocalDate;

public class ProjectLeader extends Employee{
	private double allowanceSalary;

	//constructor
	public ProjectLeader(String employeeID, String name, boolean sex, LocalDate birthDay, double basicSalary,
			String note, double allowanceSalary) throws Exception {
		super(employeeID, name, sex, birthDay, basicSalary, note);
		setAllowanceSalary(allowanceSalary);
	}
	public ProjectLeader() {
		super();
	}

	
	//getter
	public double getAllowanceSalary() {
		return allowanceSalary;
	}
	//setter
	public void setAllowanceSalary(double allowanceSalary) {
		this.allowanceSalary = allowanceSalary;
	}
	
	
	//to String
	public String toString() {
		return String.format("%s%f",super.toString(),salary());
	}
	
	
	//methods
	@Override
	public double salary() {
		return getBasicSalary()+getAllowanceSalary();
	}
}
