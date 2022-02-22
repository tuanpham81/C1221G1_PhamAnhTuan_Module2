package ss5_access_modifier_va_static.thuc_hanh.static_property;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;
    // biến static thuộc class Car nên sau mỗi lần ++ sẽ ko bị reset về 0;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
