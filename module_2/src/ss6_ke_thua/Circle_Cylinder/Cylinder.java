package ss6_ke_thua.Circle_Cylinder;

import ss6_ke_thua.Circle_Cylinder.Circle;

public class Cylinder extends Circle {
    private double height;

    public double getVolume() {
        return getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", color='" + color +
                ", height=" + height +
                '}';
    }
}
