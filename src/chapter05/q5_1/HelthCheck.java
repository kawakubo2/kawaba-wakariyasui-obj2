package chapter05.q5_1;

public class HelthCheck {
    private static final double STD_BMI = 22;
    private double weight;
    private double height;
    public HelthCheck(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }
    public double stdWeight() {
        return STD_BMI * Math.pow(height/ 100, 2);
    }
    public double bmi() {
        return weight / Math.pow(height / 100, 2);
    }
    public double getWeight() {
        return weight;
    }
    public double getHeight() {
        return height;
    }
    @Override
    public String toString() {
        return "HelthCheck [weight=" + weight + ", height=" + height + "]";
    }
    
}
