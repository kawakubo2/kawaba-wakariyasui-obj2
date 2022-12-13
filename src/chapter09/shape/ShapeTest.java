package chapter09.shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapesA = {
            new Rectangle(20, 5),
            new Circle(5),
            new Triangle(20, 20),
            new Rectangle(10, 10)
        };

        Shape[] shapesB = {
            new Rectangle(10, 5),
            new Circle(10),
            new Triangle(20, 10),
            new Trapezoid(8, 2, 5)
        };
        double totalA = calcTotalArea(shapesA);
        double totalB = calcTotalArea(shapesB);
        System.out.println("Aさんの面積: " + totalA);
        System.out.println("Bさんの面積: " + totalB);
    }
    public static double calcTotalArea(Shape[] shapes) {
        double total = 0;
        for (Shape s: shapes) {
            total += s.area();
        }
        return total;
    }
}
