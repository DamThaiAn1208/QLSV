package Bai_7;

public class ProjectLeader extends Employee{

	public ProjectLeader(int thePayrollNumber, String theName,String id, double theBasicMonthlySalary) {
		super(thePayrollNumber, theName,id, theBasicMonthlySalary);
	}

	@Override
	public double getMonthlySalary() {
		// TODO Auto-generated method stub
		return super.getTheBasicMonthlySalary()+super.getThePayrollNumber()+(0.2*super.getTheBasicMonthlySalary());
	}
	
	@Override
	public String getString() {
		return String.format("%s%f",super.toString(),getMonthlySalary());
	}
}
