package chapter03;

public class Area {
    public static double getTriangleArea(double base, double height) {
        return base * height;
    }
    public static void main(String[] args) {
        System.out.println(Area.getTriangleArea(10, 5));
    }
}
