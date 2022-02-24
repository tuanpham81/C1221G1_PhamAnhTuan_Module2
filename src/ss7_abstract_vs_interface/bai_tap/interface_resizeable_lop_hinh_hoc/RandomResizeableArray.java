package ss7_abstract_vs_interface.bai_tap.interface_resizeable_lop_hinh_hoc;

import java.util.Arrays;

public class RandomResizeableArray extends Shape implements IResizeable{
    Circle circle1 = new Circle();
    Circle circle2 = new Circle(3.5);
    Circle circle3 = new Circle(3.5, "indigo", false);
    Rectangle rectangle1 = new Rectangle();
    Rectangle rectangle2 = new Rectangle(2.3, 5.8);
    Rectangle rectangle3 = new Rectangle(2.5, 3.8, "orange", true);
    Shape[] shapes = {circle1,circle2,circle3,rectangle1,rectangle2,rectangle3};



    @Override
    public String toString() {
        return "RandomResizeableArray{" +
                "shapes=" + Arrays.toString(shapes) +
                '}';
    }

    @Override
    public void resize(double percent) {
        for (Shape element:shapes) {
            percent = (Math.random()*((100-1)+1))+1;
//            if(element instanceof Circle){
//                this.radius += this.radius * percent;
//            }
//            if(element instanceof Rectangle) {
//                this.width += this.width * percent;
//            }
            // em đang sửa
        }
    }
}
