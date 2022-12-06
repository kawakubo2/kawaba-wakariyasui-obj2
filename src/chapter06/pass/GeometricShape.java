package chapter06.pass;

public class GeometricShape {
    private String color;
    public GeometricShape(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "GeometricShape [color=" + color + "]";
    }
}
