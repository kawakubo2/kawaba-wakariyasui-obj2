package chapter23.first;

public class Review3C {
    public static void main(String[] args) {
        String pattern = "^[a-z]+$";
        String[] ok = { "friday", "sun", "morning", "trapezoid", "expand", "zzz" };
        String[] ng = { "Friday", "Ironman28", "3pair", "abc-def", "123" };
        System.out.println("---< okパターン >---");
        test(pattern, ok);
        System.out.println("---< ngパターン >---");
        test(pattern, ng);
    }
    public static void test(String pattern, String[] targets) {
        for (String s: targets) {
            System.out.print(s + ": ");
            if (s.matches(pattern)) {
                System.out.println("○");
            } else {
                System.out.println("×");
            }
        }
    }
}
