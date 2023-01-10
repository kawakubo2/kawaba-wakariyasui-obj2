package chapter19.first.q19_1;

public class Exec1 {
    public static void main(String[] args) {
        Function f = str -> str.length();
        run("わかりやすいJavaオブジェクト指向編", f);
    }
    public static void run(String s, Function f) {
        System.out.println(f.apply(s));
    }
}
