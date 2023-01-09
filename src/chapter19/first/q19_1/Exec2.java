package chapter19.q19_1;

public class Exec2 {
    public static void main(String[] args) {
        Predicate p = s -> s.equals("blue");
        run("blue", p);
        run("red", p);
    }
    public static void run(String color, Predicate p) {
        System.out.println(p.test(color));
    }
}
