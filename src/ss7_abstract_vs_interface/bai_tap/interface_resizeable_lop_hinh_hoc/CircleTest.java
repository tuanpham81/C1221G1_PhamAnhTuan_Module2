package ss7_abstract_vs_interface.bai_tap.interface_resizeable_lop_hinh_hoc;

public class CircleTest extends RandomResizeableArrayTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Diện tích cũ là: " + circle1.getArea());
        circle1.resize(0.5);
        System.out.println("Diện tích mới là: " + circle1.getArea());

        Circle circle2 = new Circle(3.5);
        System.out.println("Diện tích cũ là: " + circle2.getArea());
        circle2.resize(0.5);
        System.out.println("Diện tích mới là: " + circle2.getArea());

        Circle circle3 = new Circle(3.5, "indigo", false);
        System.out.println("Diện tích cũ là: " + circle3.getArea());
        circle3.resize(0.5);
        System.out.println("Diện tích mới là: " + circle3.getArea());
    }
}