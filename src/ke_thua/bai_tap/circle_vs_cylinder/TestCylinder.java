package ke_thua.bai_tap.circle_vs_cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume(cylinder.getRadius(),cylinder.getHeight()));
        cylinder = new Cylinder(5);
        System.out.println(cylinder);
        cylinder = new Cylinder(3,"red",5);
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume(cylinder.getRadius(),cylinder.getHeight()));
    }
}
