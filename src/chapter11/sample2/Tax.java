package chapter11.sample2;

public class Tax {
    public double tax(int shotoku, TaxRate obj) {
        double r = obj.rate(shotoku);
        return r * shotoku;
    }
}
