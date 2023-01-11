package chapter23.first;

public class Review3B {
    public static void main(String[] args) {
        String pattern = "^[a-z]{3}-\\d+$";
        String[] ok = { "abc-12345", "xxx-34", "num-33" };
        String[] ng = { "abcd-123", "Abc-123", "a2c-123", "abc-d", "abc-" };
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
