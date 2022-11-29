package chapter04;

import java.util.Random;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rec = null;
        Random rand = new Random();
        int n = rand.nextInt(3);
        if (n == 0) {
            rec = new Rectangle(100, 200, 30, 40, "blue");
        } else if (n == 1) {
            rec = new Rectangle(150, 300, "yellow");
        } else if (n == 2) {
            rec = new Rectangle(25, 15);
        }
        System.out.println(rec.area());
    }
}
