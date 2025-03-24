package Bai_7;

public class Administrator extends Employee{
	private String theDepartment;

	public Administrator(int thePayrollNumber, String theName,String id, double theBasicMonthlySalary, String theDepartment) {
		super(thePayrollNumber, theName,id, theBasicMonthlySalary);
		this.theDepartment = theDepartment;
	}
	
	
	
	public String getTheDepartment() {
		return theDepartment;
	}



	public void setTheDepartment(String theDepartment) {
		this.theDepartment = theDepartment;
	}



	@Override
	public double getMonthlySalary(){
		return super.getTheBasicMonthlySalary()+super.getThePayrollNumber()+(0.4*super.getTheBasicMonthlySalary());
	}
	
	
	@Override
	public String getString() {
		return String.format("%s%s%f",super.toString(),theDepartment,getMonthlySalary());
	}
}
