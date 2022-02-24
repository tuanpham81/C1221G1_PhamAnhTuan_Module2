package ss7_abstract_vs_interface.bai_tap.interface_resizeable_lop_hinh_hoc;

import java.util.Arrays;

public class RandomResizeableArray extends Shape{
    Shape[] shapes = new Shape[6];

    @Override
    public String toString() {
        return "RandomResizeableArray{" +
                "shapes=" + Arrays.toString(shapes) +
                '}';
    }
}
