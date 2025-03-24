package OnTap;

import java.time.LocalDate;

public class test {
	public static void main(String[] args) {
		try {
			Employee s1 = new ProgrammingEmployee("s1", "Đàm Thái A",true,LocalDate.of(2005, 8, 13),25000000, "gioi");
			Employee s2 = new ProgrammingEmployee("s2", "Đàm Thái B",true,LocalDate.of(2005, 8, 14),25000000, "gioi");
			Employee s3 = new ProgrammingEmployee("s3", "Đàm Thái D",true,LocalDate.of(2005, 8, 15),25000000, "gioi");
			Employee s4 = new ProjectLeader("s4", "Đàm Thái C",true,LocalDate.of(2005, 8, 16),25000000, "gioi",30000000);
			Employee s5 = new ProjectLeader("s5", "Đàm Thái F",true,LocalDate.of(2005, 8, 12),25000000, "gioi",30000000);
			Employee s6 = new ProjectLeader("s6", "Đàm Thái E",true,LocalDate.of(2005, 8, 12),25000000, "gioi",30000000);
			
			ListEmployee l = new ListEmployee();
			
			l.addEmployee(s1);
			l.addEmployee(s2);
			l.addEmployee(s3);
			l.addEmployee(s4);
			l.addEmployee(s5);
			l.addEmployee(s6);
			
			
			
			System.out.println(l.litstEmployees());
			
			System.out.println(l.takeEmployeePlanBirthday(LocalDate.of(2005, 8, 12)));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
