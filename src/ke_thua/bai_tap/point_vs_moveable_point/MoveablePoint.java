package ke_thua.bai_tap.point_vs_moveable_point;

import java.util.Arrays;

public class MoveablePoint extends Point {
    public float xSpeed;
    public float ySpeed;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint() {
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String getSpeed() {
        float[] array = {getXSpeed(), getYSpeed()};
        return Arrays.toString(array);
    }

    @Override
    public String toString() {
        return "(" +
                + x + ", "
                + y + ")"
                + ", speed=("
                + xSpeed +
                ", " + ySpeed +
                ')';
    }

    public MoveablePoint move(){
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
}
