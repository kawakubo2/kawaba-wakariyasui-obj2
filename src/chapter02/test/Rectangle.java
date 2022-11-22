package chapter02.test;

public class Rectangle {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    /**
     * 面積を返すメソッド
     * @return 面積
     */
    public double area() {
        return this.width * this.height;
    }
    /**
     * 対角線を返すメソッド
     * @return 対角線
     */
    public double diagonal() {
        return Math.hypot(this.width, this.height);
    }
    /**
     * 外周を返すメソッド
     * @return
     */
    public double perimeter() {
        return (this.width + this.height) * 2;
    }
}
