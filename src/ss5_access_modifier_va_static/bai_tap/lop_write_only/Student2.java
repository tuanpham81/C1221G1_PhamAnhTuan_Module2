package ss5_access_modifier_va_static.bai_tap.lop_write_only;

public class Student2 {
    private String name = "John";
    private String classes = "C02";

    public Student2() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
