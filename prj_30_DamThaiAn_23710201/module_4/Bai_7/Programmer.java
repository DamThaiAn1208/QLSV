package Bai_7;

public class Programmer extends Employee{
	private String theLanguage;

	public Programmer(int thePayrollNumber, String theName,String id, double theBasicMonthlySalary, String theLanguage) {
		super(thePayrollNumber, theName,id, theBasicMonthlySalary);
		this.theLanguage = theLanguage;
	}

	public String getTheLanguage() {
		return theLanguage;
	}

	public void setTheLanguage(String theLanguage) {
		this.theLanguage = theLanguage;
	}
	
	public double getMonthlySalary() {
		return super.getTheBasicMonthlySalary()+super.getThePayrollNumber()+(0.2*super.getTheBasicMonthlySalary());
	}
	
	@Override
	public String getString() {
		return String.format("%s%s%f",super.toString(),theLanguage,getMonthlySalary());
	}
}
