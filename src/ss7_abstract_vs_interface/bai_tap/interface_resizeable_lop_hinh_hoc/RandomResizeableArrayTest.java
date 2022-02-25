package ss7_abstract_vs_interface.bai_tap.interface_resizeable_lop_hinh_hoc;

public class RandomResizeableArrayTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3.5);
        Circle circle3 = new Circle(3.5, "indigo", false);
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(2.3, 5.8);
        Rectangle rectangle3 = new Rectangle(2.5, 3.8, "orange", true);
        Shape[] shapes = {circle1, circle2, circle3, rectangle1, rectangle2, rectangle3};

        for (Shape element : shapes) {
            System.out.println("Diện tích trước: "+element.getArea());
            double percent = (Math.random() * 100 +1)/100;
            System.out.println("Phần trăm tăng:"+ percent*100 + " %");
            element.resize(percent);
            System.out.println("Diện tích sau: "+element.getArea());
            System.out.println("---------");
        }
    }
}
