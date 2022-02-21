package ss4_lop_va_doi_tuong.bai_tap.class_fan;

public class FanMain {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setStatus(true);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setSpeed(3);

        Fan fan2 = new Fan();
        fan2.setStatus(false);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setSpeed(2);

        System.out.println(fan1.toString());
        System.out.println(fan2);
    }
}
