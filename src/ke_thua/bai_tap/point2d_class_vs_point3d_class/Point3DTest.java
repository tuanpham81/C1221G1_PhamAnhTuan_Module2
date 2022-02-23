package ke_thua.bai_tap.point2d_class_vs_point3d_class;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D.getXYZ());
        System.out.println(point3D);

        point3D = new Point3D(7);
        System.out.println(point3D.getXYZ());
        System.out.println(point3D);

        point3D = new Point3D(3,5,7);
        System.out.println(point3D.getXYZ());
        System.out.println(point3D);
    }
}
