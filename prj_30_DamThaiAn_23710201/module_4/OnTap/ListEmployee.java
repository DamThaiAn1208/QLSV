package OnTap;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListEmployee {
	private ArrayList<Employee> listEmployee;

	
	//constructor
	public ListEmployee() {
		super();
		listEmployee = new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee employee) throws Exception {
		if(listEmployee.contains(employee)) {
			throw new Exception("da trung ma");
		}else {
			listEmployee.add(employee);
		}
	}
	
	public void arrangeName() {
		Collections.sort(listEmployee, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getEmployeeID().compareToIgnoreCase(o2.getEmployeeID());
			}
		});
	}
	
	public double sumOfSalaryProgramingEmployee() {
		double sum = 0;
		for(Employee x : listEmployee) {
			if(x instanceof ProgrammingEmployee) {
				sum+= x.salary();
			}
		}
		return sum;
	}
	
	public String litstEmployees() {
		String temp = String.format("%-10s%-30s%-5s%-12s%-30s%-50s\n","ID","Name","Sex","Birthday","salary","note");
		for(Employee x : listEmployee) {
			temp+= x.toString()+"\n";
		}
		return temp;
	}
	
	public String takeEmployeePlanBirthday(LocalDate n) {
		String temp = String.format("%-10s%-30s%-5s%-12s%-30s%-50s\n","ID","Name","Sex","Birthday","salary","note");
		for(Employee x : listEmployee) {
			if(x.getBirthDay().equals(n)) {
				temp+=x.toString()+"\n";
			}
		}
		return temp;
	}
}
