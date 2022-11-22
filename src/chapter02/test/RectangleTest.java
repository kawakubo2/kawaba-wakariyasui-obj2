package chapter02.test;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 3);
        Rectangle r2 = new Rectangle(6, 8);

        System.out.println("--- 長方形1(rec1) ---");
        System.out.printf("面積=%.1f%n", r1.area());
        System.out.printf("対角線=%.1f%n", r1.diagonal());
        System.out.printf("外周=%.1f%n", r1.perimeter());

        System.out.println("--- 長方形2(rec2) ---");
        System.out.printf("面積=%.1f%n", r2.area());
        System.out.printf("対角線=%.1f%n", r2.diagonal());
        System.out.printf("外周=%.1f%n", r2.perimeter());
    }
}
