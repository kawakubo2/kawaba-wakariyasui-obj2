package chapter02.sample;

import java.time.LocalDate;

public class Exec {
    public static void main(String[] args) {
        // Product p1 = new Product("A100", "XenPad", 35760, LocalDate.of(2016, 9, 16), true);
        // Product p2 = new Product("A101", "CoolPad", 22898, LocalDate.of(2016, 7, 8), true);
        // Product p3 = new Product("A102", "jPad pro", 68000, LocalDate.of(2016, 3,31), true);
        // Product p4 = new Product("A103", "jPad Air2", 45199, LocalDate.of(2014, 10, 17), false);
        // Product p5 = new Product("A104", "ASUSBook", 32000, LocalDate.of(2015, 9, 19), true);

        Product[] products = {
            new Product("A100", "XenPad", 35760, LocalDate.of(2016, 9, 16), true),
            new Product("A101", "CoolPad", 22898, LocalDate.of(2016, 7, 8), true),
            new Product("A102", "jPad pro", 68000, LocalDate.of(2016, 3,31), true),
            new Product("A103", "jPad Air2", 45199, LocalDate.of(2014, 10, 17), false),
            new Product("A104", "ASUSBook", 32000, LocalDate.of(2015, 9, 19), true)
        };
        for (Product p : products) {
            // System.out.println(p.getName() + "(" + p.getPrice() + "円)");
            System.out.println(p);
        }

        int p1Total = products[0].totalPrice(5);
        System.out.println(p1Total);
    }
}
