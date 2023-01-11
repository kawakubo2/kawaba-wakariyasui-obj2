package chapter23.first;

public class Review3A {
    public static void main(String[] args) {
        String pattern = "^[a-zA-Z].{1,9}$";
        String[] ok = { "a00143", "Bbb1-23", "xxx999"};
        String[] ng = { " a00143", "1abc", "A1234567890" };
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
