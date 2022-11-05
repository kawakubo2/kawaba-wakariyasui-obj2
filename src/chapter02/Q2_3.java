package chapter02;

import java.time.LocalDate;

public class Q2_3 {
    public static void main(String[] args) {
        Product p1 = new Product("A100", "XenPad", 35760, LocalDate.of(2016, 9, 16), true);
        int price1 = 30000;
        int price2 = 40000;
        System.out.println(p1.isHighPrice(price1));
        System.out.println(p1.isHighPrice(price2));
    }
}
