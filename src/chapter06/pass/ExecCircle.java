package chapter06.pass;

public class ExecCircle {
    public static void main(String[] args) {
        Circle circle = new Circle("blue", 5.5);
        System.out.println("色　=" + circle.getColor());
        System.out.println("半径=" + circle.getRadius());
        System.out.printf("面積=%6.2f%n", circle.area());
    }
}
