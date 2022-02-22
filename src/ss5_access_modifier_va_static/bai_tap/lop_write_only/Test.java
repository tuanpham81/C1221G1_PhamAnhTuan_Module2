package ss5_access_modifier_va_static.bai_tap.lop_write_only;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên học sinh");
        student.setName(scanner.nextLine());
        System.out.println("Nhập tên lớp");
        student.setClasses(scanner.nextLine());
        System.out.println(student);
    }
}
