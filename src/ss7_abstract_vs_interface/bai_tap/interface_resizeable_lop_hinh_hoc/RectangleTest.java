package ss7_abstract_vs_interface.bai_tap.interface_resizeable_lop_hinh_hoc;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Diện tích cũ là: " + rectangle1.getArea());
        rectangle1.resize(0.25);
        System.out.println("Diện tích mới là: " + rectangle1.getArea());

        Rectangle rectangle2 = new Rectangle(2.3, 5.8);
        System.out.println("Diện tích cũ là: " + rectangle2.getArea());
        rectangle2.resize(0.25);
        System.out.println("Diện tích mới là: " + rectangle2.getArea());

        Rectangle rectangle3 = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println("Diện tích cũ là: " + rectangle3.getArea());
        rectangle3.resize(0.25);
        System.out.println("Diện tích mới là: " + rectangle3.getArea());
    }
}