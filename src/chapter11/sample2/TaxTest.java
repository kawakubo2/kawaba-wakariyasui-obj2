package chapter11.sample2;

public class TaxTest {
    public static void main(String[] args) {
        int shotoku = 200;
        TaxRate tax = new Tax01();
        double zeigaku = calcTax(shotoku, tax);
        System.out.printf("所得が%d万円の場合、税額は%.2f万円です。%n", shotoku, zeigaku);
    }
    public static double calcTax(int shotoku, TaxRate obj) {
        double r = obj.rate(shotoku);
        return r * shotoku;
    }
}
