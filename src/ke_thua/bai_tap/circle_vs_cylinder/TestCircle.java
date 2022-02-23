package ke_thua.bai_tap.circle_vs_cylinder;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        System.out.println(circle.getArea(circle.getRadius()));
        circle = new Circle(3,"red");
        System.out.println(circle);
        System.out.println(circle.getArea(circle.getRadius()));
    }
}
