package ss5_access_modifier_va_static.bai_giang;

public class StudentManager {
    //quản lý đối tượng Student
    //sd các phương thức CRUD
    private static Student[] students = new Student[100]; //sd biến static
    static {
        students[0] = new Student();
    }
}
