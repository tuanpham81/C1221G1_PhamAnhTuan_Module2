package ss6_ke_thua.bai_tap.point_vs_moveable_point;

import java.util.Arrays;

public class Point {
    public float x;
    public float y;

    public Point() {
    }

    public Point(float x, float y) {
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

    public String getXY(){
        float[] array = {getX(),getY()};
        return Arrays.toString(array);
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
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
