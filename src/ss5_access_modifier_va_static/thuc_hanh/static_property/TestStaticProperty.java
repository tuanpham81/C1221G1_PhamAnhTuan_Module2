package ss5_access_modifier_va_static.thuc_hanh.static_property;

public class TestStaticProperty {

    public static void main(String[] args) {

        Car car1 = new Car("Mazda 3","Skyactiv 3");

        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Mazda 6","Skyactiv 6");

        System.out.println(Car.numberOfCars);
    }
}
// numberOfCars thể hiện tính đa hình??
