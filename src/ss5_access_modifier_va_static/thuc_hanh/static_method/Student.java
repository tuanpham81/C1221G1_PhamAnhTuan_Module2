package ss5_access_modifier_va_static.thuc_hanh.static_method;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    //constructor để khai báo biến
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    //static method để thay đổi giá trị của biến static
    static void change() {
        college = "CODEGYM";
    }

    //method để hiển thị giá trị
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

