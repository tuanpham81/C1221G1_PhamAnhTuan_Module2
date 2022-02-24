package ss6_ke_thua.bai_tap.point2d_class_vs_point3d_class;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0;

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String getXYZ(){
        float[] array = {getX(),getY(),getZ()};
        return Arrays.toString(array);
    }

    @Override
    public String toString() {
        return "(" +
                getX() +
                ", " + getY() +
                ", " + getZ() +
                '}';
    }
}
