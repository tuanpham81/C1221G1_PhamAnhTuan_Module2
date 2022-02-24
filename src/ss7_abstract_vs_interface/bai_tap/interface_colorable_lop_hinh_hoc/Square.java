package ss7_abstract_vs_interface.bai_tap.interface_colorable_lop_hinh_hoc;

import ss7_abstract_vs_interface.bai_tap.interface_resizeable_lop_hinh_hoc.Shape;

public class Square extends Shape implements Colorable{
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return Math.pow(this.side,4);
    }

    public double getPerimeter() {
        return 4 * this.side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Color all 4 sides");
    }
}
