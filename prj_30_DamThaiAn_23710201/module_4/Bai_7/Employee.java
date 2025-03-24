package Bai_7;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Objects;

import javax.swing.text.NumberFormatter;

public abstract class Employee {
	private String id;
	private int thePayrollNumber;
	private String theName;
	private double theBasicMonthlySalary;
	
	public Employee(int thePayrollNumber, String theName,String id, double theBasicMonthlySalary) {
		super();
		this.thePayrollNumber = thePayrollNumber;
		this.theName = theName;
		this.theBasicMonthlySalary = theBasicMonthlySalary;
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public int getThePayrollNumber() {
		return thePayrollNumber;
	}


	public String getTheName() {
		return theName;
	}


	public double getTheBasicMonthlySalary() {
		return theBasicMonthlySalary;
	}


	public void setThePayrollNumber(int thePayrollNumber) {
		this.thePayrollNumber = thePayrollNumber;
	}


	public void setTheName(String theName) {
		this.theName = theName;
	}


	public void setTheBasicMonthlySalary(double theBasicMonthlySalary) {
		this.theBasicMonthlySalary = theBasicMonthlySalary;
	}


	public void setId(String id) {
		this.id = id;
	}


	public abstract double getMonthlySalary();
	public abstract String getString();
	
	@Override
	public String toString() {
		Locale local = new Locale("vi","vn");
		NumberFormat fm = NumberFormat.getCurrencyInstance(local); 
//		return id+" "+theName+" "+fm.format(thePayrollNumber)+" "+fm.format(theBasicMonthlySalary);
		return String.format("%-10s%-30s%-15d%-15f",id,theName,thePayrollNumber,theBasicMonthlySalary);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id,theName,thePayrollNumber,theBasicMonthlySalary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
