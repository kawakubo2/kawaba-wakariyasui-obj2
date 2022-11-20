package chapter11.sample2;

public class Tax01 implements TaxRate {
    public double rate(int shotoku) {
        return shotoku < 100 ? 0.15 : 0.35;
    }
}
