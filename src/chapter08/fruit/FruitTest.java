package chapter08.fruit;

import java.util.Random;

public class FruitTest {
    public static void main(String[] args) {
        Fruit f = new Banana();
        Random r = new Random();
        if (r.nextBoolean()) {
            f = new Banana();
        } else {
            f = new Apple();
        }
        if (f instanceof Banana b) {
            // Banana b = (Banana)f;
            b.printBanana();
        } else if (f instanceof Apple a) {
            // Apple a = (Apple)f;
            a.printApple();
        }
    }
}
