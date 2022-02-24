package ss6_ke_thua.bai_tap.point2d_class_vs_point3d_class;

import java.util.Arrays;

public class Point2D {
    public float x = 0;
    public float y = 0;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public String getXY(){
        float[] array = {getX(),getY()};
        return Arrays.toString(array);
    }

    @Override
    public String toString() {
        return "(" +
                + getX() +
                ", "
                + getY() +
                ')';
    }
}
