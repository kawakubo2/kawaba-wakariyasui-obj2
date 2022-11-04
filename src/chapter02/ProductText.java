package chapter02;

import java.time.LocalDate;

public class ProductText {
    public static void main(String[] args) {
        Product p1 = new Product("A100", "XenPad", 35760, LocalDate.of(2016, 9, 16), true);
        Product p2 = new Product("A101", "CoolPad", 22898, LocalDate.of(2016, 7, 8), true);
        Product p3 = new Product("A102", "jPad Pro", 68000, LocalDate.of(2016, 3, 31), true);
        Product p4 = new Product("A103", "jPad Air2", 68000, LocalDate.of(2014, 10, 17), false);
        Product p5 = new Product("A104", "ASUSBook", 32000, LocalDate.of(2015, 9, 19), true);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
    }
}
