package chapter11.loose_coupling;

public class ATest {
    public static void main(String[] args) {
        A a = new A(new BSuper());
        a.run();
    }
}
