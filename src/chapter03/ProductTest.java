package chapter03;

import java.io.IOException;

public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product("A200", "XPS8950", 244800);
        System.out.println(p1);
        try {
            Product p2 = new Product("product.csv");
            System.out.println(p2);
        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
