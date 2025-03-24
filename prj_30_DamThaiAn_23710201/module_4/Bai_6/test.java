package Bai_6;

public class test {
	public static void main(String[] args) {
		try {
			PhongHocLyThuyet LT1 = new PhongHocLyThuyet("123dz", "a1", 50, 10, true);
			PhongHocLyThuyet LT2 = new PhongHocLyThuyet("123di", "a2", 40, 10, true);
			PhongHocLyThuyet LT3 = new PhongHocLyThuyet("123di", "a3", 30, 1, false);
			PhongMayTinh MT1 = new PhongMayTinh("123du", "b1", 100, 20, 30);
			PhongMayTinh MT2 = new PhongMayTinh("123dz", "b1", 200, 20, 10);
			PhongMayTinh MT3 = new PhongMayTinh("123du", "b1", 10, 1, 30);
			PhongMayTinh MT4 = new PhongMayTinh("123d", "b1", 10, 1, 60);
			PhongMayTinh MT5 = new PhongMayTinh("123c", "b1", 10, 1, 30);
			PhongMayTinh MT6 = new PhongMayTinh("123b", "b1", 10, 1, 60);
			PhongThiNghiem TN1 = new PhongThiNghiem("123di", "s1", 100,20,"may tinh", 100, true);
			PhongThiNghiem TN2 = new PhongThiNghiem("123dc", "s2", 100,20,"may tinh", 50, false);
			PhongThiNghiem TN3 = new PhongThiNghiem("123fr", "s1", 100,20,"may tinh", 100, true);
			
			DanhSachPhongHoc l = new DanhSachPhongHoc();
			System.out.println(l.addPhongHoc(LT1));
			System.out.println(l.addPhongHoc(LT2));
			System.out.println(l.addPhongHoc(LT3));
			System.out.println(l.addPhongHoc(MT1));
			System.out.println(l.addPhongHoc(MT2));
			System.out.println(l.addPhongHoc(MT3));
			System.out.println(l.addPhongHoc(TN1));
			System.out.println(l.addPhongHoc(TN2));
			System.out.println(l.addPhongHoc(TN3));
			System.out.println(l.addPhongHoc(MT5));
			System.out.println(l.addPhongHoc(MT4));
			System.out.println(l.addPhongHoc(MT6));
			
			System.out.println(l.toString());
			
			System.out.println("------------lấy thông tin theo mã phòng------------");
			System.out.println(l.layThongTinTheoMaPhong("123fr")+"\n");
			
			System.out.println("------------xắp xếp theo dãy nhà------------");
			l.sapXepTangTheoDayNha();
			System.out.println(l.toString());
			
			System.out.println("------------xắp xếp theo Diện tích------------");
			l.sapXepGiamTheoDienTich();
			System.out.println(l.toString()+"\n");
			
			System.out.println("------------thay đổ số máy của phòng máy tính------------");
			System.out.println(l.layThongTinTheoMaPhong("123du"));
			System.out.println(l.capNhatSoMayTinh("123du",100));
			System.out.println(l.layThongTinTheoMaPhong("123du")+"\n");
			
			System.out.println("------------xóa phòng khi có mã------------");
			System.out.println(l.toString());
			System.out.println(l.xoaPhongHocTheoMaPhong("123dz"));
			System.out.println(l.toString()+"\n");
			
			System.out.println("------------tổng số phòng học------------");
			System.out.println("Tổng số phòng học : "+l.tongSoPhongHoc()+"\n");
			
			System.out.println("------------Hiển thị phòng máy có 60 máy------------");
			System.out.println(l.layDanhSachCacPhongMayCo60May());
			
		}catch (Exception e) {
			System.out.println(e.getMessage());;// TODO: handle exception
		}
	}
}
