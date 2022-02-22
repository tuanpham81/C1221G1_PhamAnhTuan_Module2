package ss5_access_modifier_va_static.bai_giang;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Tuan", "08-01", "C1221G1", "DUE");
        Student student2 = new Student(2, "Tuan", "08-01", "C1221G1", "DUE");
        Student student3 = new Student(3, "Tuan", "08-01", "C1221G1", "DUE");

        //truy cập thuộc tính static thông qua class (school là thuộc tính static)
        Student.school = "Codegym";
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        // có thể truy cập thuộc tính thông qua đối tượng
        student1.school = "DT";
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        // tính tổng 2 số
        int x = 10;
        int y = 20;

        //truy cập method static thông qua class
        int sum = Calculator.sum(x,y);
        System.out.println(sum);

        //các phương thức ko phải static thì phải thông qua đối tượng
        Calculator calculator = new Calculator();
        calculator.showMess();
    }
}
