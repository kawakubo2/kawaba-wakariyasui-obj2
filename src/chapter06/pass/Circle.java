package chapter06.pass;

public class Circle extends GeometricShape {
    private double radius; // 半径
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    public double area() {
        return Math.pow(radius, 2) * Math.PI;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
