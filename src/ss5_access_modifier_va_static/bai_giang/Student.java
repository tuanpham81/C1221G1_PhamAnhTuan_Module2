package ss5_access_modifier_va_static.bai_giang;

public class Student {
    public int id;
    private String name;
    private String birthday;
    private String classname;
    static String school;

    public void study(String subject) {
        System.out.println("đang học môn " + subject);
    }

    public Student() {
    }

    public Student(int id, String name, String birthday, String classname, String school) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.classname = classname;
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                ", birthday=" + birthday +
                ", classname=" + classname +
                ", school=" + school +
                '}';
    }
}
