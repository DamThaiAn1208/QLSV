package Bai_7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SoftwareHouse {
	private String theName;
	private ArrayList<Employee> employees;
	
	public SoftwareHouse(String theName) {
		super();
		setTheName(theName);
		employees = new ArrayList<>();
	}

	public String getTheName() {
		return theName;
	}

	public void setTheName(String theName) {
		this.theName = theName;
	}
	
	public boolean addEmployee(Employee employee) {
		if(employees.contains(employee)) {
			return false;
		}else
			employees.add(employee);
			return true;
	}
	
	public String displayALLStaff() {
		String s=String.format("%-10s%-30s%-15s%-15s\n","id","Họ và tên","lương bt","lương cứng");
		for(Employee x:employees) {
			s+=x.toString()+"\n";
		}
		return s;
	}
	
	public void sapXepDanhSachTheoTen() {
		Collections.sort(employees, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getTheName().compareTo(o2.getTheName());
			}
		});
	}
}
