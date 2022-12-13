package chapter09.shape;

public class Trapezoid implements Shape {
    private double upperbase; // 上底
    private double lowerbase; // 下底
    private double height; // 高さ
    public Trapezoid(double upperbase, double lowerbase, double height) {
        this.upperbase = upperbase;
        this.lowerbase = lowerbase;
        this.height    = height;
    }
    public double area() {
        return (upperbase + lowerbase) * height / 2;
    }
    @Override
    public String toString() {
        return "Trapezoid [upperbase=" + upperbase + ", lowerbase=" + lowerbase + ", height=" + height + "]";
    }
}
