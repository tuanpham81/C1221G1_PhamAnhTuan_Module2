package ss15_xu_ly_ngoai_le_va_debug.bai_tap.illegal_triangle_exception;

public class Triangle {
    int x;
    int y;
    int z;

    public Triangle(int x, int y, int z) throws IllegalTriangleException {
        if (x <= 0 || y <= 0 || z <= 0) {
            throw new IllegalTriangleException("Cạnh không được nhỏ hơn 0");
        } else if (x + y < z || x + z < y || y + z < x) {
            throw new IllegalTriangleException("Tam giác ko tồn tại");
        } else {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
}
