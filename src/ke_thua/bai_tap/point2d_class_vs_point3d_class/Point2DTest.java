package ke_thua.bai_tap.point2d_class_vs_point3d_class;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D.getXY());
        System.out.println(point2D.toString());
        point2D = new Point2D(3,5);
        System.out.println(point2D.getXY());
        System.out.println(point2D.toString());
    }
}
