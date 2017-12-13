package lesson9;

public class Circle {
private double radius;
public static final double PI=3.1415;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double sCircle (double radius){
return PI*radius*radius;
}
public double lCircle (double radius){
    return 2*PI*radius;
}
}
