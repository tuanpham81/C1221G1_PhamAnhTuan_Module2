package ss5_access_modifier_va_static.bai_tap.access_modifier;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính");
        circle.setRadius(scanner.nextDouble());
        Circle circle2 = new Circle(circle.getRadius());
        System.out.println(circle2.getArea());
        System.out.println(circle2.getRadius());
    }
}
