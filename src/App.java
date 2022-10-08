import java.util.function.DoubleBinaryOperator;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        double d1 = 4.5;
        double d2 = 5.32;
        double answer = a(d1, d2, Math::max);
        System.out.println("answer: " + answer);
    }

    public static double a(double d1, double d2, DoubleBinaryOperator f) {
        return f.applyAsDouble(d1, d2);
    }
}
