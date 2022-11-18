package chapter08;

public class Review4 {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle("blue", 10, 20);
        Shape shape2 = new Square("black", 5);

        if (shape1 instanceof Rectangle r) {
            System.out.println(r.getHeight());
        } else {
            System.out.println("Rectangle型ではありません。");
        }
        if (shape2 instanceof Rectangle r) {
            System.out.println(r.getHeight());
        } else {
            System.out.println("Rectangle型ではありません。");
        }
    }
}
