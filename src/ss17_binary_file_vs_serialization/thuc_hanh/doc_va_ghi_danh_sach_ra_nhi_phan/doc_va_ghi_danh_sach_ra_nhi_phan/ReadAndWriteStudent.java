package ss17_binary_file_vs_serialization.thuc_hanh.doc_va_ghi_danh_sach_ra_nhi_phan.doc_va_ghi_danh_sach_ra_nhi_phan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteStudent {
    public static void writeToFile(String path, List<Student> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeToFile("src\\ss17_binary_file_vs_serialization\\thuc_hanh\\doc_va_ghi_danh_sach_ra_nhi_phan\\doc_va_ghi_danh_sach_ra_nhi_phan\\student.txt", students);
        List<Student> productDataFromFile = readDataFromFile("src\\ss17_binary_file_vs_serialization\\thuc_hanh\\doc_va_ghi_danh_sach_ra_nhi_phan\\doc_va_ghi_danh_sach_ra_nhi_phan\\student.txt");
        for (Student student : productDataFromFile) {
            System.out.println(student);
        }
    }
}
