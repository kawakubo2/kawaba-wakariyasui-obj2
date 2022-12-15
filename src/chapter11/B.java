package chapter11;

import java.util.Random;

public class B implements IB {
    public void x() {
        System.out.println("B#xメソッド");
    }
    public boolean y() {
        Random r = new Random();
        if (r.nextInt(100) > 20) {
            return true;
        }
        return false;
    }
    public void z() {
        System.out.println("B#zメソッド(完成版)");
    }
}
