package ss5_access_modifier_va_static.bai_tap.lop_write_only;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student2 student2 = new Student2();
        System.out.println(student2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên học sinh");
        student2.setName(scanner.nextLine());
        System.out.println("Nhập tên lớp");
        student2.setClasses(scanner.nextLine());
        System.out.println(student2);
    }
}
