package ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc;

public class Shape {
    String color;
    boolean fill;

    public Shape(){
        this.color = "green";
        this.fill = true;
    }

    public Shape(String color, boolean fill) {
        this.color = color;
        this.fill = fill;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    @Override
    public String toString() {
        return "A Shape with color of " + getColor() + " and " + (isFill() ? "filled" : "not filled");
    }
}
