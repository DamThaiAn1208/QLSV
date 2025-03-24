package OnTap;

import java.time.LocalDate;
import java.util.ArrayList;

public class ProgrammingEmployee extends Employee{
	private ArrayList<String> listProgrammingLanguage;

	//constructor
	public ProgrammingEmployee(String employeeID, String name, boolean sex, LocalDate birthDay, double salary,
			String note) throws Exception {
		super(employeeID, name, sex, birthDay, salary, note);
		listProgrammingLanguage = new ArrayList<String>();
	}
	
	public void addProgrammingLanguage(String programmingLanguage) {
		listProgrammingLanguage.add(programmingLanguage);
	}
	
//	public String toString() {
//		String temp ="";
//		for(String x : listProgrammingLanguage) {
//			temp += x+" ";
//		}
//		
//		return String.format("%s%f%s", super.toString(),salary(),temp);
//	}
	
	@Override
	public double salary() {
		double temp;
		if(listProgrammingLanguage.size() >= 3) {
			  temp = getBasicSalary()*2;
		}else {
			temp=getBasicSalary()+(getBasicSalary()*0.6);
		}
		return temp;
	}
}
