package chapter11.loose_coupling;

import java.util.Random;

public class BStub implements IB {
    public void x() {
        System.out.println("BStub#xメソッド");
    }
    public boolean y() {
        Random r = new Random();
        if (r.nextInt(100) > 20) {
            return true;
        }
        return false;
    }
    public void z() {
        System.out.println("BStub#疑似メソッド");
    }
}
