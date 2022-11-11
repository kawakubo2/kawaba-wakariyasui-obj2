package chapter05;

public class Health {
    private static final double STD_BMI = 22;
    private double weight;
    private double height;
    public Health(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }
    public double getStandardWeight() {
        return STD_BMI * Math.pow(height / 100, 2);
    }
    public double getBmi() {
        return weight / Math.pow(height / 100, 2);
    }
    public static double getStdBmi() {
        return STD_BMI;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
}
