package chapter18.sample;

public class AnonimousExample {
    public static void main(String[] args) {
        Predicate p = new Predicate() {
            public boolean test(int n) {
                return n > 100;
            }
        };
        System.out.println(p.test(200));
    }
}
