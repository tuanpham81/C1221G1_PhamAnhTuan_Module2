package ke_thua.bai_tap.circle_vs_cylinder;

public class Cylinder extends Circle{
    public double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(double radius, double height){
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + getRadius() +
                ", color='" + getColor() + '\'' +
                ", height=" + getHeight() +
                '}'+
                ", which is a subclass of " +
                super.toString();
    }
}
