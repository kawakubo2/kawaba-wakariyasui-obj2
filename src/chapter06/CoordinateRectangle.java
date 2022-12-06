package chapter06;

import chapter04.Rectangle;

public class CoordinateRectangle extends Rectangle {
    public CoordinateRectangle(double x, double y, double width, double height, String color) {
        super(x, y, width, height, color);
    }
    public void move(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
