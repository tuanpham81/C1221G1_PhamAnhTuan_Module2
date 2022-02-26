package ss7_abstract_vs_interface.bai_tap.interface_colorable_lop_hinh_hoc;

import ss7_abstract_vs_interface.bai_tap.interface_resizeable_lop_hinh_hoc.Circle;
import ss7_abstract_vs_interface.bai_tap.interface_resizeable_lop_hinh_hoc.Rectangle;
import ss7_abstract_vs_interface.bai_tap.interface_resizeable_lop_hinh_hoc.Shape;

public class ColorableArrayTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3.5);
        Circle circle3 = new Circle(3.5, "indigo", false);
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(2.3, 5.8);
        Rectangle rectangle3 = new Rectangle(2.5, 3.8, "orange", true);
        Square square1 = new Square();
        Square square2 = new Square(4);
        Square square3 = new Square(4,"red",true);

        Shape[] shapes = {circle1,circle2,circle3,rectangle1,rectangle2,rectangle3,square1,square2,square3};

        for (Shape element: shapes) {
            System.out.println("Diện tích là: " + element.getArea());
            if(element instanceof Square) {
                element.howToColor();
            }
        }
    }
}
