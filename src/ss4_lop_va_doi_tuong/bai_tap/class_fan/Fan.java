package ss4_lop_va_doi_tuong.bai_tap.class_fan;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed;
    private boolean status;
    private double radius;
    private String color;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
        this.speed = SLOW;
        this.status = false;
        this.radius = 5;
        this.color = "blue";
    }

    public Fan(int speed, boolean status, int radius, String color) {
        this.speed = speed;
        this.status = status;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        if (status) {
            return "ClassFan{" +
                    "fan is on" +
                    ", speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        } else {
            return "ClassFan{" +
                    "fan is off" +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
}
