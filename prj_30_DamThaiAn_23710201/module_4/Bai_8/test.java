package Bai_8;
import java.util.HashSet;

public class test {
    public static void main(String[] args) {
    	
    	Faculty faculty1 = new Faculty("Tôn", "Long Phước", "123123", "CNTT");
//    	Faculty faculty2 = new Faculty("Tấn","Phước","121212","CNTT");
    	
        Student student1 = new Student("Đàm", "Thái An", "121212", 2023);
        Student student2 = new Student("Đỗ", "Phú Hiệp", "131313", 2023);
        Student student3 = new Student("Hoàng", "Phước Thành Công", "141414", 2023);
        Student student4 = new Student("Nguyễn", "Nhựt Hảo", "151515", 2023);
        
        HashSet<Enrolment> enrolmentSet = new HashSet<>();
        Enrolment enrolment1 = new Enrolment(student1,"Đang học","Giỏi",8.0);
        Enrolment enrolment2 = new Enrolment(student2,"Đang học","Giỏi",8.0);
        Enrolment enrolment3 = new Enrolment(student3,"Đang học","Giỏi",8.0);
        Enrolment enrolment4 = new Enrolment(student4,"Đang học","Giỏi",8.0);
        enrolmentSet.add(enrolment1);
        enrolmentSet.add(enrolment2);
        enrolmentSet.add(enrolment3);
        enrolmentSet.add(enrolment4);
        
        Course course = new Course("CUC1","OOP",4);
        course.addSection("0230102", "I (2015 - 2016)", "H5.1", faculty1, enrolmentSet);
        
        System.out.println(course.toString());
    }
}