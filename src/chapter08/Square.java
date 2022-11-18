package chapter08;

public class Square extends Shape {
    private double width;
    public Square(String color, double width) {
        super(color);
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public String toString() {
        return "Square [width=" + width + "]";
    }
}
