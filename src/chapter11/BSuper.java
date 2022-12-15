package chapter11;

import java.util.Random;

public class BSuper implements IB {
    public void x() {
        System.out.println("BSuper#xメソッド");
    }
    public boolean y() {
        Random r = new Random();
        if (r.nextInt(100) > 20) {
            return true;
        }
        return false;
    }
    public void z() {
        System.out.println("B#Super爆速メソッド");
    }
}
