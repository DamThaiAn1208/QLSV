package Bai_7;

public class test {
	public static void main(String[] args) {
		Programmer p1 = new Programmer(10000000, "Đàm Thái An", "123dz", 10000000, "Tiếng anh");
		Programmer p2 = new Programmer(12000000, "Đỗ Phú Hiệp", "123da", 10000000, "Tiếng anh");
		Programmer p3 = new Programmer(20000000, "Thử Lỗi", "123dz", 10000000, "Tiếng anh");
		
		ProjectLeader l1 = new ProjectLeader(2000000,"Nguyễn Nhựt Hảo", "234dz", 100000);
		ProjectLeader l2 = new ProjectLeader(2000000,"Nguyễn Nhựt ", "234di", 120000);
		ProjectLeader l3 = new ProjectLeader(2000000,"thử lỗi", "234dz", 1000000);
		
		Administrator a1 = new Administrator(2000000, "Hoàng Phước Thành Công", "345dz", 30000000,"dz");
		Administrator a2 = new Administrator(2000000, "Hoàng Phước Thành ", "345sd", 30000000,"dz");
		Administrator a3 = new Administrator(2000000, "Thử lỗi", "345dz", 30000000,"dz");
		
		SoftwareHouse s = new SoftwareHouse("Công ti cc");
		
		System.out.println(s.addEmployee(p1));
		System.out.println(s.addEmployee(p2));
		System.out.println(s.addEmployee(p3));
		System.out.println(s.addEmployee(l1));
		System.out.println(s.addEmployee(l2));
		System.out.println(s.addEmployee(l3));
		System.out.println(s.addEmployee(a1));
		System.out.println(s.addEmployee(a2));
		System.out.println(s.addEmployee(a3));
		
		System.out.println(s.displayALLStaff());
		
		s.sapXepDanhSachTheoTen();
		
		System.out.println(s.displayALLStaff());
	}
}
