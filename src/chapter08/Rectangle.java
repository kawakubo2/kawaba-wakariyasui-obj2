package chapter08;

public class Rectangle extends Square {
    private double height;
    public Rectangle(String color, double width, double height) {
        super(color, width);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return "Rectangle [height=" + height + "]";
    }
}
