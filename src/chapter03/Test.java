package chapter03;

public class Test {
    private static int n = 100;
    public static void main(String[] args) {
        System.out.println("n=" + n);
        System.out.println();
    }
    public static double bmi(double height, double weight) {
        return weight / Math.pow(height / 100, 2);
    }

    
}
