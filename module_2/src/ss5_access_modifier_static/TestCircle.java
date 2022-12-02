package ss5_access_modifier_static;

class Circle{
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius*radius*3.14;
    }
}
public class TestCircle {
    public static void main(String[] args) {
        Circle circle1=new Circle();
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());
        circle1.getArea();
        Circle circle2=new Circle(5);
        System.out.println(circle2.getRadius());
        System.out.println(circle2.getArea());
    }
}
