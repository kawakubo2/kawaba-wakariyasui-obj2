package chapter23.first;

public class Review4 {
    public static void main(String[] args) {
        String pattern = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\\s).{3,}$";
        String[] ok = { "1Ab", "AB1cd2", "abc123Z", "A1b-c2D", "@@ABC123zzz" }; 
        String[] ng = { "Abcd", "a123", "ABC123", "ABC def 123", " Ab1", "@@Ab 1" }; 
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
