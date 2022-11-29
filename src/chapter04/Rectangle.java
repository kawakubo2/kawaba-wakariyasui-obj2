package chapter04;

public class Rectangle {
    private double x;
    private double y;
    private double width;
    private double height;
    private String color;
    public Rectangle(double x, double y, double width, double height, String color) {
        this.x = x;
        this.y = y;
        if (width <= 5) {
            throw new IllegalArgumentException("幅が5以下");
        }
        this.width = width;
        if (height <= 5) {
            throw new IllegalArgumentException("高さが5以下");
        }
        this.height = height;
        this.color = color;
    }
    public Rectangle(double width, double height, String color) {
        this(300, 300, width, height, color);
    }
    public Rectangle(double width, double height) {
        this(width, height, "white");
    }
    public Rectangle(String width, String height) {
        this(Double.parseDouble(width), Double.parseDouble(height));
    }
    public double area() {
        return width * height;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Rectangle [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + ", color=" + color + "]";
    }
}
