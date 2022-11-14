package chapter06;

public class ExecCircle {
    public static void main(String[] args) {
        Circle circle = new Circle("blue", 5.5);
        System.out.printf("色　=%s%n", circle.getColor());
        System.out.printf("半径=%.1f%n", circle.getRadius());
        System.out.printf("面積=%6.2f%n", circle.area());

        circle.setColor("red");
        System.out.printf("色　=%s%n", circle.getColor());
        System.out.printf("半径=%.1f%n", circle.getRadius());
        System.out.printf("面積=%6.2f%n", circle.area());
    }
}
