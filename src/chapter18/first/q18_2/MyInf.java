package chapter18.first.q18_2;

public interface MyInf {
    default void test() {
        System.out.println("test");
    }
    static void check() {
        System.out.println("check");
    }
}
