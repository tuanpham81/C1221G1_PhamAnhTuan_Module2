package ss7_abstract_vs_interface.bai_tap.interface_resizeable_lop_hinh_hoc;

public class ShapeTest {

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}